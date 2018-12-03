package co.com.geelbe.certification.questions;
//Pregunta para determinar si el boton de confirmar pago es visible para el actor

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;	//Metodo que recibe un Target y devuelve el estado del elemento
import co.com.geelbe.certification.ui.SendAndPayFormat;						//Interfaz de pagina con formulario de envio y pago del producto
import net.serenitybdd.screenplay.Actor;									//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Question;									//Librería para construcción de preguntas que retornan la respuesta del tipo que se especifique 				

public class ButtonConfirmPay implements Question<Boolean>{

	@Override															//Metodo que retorna un true si el boton confirmar pago es visible para el actor, en caso contrario retorna un false 
	public Boolean answeredBy(Actor actor) {							 
		return the(SendAndPayFormat.BUTTON_CONFIRM_PAY).answeredBy(actor).isCurrentlyVisible();
	}
	public static ButtonConfirmPay isVisible(){							//Metodo que llama al constructor de la clase
		return new ButtonConfirmPay();
	}

}
