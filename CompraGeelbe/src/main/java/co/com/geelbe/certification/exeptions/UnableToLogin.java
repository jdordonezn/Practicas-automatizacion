package co.com.geelbe.certification.exeptions;
//Excepci�n para controlar si el boton logout no es visible

public class UnableToLogin extends AssertionError{
	
	private static final long serialVersionUID = 1L;		//Para evitar InvalidClassException en la deserializaci�n de la clase ya que en tiempo de ejecuci�n de serializaci�n calcular� un serialVersionUID que puede ser diferente
	private static final String UNABLE_TO_LOGIN = "ERROR, failed login because the logout button not is visible";
	public static String getUnableToLoginMessage() {		//Metodo que retorna mensaje de login fallido
		return UNABLE_TO_LOGIN;
	}
	
	public UnableToLogin(String message, Throwable cause) {	//Constructor de la exepci�n que recibe mensaje y causa
		super(message, cause);
	}
}
