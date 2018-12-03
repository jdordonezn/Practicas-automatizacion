package co.com.geelbe.certification.exeptions;
//Metodo para controlar un registro fallido

public class UnableToRegister extends AssertionError {
	
	private static final long serialVersionUID = 1L;		//Para evitar InvalidClassException en la deserialización de la clase ya que en tiempo de ejecución de serialización calculará un serialVersionUID que puede ser diferente
	private static final String UNABLE_TO_REGISTER = "ERROR, failed register";
	
	public static String getUnableToRegisterMessage() {		//Metodo que retorna mesaje de registro fallido
		return UNABLE_TO_REGISTER;
	}
	
	public UnableToRegister(String message, Throwable cause) {	//Constructor de la exepción que recibe mensaje y causa
		super(message, cause);
	}
}
