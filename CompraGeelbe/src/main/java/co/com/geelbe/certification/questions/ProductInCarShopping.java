package co.com.geelbe.certification.questions;
//Pregunta para determinar si el nombre del producto esta en el carrito de compras

import co.com.geelbe.certification.ui.ShoppingCarPage;	//Interfaz de la pagina del carrito de compras
import net.serenitybdd.screenplay.Actor;				//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Question;				//Librería para construcción de preguntas que retornan la respuesta del tipo que se especifique
import net.serenitybdd.screenplay.targets.Target;		//Librería para mapear cada elemento web

public class ProductInCarShopping implements Question<Boolean> {

	Target listProductBuyed;							//Lista de los nombres de los productos en el carrito de compras 
	String nameProduct;									//Nombre del producto a verificar 
	
	public ProductInCarShopping(String _nameProduct) {	//Constructor que incializa la lista de productos comprados y el nombre a verificar
		this.nameProduct=_nameProduct;
		this.listProductBuyed=ShoppingCarPage.NAME_PRODUCT_BUYED;
	}
	@Override
	public Boolean answeredBy(Actor actor) {			//Metodo que retorna true si el nombre del producto esta en el carrito de compras
		for(int i=0;i<listProductBuyed.resolveAllFor(actor).size();i++){	//Recorrer la lista de nombres de productos en el carrito de compras
			if(listProductBuyed.resolveAllFor(actor).get(i).getText().contains(nameProduct)){	
				return true;
			}
		}
		return false;
	}
	public static ProductInCarShopping isVisible(String _nameProduct){		//Metodo que llama al constructor de la clase
		return new ProductInCarShopping(_nameProduct);
	}
}
