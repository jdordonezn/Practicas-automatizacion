package co.com.geelbe.certification.ui;
//Mapeado de pagina de Login satisfactorio 

import net.serenitybdd.core.pages.PageObject;		//Librería que nos representar una pagína web como un objeto
import net.serenitybdd.screenplay.targets.Target;	//Librería para mapear cada elemento web

public class LoginSuccessPage extends PageObject{
	public static final Target SIGN_OFF_BUTTON = Target.the("The sign off button").locatedBy("//span[contains(text(),'Salir')]");

}
