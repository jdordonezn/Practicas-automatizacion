package co.com.geelbe.certification.ui;
//Mapeado de pagina de busqueda de ropa en Geelbe.com 

import org.openqa.selenium.By;						//Librer�a utlizada para lozalizar elementos dentro de una pagina web
import net.serenitybdd.core.pages.PageObject;		//Librer�a que nos representar una pag�na web como un objeto
import net.serenitybdd.screenplay.targets.Target;	//Librer�a para mapear cada elemento web 

public class GeelbeClothingFinder extends PageObject{
	public static final Target HOME_ELEMENTS=Target.the("Button of elements for home").locatedBy("//a[@title='Hogar']");
	public static final Target CLOTHES_FOR_MEN=Target.the("Button of clothes for men").locatedBy("//a[@title='Hombre']");
	public static final Target CLOTHES_FOR_WOMEN=Target.the("Button of clothes for women").locatedBy("//a[@title='Mujer']");
	public static final Target CLOTHES_FOR_CHILDREN=Target.the("Button of clothes for children").locatedBy("//a[@title='Ni�os']");
	public static final Target SPECIFIC_CLOTHES=Target.the("Button for search specific clothes").locatedBy("//input[@placeholder='�buscas algo en especial?']");
	public static final Target LIST_PRODUCTS=Target.the("Name to the class product").located(By.className("analyticsProduct"));
	public static final Target BUTTON_AGGREGATE_CAR=Target.the("Button for aggregate to car").locatedBy("//button[contains(text(),'Agregar al carrito')]");

	//Metodo para realizar el mapeo de una talla dada dentro de una lista desplegable
	public static Target selectSize(String size){
		return Target.the("Select to size of dropdown list").locatedBy("//option[@value='"+size+"']");
	}
	
	//Metodo para realizar el mapeo de la cantidad de productos dentro de una lista desplegable
	public static Target selectQuantity(String quantity){
		return Target.the("Select to quantity of dropdown list").locatedBy("//option[@value='"+quantity+"']");	
	}

}
