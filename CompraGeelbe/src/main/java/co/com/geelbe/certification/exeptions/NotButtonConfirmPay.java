package co.com.geelbe.certification.exeptions;
//Excepción para controlar si el boton de confirmación de pago no es visible

public class NotButtonConfirmPay extends AssertionError{

	private static final long serialVersionUID = 1L;			//Para evitar InvalidClassException en la deserialización de la clase ya que en tiempo de ejecución de serialización calculará un serialVersionUID que puede ser diferente
	private static final String NOT_BUTTON_CONFIRM= "ERROR, no is visible the confirm button for pay";
	public static String getNotButtonConfirmPayMessage() {		//Metodo que retorna mensaje de no visualización de bototn para confirmar pago
		return NOT_BUTTON_CONFIRM;
	}
	
	public NotButtonConfirmPay(String message, Throwable cause) { 	//Constructor de la exepción que recibe mensaje y causa
		super(message, cause);
	}
}
