package co.com.geelbe.certification.questions;
//Pregunta encargda de determinar si la imagen del carrito de compras es visible para el actor

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;			//Metodo que recibe un Target y devuelve el estado del elemento
import co.com.geelbe.certification.ui.ShoppingCarPage;								//Interfaz de la pagina del carrito de compras
import net.serenitybdd.screenplay.Actor;											//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Question;											//Librería para construcción de preguntas que retornan la respuesta del tipo que se especifique
public class PictureCar implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {		//Metodo que retorna un true la imagen del carrito de compras es visible para el actor, en caso contrario retorna un false
		return the(ShoppingCarPage.PICTURES_CAR).answeredBy(actor).isCurrentlyVisible();
	}
	public static PictureCar isVisible(){			//Metodo que llama al constructor de la clase
		return new PictureCar();
	}
	
}
