package co.com.geelbe.certification.exeptions;
//Excepción para controlar si el precio total del carrito no coincide con el real de la cantidad de productos a comprar

public class IncorrectPrice extends AssertionError{

	private static final long serialVersionUID = 1L;			//Para evitar InvalidClassException en la deserialización de la clase ya que en tiempo de ejecución de serialización calculará un serialVersionUID que puede ser diferente
	private static final String INCORRECT_PRICE= "ERROR, price in the shopping car is diferent to real price";
	public static String getIncorrectPriceMessage() {			//Metodo que retorna mensaje de precio incorrecto
		return INCORRECT_PRICE;
	}
	public IncorrectPrice(String message, Throwable cause) {	//Constructor de la exepción que recibe mensaje y causa
		super(message, cause);
	}
}
