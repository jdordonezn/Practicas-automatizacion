package co.com.geelbe.certification.models;
//Modelo de datos para seleccionar atributos del producto a comprar

public class ClothesAttributesData {

	private String size;
	private String quantity;
	
	//Constructor
	public ClothesAttributesData(String _size, String _quantity){
		this.size=_size;
		this.quantity=_quantity;
	}
	
	//Get Methods
	public String getSize() {
		return size;
	}
	public String getQuantity() {
		return quantity;
	}
	
	//Set Methods
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}
