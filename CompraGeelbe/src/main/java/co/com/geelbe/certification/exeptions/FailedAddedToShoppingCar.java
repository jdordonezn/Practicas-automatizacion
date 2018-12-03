package co.com.geelbe.certification.exeptions;
//Excepción para controlar si un producto no fue agregado al carrito de compras 

public class FailedAddedToShoppingCar extends AssertionError {

	private static final long serialVersionUID = 1L;			//Para evitar InvalidClassException en la deserialización de la clase ya que en tiempo de ejecución de serialización calculará un serialVersionUID que puede ser diferente
	private static final String FAILED_AGGREGATE= "ERROR, the product was not added to Shopping Car";	
	public static String getFailedAggregateMessage() { //Metodo que retorna el mensaje de ERROR en la agregación del prodx	xucto al carrito
		return FAILED_AGGREGATE;
	}
	public FailedAddedToShoppingCar(String message, Throwable cause) { //Constructor de la exepción que recibe mensaje y causa
		super(message, cause);
	}
}
