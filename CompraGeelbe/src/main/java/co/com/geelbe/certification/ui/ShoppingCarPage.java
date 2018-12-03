package co.com.geelbe.certification.ui;
//Mapeado de pagina del carrito de compras

import net.serenitybdd.core.pages.PageObject;		//Librería que nos representar una pagína web como un objeto
import net.serenitybdd.screenplay.targets.Target;	//Librería para mapear cada elemento web
import net.serenitybdd.core.annotations.findby.By;	//Librería utlizada para lozalizar elementos dentro de una pagina web

public class ShoppingCarPage extends PageObject{
	public static final Target PICTURES_CAR=Target.the("Picture of shopping cart").locatedBy("//img[@src='https://assets.staticgnt.com/themes/geelbe2018/images/carrito/header.jpg']");
	public static final Target NAME_PRODUCT_BUYED=Target.the("Name class of name articles buyed ").located(By.className("nombre"));
	public static final Target PRODUCT_PRICE=Target.the("Name of class price to articles buyed").located(By.cssSelector(".center.precio"));
	
}
