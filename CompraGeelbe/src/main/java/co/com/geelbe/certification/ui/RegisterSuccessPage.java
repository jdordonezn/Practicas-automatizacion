package co.com.geelbe.certification.ui;
////Mapeado de pagina de Registro satisfactorio

import net.serenitybdd.core.pages.PageObject;		//Librería que nos representar una pagína web como un objeto
import net.serenitybdd.screenplay.targets.Target;	//Librería para mapear cada elemento web

public class RegisterSuccessPage extends PageObject{
	public static final Target WELCOME_MESSAGE = Target.the("Message of successful register").locatedBy("/html[1]/body[1]/header[1]/div[1]/div[1]/p[1]");
}
