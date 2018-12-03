package co.com.geelbe.certification.ui;
//Mapeado de pagina con formulario de envio y pago del producto

import net.serenitybdd.core.pages.PageObject;		//Librería que nos representar una pagína web como un objeto
import net.serenitybdd.screenplay.targets.Target;	//Librería para mapear cada elemento web

public class SendAndPayFormat extends PageObject{
	public static final Target ADDRESS = Target.the("Field of address").locatedBy("//input[@id='address']");
	public static final Target TELEPHONE = Target.the("Field of telephone").locatedBy("//input[@id='tel']");
	public static final Target IDENTIFICATION = Target.the("Field for document of identification").locatedBy("//input[@id='doc']");
	public static final Target NAME_TITULAR = Target.the("Field for titular name").locatedBy("//input[contains(@name,'PayUTarjeta[name]')]");
	public static final Target NUMBER_CARD = Target.the("Field for card number").locatedBy("//input[contains(@name,'PayUTarjeta[number]')]");
	public static final Target SECURITY_CODE = Target.the("Field for securuty code").locatedBy("//input[contains(@title,'Entre 3 y 4 digitos')]");
	public static final Target BUTTON_CONFIRM_PAY = Target.the("Button for confirm pay").locatedBy("//div[@id='confirmar']//button[@type='submit'][contains(text(),'Pagar')]");

	//Metodo para realizar el mapeo de un departamento dado dentro de una lista desplegable
	public static Target selectDepartament(String _departament){
		return Target.the("Select Departament of dropdown list").locatedBy("//option[contains(@value,'"+_departament+"')]");
	}
	//Metodo para realizar el mapeo de una ciudad dada dentro de una lista desplegable
	public static Target selectCyty(String _city){
		return Target.the("Select City of dropdown list").locatedBy("//option[contains(@value,'"+_city+"')]");
	}
	//Metodo para realizar el mapeo de la forma de pago a partir de una lista de radiobuttons
	public static Target selectTypePay(String _formPay){
		return Target.the("Radiobutton for select pay form").locatedBy("//span[contains(@class,'checkbox radio')]//input[contains(@value,'"+_formPay+"')]");
	}
	//Metodo para realizar el mapeo del tipo de tarjeta en una lista desplegable
	public static Target selectTypeCard(String _typeCard){
		return Target.the("Select typeCard of dropdown list").locatedBy("//option[contains(@value,'"+_typeCard+"')]");
	}
	//Metodo para realizar el mapeo del mes de expiración de la tarjeta en lista desplegable
	public static Target selectExpirationMonth(String _expirationMonth){
		return Target.the("Select expiration month of dropdown list").locatedBy("//select[contains(@name,'PayUTarjeta[expiration][1]')]//option[contains(@value,'"+_expirationMonth+"')][contains(text(),'"+_expirationMonth+"')]");
	}
	//Metodo para realizar el mapeo del año de expiración de la tarjeta en lista desplegable
	public static Target selectExpirationYear(String _expirationYear){
		return Target.the("Select expiration year of dropdown list").locatedBy("//select[contains(@name,'PayUTarjeta[expiration][0]')]//option[contains(@value,'"+_expirationYear+"')][contains(text(),'"+_expirationYear+"')]");
	}
	//Metodo para realizar el mapeo del número de cuotas en lista desplegable
	public static Target selectDues(String _dues){
		return Target.the("Select dues number of dropdown list").locatedBy("//select[contains(@name,'PayUTarjeta[installments]')]//option[contains(@value,'"+_dues+"')][contains(text(),'"+_dues+"')]");
	}
	

	
}
