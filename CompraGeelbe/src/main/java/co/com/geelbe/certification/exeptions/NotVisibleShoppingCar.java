package co.com.geelbe.certification.exeptions;
//Excepci�n para controlar si el carrito de compras no es visible tras haber realizado una agregaci�n de un producto al mismo

public class NotVisibleShoppingCar extends AssertionError{

	private static final long serialVersionUID = 1L;			//Para evitar InvalidClassException en la deserializaci�n de la clase ya que en tiempo de ejecuci�n de serializaci�n calcular� un serialVersionUID que puede ser diferente
	private static final String UNABLE_SHOPPING_CAR= "ERROR, not visible the shopping car";
	public static String getNotVisibleShoppingCarMessage() {	//Metodo que retorna mensaje de no visualizaci�n de carrito de compras 
		return UNABLE_SHOPPING_CAR;
	}
	
	public NotVisibleShoppingCar(String message, Throwable cause) {	//Constructor de la exepci�n que recibe mensaje y causa
		super(message, cause);
	}
}
