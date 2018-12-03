package co.com.geelbe.certification.exeptions;
//Excepci�n para controlar si un producto no fue agregado al carrito de compras 

public class FailedAddedToShoppingCar extends AssertionError {

	private static final long serialVersionUID = 1L;			//Para evitar InvalidClassException en la deserializaci�n de la clase ya que en tiempo de ejecuci�n de serializaci�n calcular� un serialVersionUID que puede ser diferente
	private static final String FAILED_AGGREGATE= "ERROR, the product was not added to Shopping Car";	
	public static String getFailedAggregateMessage() { //Metodo que retorna el mensaje de ERROR en la agregaci�n del prodx	xucto al carrito
		return FAILED_AGGREGATE;
	}
	public FailedAddedToShoppingCar(String message, Throwable cause) { //Constructor de la exepci�n que recibe mensaje y causa
		super(message, cause);
	}
}
