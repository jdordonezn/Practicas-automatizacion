package co.com.geelbe.certification.questions;
//Pregunta encargada de retornar el texto del mensaje de bienvenida despues de haberse registrado exitosamente

import co.com.geelbe.certification.ui.RegisterSuccessPage;		//Interfaz de pagina de Registro satisfactorio
import net.serenitybdd.screenplay.Actor;						//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Question;						//Librería para construcción de preguntas que retornan la respuesta del tipo que se especifique
import net.serenitybdd.screenplay.questions.Text;				//Metodo que retorna el contenido en String de un Target

public class RegisterResult implements Question<String>{

	@Override													//Metodo que retorna el texto del mensaje de bienvenida tras haberse registrado
	public String answeredBy(Actor actor) {	
		return Text.of(RegisterSuccessPage.WELCOME_MESSAGE).viewedBy(actor).asString();
	}
	public static RegisterResult isAMessage(){					//Metodo que llama al constructor de la clase		
		return new RegisterResult();
	}

}
