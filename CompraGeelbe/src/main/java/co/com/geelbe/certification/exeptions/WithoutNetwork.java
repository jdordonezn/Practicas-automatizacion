package co.com.geelbe.certification.exeptions;
//Excepción para controlar si el pc no tiene conexión a internet

public class WithoutNetwork extends AssertionError {

	private static final long serialVersionUID = 1L;		//Para evitar InvalidClassException en la deserialización de la clase ya que en tiempo de ejecución de serialización calculará un serialVersionUID que puede ser diferente
	private static final String ERROR_NETWORK_CONNECTION = "ERROS, without connection to the network";
	
	public static String getErrorNetworkMessage() {			//Metodo para retornar el mensaje de pc sin conexión a internet
		return ERROR_NETWORK_CONNECTION;
	}
	
	public WithoutNetwork(String mensage, Throwable causa) {	//Constructor de la exepción que recibe mensaje y causa
		super(mensage, causa);
	}
}
