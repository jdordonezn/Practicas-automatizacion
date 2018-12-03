package co.com.geelbe.certification.exeptions;
//Excepci�n para controlar si el pc no tiene conexi�n a internet

public class WithoutNetwork extends AssertionError {

	private static final long serialVersionUID = 1L;		//Para evitar InvalidClassException en la deserializaci�n de la clase ya que en tiempo de ejecuci�n de serializaci�n calcular� un serialVersionUID que puede ser diferente
	private static final String ERROR_NETWORK_CONNECTION = "ERROS, without connection to the network";
	
	public static String getErrorNetworkMessage() {			//Metodo para retornar el mensaje de pc sin conexi�n a internet
		return ERROR_NETWORK_CONNECTION;
	}
	
	public WithoutNetwork(String mensage, Throwable causa) {	//Constructor de la exepci�n que recibe mensaje y causa
		super(mensage, causa);
	}
}
