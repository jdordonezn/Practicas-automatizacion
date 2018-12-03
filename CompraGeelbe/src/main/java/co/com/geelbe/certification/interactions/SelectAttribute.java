package co.com.geelbe.certification.interactions;
//Interacción encargada de seleccionar la talla y la cantidad de un producto  que sera agregado en el carrito de compras


import static co.com.geelbe.certification.ui.GeelbeClothingFinder.selectQuantity;		//Metodo para seleccionar la cantidad de productos de una lista desplegable
import static co.com.geelbe.certification.ui.GeelbeClothingFinder.selectSize;			//Metodo para seleccionar la talla de un producto 
import static net.serenitybdd.screenplay.Tasks.instrumented;							//Metodo estatico para instanciar una tarea
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;							//Librería para realizar consultas mediante "QUESTIONS" que a su vez retorna una consecuencia	
import static co.com.geelbe.certification.exeptions.ProductUnable.getProductUnableMessage;	//Metodo que retorna mensaje en caso de que la talla del poducto no este disponible o este agotado
import co.com.geelbe.certification.exeptions.ProductUnable;								//Exepción de control si un producto no esta disponible
import co.com.geelbe.certification.questions.Product;									//Pregunta para determinar si la talla del producto esta disponible
import net.serenitybdd.screenplay.Actor;												//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Interaction;											//Librería pra indicar una interacción del sistema en lugar de una tarea									
import net.serenitybdd.screenplay.actions.Click;										//Metodo para realizar clic sobre un Target dado

public class SelectAttribute implements Interaction{

	private String size;										//Talla de producto
	private String quantity;									//Cantidad de productos
			
	public SelectAttribute(String _size, String _quantity) {	//Constructor para inicializar talla y cantidad del producto
		this.size=_size;
		this.quantity=_quantity;
	}
	
	@Override													//Metodo para seleccionar la talla y la cantidad de un producto a comprar
	public <T extends Actor> void performAs(T actor) {
		actor.should(seeThat(Product.isAvailable(size)).orComplainWith(ProductUnable.class,getProductUnableMessage()));
		actor.attemptsTo(
				Click.on(selectSize(size)),
			    Click.on(selectQuantity(quantity))		
			   );
	}
	
	public static SelectAttribute as(String _size, String _quantity){	//Metodo que llama al constructor
		return instrumented(SelectAttribute.class,_size,_quantity);
	}

}
