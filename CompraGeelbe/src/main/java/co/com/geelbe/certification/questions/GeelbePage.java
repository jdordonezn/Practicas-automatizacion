package co.com.geelbe.certification.questions;
//Pregunta para determinar si el boton "toda las prendas"  es visible para el actor

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;	//Metodo que recibe un Target y devuelve el estado del elemento
import co.com.geelbe.certification.ui.GeelbeComponents;						//Interfaz de pagina de Inicio de Geelbe.com
import net.serenitybdd.screenplay.Actor;									//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Question;									//Librería para construcción de preguntas que retornan la respuesta del tipo que se especifique 				


public class GeelbePage implements Question<Boolean>{

	@Override										//Metodo que retorna un true si el boton "toda las prendas"  es visible para el actor, en caso contrario retorna un false
	public Boolean answeredBy(Actor actor) {
		return the(GeelbeComponents.BUTTON_ALL_CLOTHING).answeredBy(actor).isCurrentlyVisible();
	}
	
	public static GeelbePage isVisible(){			//Metodo que llama al constructor de la clase
		return new GeelbePage();
	}

}
