package co.com.geelbe.certification.ui;
//Mapeado de pagina de Inicio de Geelbe.com

import net.serenitybdd.core.annotations.findby.By;		//Librer�a utlizada para lozalizar elementos dentro de una pagina web
import net.serenitybdd.core.pages.PageObject;			//Librer�a que nos representar una pag�na web como un objeto
import net.serenitybdd.screenplay.targets.Target;		//Librer�a para mapear cada elemento web 

public class GeelbeComponents extends PageObject{
	
	public static final Target LOGIN = Target.the("Button for go to login form").located(By.xpath("//a[contains(text(),'entrar')]"));
	public static final Target REGISTER = Target.the("Button for go to register form").located(By.xpath("//a[@class='button secondary']"));
	public static final Target BUTTON_ALL_CLOTHING = Target.the("Button for see all cloting").located(By.xpath("//a[contains(text(),'Todas')]"));
	
}
