package co.com.geelbe.certification.interactions;
//Interacción encargada de buscar un nombre de producto dentro de un catalogo y seleccionarlo cuando lo encuentre

import static net.serenitybdd.screenplay.Tasks.instrumented;		//Metodo estatico para instanciar una tarea
import net.serenitybdd.screenplay.Actor;							//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Interaction;						//Librería pra indicar una interacción del sistema en lugar de una tarea
import net.serenitybdd.screenplay.targets.Target;					//Librería para mapear cada elemento web 

public class SelectProduct implements Interaction{

	private String nameProduct;				//Nombre del producto a buscar
	private Target listProduct;				//Lista de nombres de productos disponibles en catalogo	
	
	public SelectProduct(String _nameProduct, Target _listProduct){	//Constructor para inicializar nombre a buscar y catalogo disponible 
		this.nameProduct=_nameProduct;
		this.listProduct=_listProduct;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		for(int i=0; i <listProduct.resolveAllFor(actor).size(); i++){		//Recorrer todos los productos del catalogo
			if(listProduct.resolveAllFor(actor).get(i).getText().contains(nameProduct)){	//Si el producto contiene el nombre buscado, entonces lo selecciono
				listProduct.resolveAllFor(actor).get(i).click();
				break;														//Salir cuando haya encontrado el producto que buscaba			
			}
		}
	}
	public static SelectProduct withName(String _nameProduct, Target _listProduct){	//Metodo que llama al constructor de la clase
		return instrumented(SelectProduct.class,_nameProduct,_listProduct); 
	}

}
