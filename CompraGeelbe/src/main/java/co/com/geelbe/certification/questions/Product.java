package co.com.geelbe.certification.questions;
//Pregunta para determinar si la talla del producto esta disponible

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;	//Metodo que recibe un Target y devuelve el estado del elemento
import co.com.geelbe.certification.ui.GeelbeClothingFinder;					//Interfaz de pagina de busqueda de ropa en Geelbe.com 
import net.serenitybdd.screenplay.Actor;									//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Question;									//Librería para construcción de preguntas que retornan la respuesta del tipo que se especifique

public class Product implements Question<Boolean>{

	private String size;								//Talla de producto
	public Product(String _size) {						//Constructor inicializa la talla del producto
		this.size=_size;
	}
	
	@Override											//Metodo que retorna un true si la talla del producto esta disponible, en caso contrario retorna un false 
	public Boolean answeredBy(Actor actor) {
		return the(GeelbeClothingFinder.selectSize(size)).answeredBy(actor).isCurrentlyVisible();
	}
	
	public static Product isAvailable(String _size){	//Metodo que llama al constructor de la clase
		return new Product(_size);
	}

}
