package co.com.geelbe.certification.ui;
//Mapeado de pagina de Registro de Geelbe.com

import net.serenitybdd.core.annotations.findby.By;		//Librería utlizada para lozalizar elementos dentro de una pagina web
import net.serenitybdd.core.pages.PageObject;			//Librería que nos representar una pagína web como un objeto
import net.serenitybdd.screenplay.targets.Target;		//Librería para mapear cada elemento web

public class RegisterForm extends PageObject{

	public static final Target FIRSTNAME = Target.the("Field for input the name").located(By.name("name"));
	public static final Target LASTNAME = Target.the("Field for input the name").located(By.name("surname"));
	public static final Target MALE_GENDER = Target.the("Field for input the name").located(By.xpath("//label[@class='required']//span[@class='checkbox radio']"));
	public static final Target FEMALE_GENDER = Target.the("Field for input the name").located(By.xpath("//div[@class='radiogroup']//label[2]//span[1]"));
	public static final Target EMAIL = Target.the("Field for input the name").locatedBy("/html[1]/body[1]/div[3]/form[1]/fieldset[1]/label[3]/input[1]");
	public static final Target PASSWORD = Target.the("Field for input the name").locatedBy("//fieldset[@class='clearfix']//input[@name='pwd']");
	public static final Target PASSWORD_CONFIRM = Target.the("Field for input the name").locatedBy("//input[@name='pwd2']");
	public static final Target TERMS_CONDITIONS = Target.the("Field for input the name").located(By.xpath("//span[@class='checkbox']"));
	public static final Target BUTTON_REGISTER = Target.the("Field for input the name").located(By.name("register"));
	
}
