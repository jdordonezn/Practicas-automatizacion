package co.com.geelbe.certification.models;
//Modelo de Datos para realizar la busqueda de un producto en Geelbe.com

public class SearchData {

	private String category;
	private String clothesKind;
	private String name;
	
	//Constructor
	public SearchData(String _category,String _clothesKind,String _name){
		this.category=_category;
		this.clothesKind=_clothesKind;
		this.name=_name;
	}
	
	//Get Methods
	public String getCategory() {
		return category;
	}
	public String getClothesKind() {
		return clothesKind;
	}
	public String getName() {
		return name;
	}
	
	//Set Methods
	public void setCategory(String category) {
		this.category = category;
	}
	public void setClothesKind(String clothesKind) {
		this.clothesKind = clothesKind;
	}
	public void setName(String name) {
		this.name = name;
	}
}
