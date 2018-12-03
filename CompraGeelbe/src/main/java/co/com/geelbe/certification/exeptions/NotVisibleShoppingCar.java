package co.com.geelbe.certification.exeptions;
//Excepción para controlar si el carrito de compras no es visible tras haber realizado una agregación de un producto al mismo

public class NotVisibleShoppingCar extends AssertionError{

	private static final long serialVersionUID = 1L;			//Para evitar InvalidClassException en la deserialización de la clase ya que en tiempo de ejecución de serialización calculará un serialVersionUID que puede ser diferente
	private static final String UNABLE_SHOPPING_CAR= "ERROR, not visible the shopping car";
	public static String getNotVisibleShoppingCarMessage() {	//Metodo que retorna mensaje de no visualización de carrito de compras 
		return UNABLE_SHOPPING_CAR;
	}
	
	public NotVisibleShoppingCar(String message, Throwable cause) {	//Constructor de la exepción que recibe mensaje y causa
		super(message, cause);
	}
}
