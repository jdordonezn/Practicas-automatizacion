package co.com.geelbe.certification.ui;
//Mapeado de pagina de Login de Geelbe.com 

import net.serenitybdd.core.pages.PageObject;			//Librer�a que nos representar una pag�na web como un objeto
import net.serenitybdd.screenplay.targets.Target;		//Librer�a para mapear cada elemento web

public class LoginForm extends PageObject{
	
	public static final Target EMAIL=Target.the("Field of email in the login").locatedBy("//input[@name='email']");
	public static final Target PASSWORD=Target.the("Field of password in the login").locatedBy("//input[@name='pwd']");
	public static final Target BUTTON_lOGIN=Target.the("Field of password in the login").locatedBy("//button[@value='1']");

}
