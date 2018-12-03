package co.com.geelbe.certification.exeptions;
//Excepción para controlar si el producto selecccionado no tiene el tallaje disponible o esta agotado

public class ProductUnable extends AssertionError{

	private static final long serialVersionUID = 1L;		//Para evitar InvalidClassException en la deserialización de la clase ya que en tiempo de ejecución de serialización calculará un serialVersionUID que puede ser diferente
	private static final String PRODUCT_UNABLE= "ERROR, the product selected not is available in the size specific or is drained";
	public static String getProductUnableMessage() {		//Metodo que retorna mensaje de producto no disponible
		return PRODUCT_UNABLE;
	}
	
	public ProductUnable(String message, Throwable cause) {	//Constructor de la exepción que recibe mensaje y causa
		super(message, cause);
	}
}
