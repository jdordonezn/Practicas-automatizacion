package co.com.geelbe.certification.questions;
//Pregunta para determinar si el boton logout es visible para el actor

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;		//Metodo que recibe un Target y devuelve el estado del elemento
import co.com.geelbe.certification.ui.LoginSuccessPage;							//Interfaz de pagina de Login satisfactorio 
import net.serenitybdd.screenplay.Actor;										//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Question;										//Librería para construcción de preguntas que retornan la respuesta del tipo que se especifique

public class ButtonLogout implements Question<Boolean>{

	@Override															//Metodo que retorna un true si el boton logout es visible para el actor, en caso contrario retorna un false 
	public Boolean answeredBy(Actor actor) {
		return the(LoginSuccessPage.SIGN_OFF_BUTTON).answeredBy(actor).isCurrentlyVisible();
	}
	public static ButtonLogout isVisible() {							//Metodo que llama al constructor de la clase
		return new ButtonLogout();
	}

}
