package co.com.geelbe.certification.exeptions;
//Excepci�n para controlar si el boton de confirmaci�n de pago no es visible

public class NotButtonConfirmPay extends AssertionError{

	private static final long serialVersionUID = 1L;			//Para evitar InvalidClassException en la deserializaci�n de la clase ya que en tiempo de ejecuci�n de serializaci�n calcular� un serialVersionUID que puede ser diferente
	private static final String NOT_BUTTON_CONFIRM= "ERROR, no is visible the confirm button for pay";
	public static String getNotButtonConfirmPayMessage() {		//Metodo que retorna mensaje de no visualizaci�n de bototn para confirmar pago
		return NOT_BUTTON_CONFIRM;
	}
	
	public NotButtonConfirmPay(String message, Throwable cause) { 	//Constructor de la exepci�n que recibe mensaje y causa
		super(message, cause);
	}
}
