package co.com.geelbe.certification.questions;
//Pregunta para determinar si el valor total del carrito de compras es igual al real (valor unitario por cantidad)

import co.com.geelbe.certification.ui.ShoppingCarPage;		//Interfaz de la pagina del carrito de compras
import net.serenitybdd.screenplay.Actor;					//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Question;					//Librería para construcción de preguntas que retornan la respuesta del tipo que se especifique
import net.serenitybdd.screenplay.targets.Target;			//Librería para mapear cada elemento web

public class PriceBuyed implements Question<Boolean>{

	private int quantity;									//Cantidad de elementos productos comprados
	private Target listPriceBuyed;							//Lista de precios de productos comprados		
	private double priceUnit=0.0;							//Precio unitario del producto
	private double priceTotal=0.0;							//Precio total cobrado por los productos
	private String strPriceUnit="";							//String de precio unitario del producto
	private String strPriceTotal="";						//String de precio total cobrado por los productos
	 
	public PriceBuyed(int _quantity) {						//Constructor que inicializa la lista de precios y cantidad de productos comprados
		this.quantity=_quantity;
		this.listPriceBuyed=ShoppingCarPage.PRODUCT_PRICE;
	}
	@Override
	public Boolean answeredBy(Actor actor) {		
		for(int i=0;i<listPriceBuyed.resolveAllFor(actor).size();i++){					//Recorrer la lista de precios del carrito de compras
			if(i==0){																	//Precio unitario del producto			
				strPriceUnit=listPriceBuyed.resolveAllFor(actor).get(i).getText();		//Se extrae el String de precio unitario
				priceUnit=redondear(Float.parseFloat(strPriceUnit.replace("$", "")));	//Se eliminan caracteres diferentes a números, se parsea a flotante y se redondea a dos decimales 

			}
			else if(listPriceBuyed.resolveAllFor(actor).get(i).getText().contains("TOTAL A PAGAR")){	//Precio total cobrado por los productos
				strPriceTotal=listPriceBuyed.resolveAllFor(actor).get(i).getText();	//String de precio total cobrado por los productos
				strPriceTotal=strPriceTotal.replace("TOTAL A PAGAR:", "");			//Se eliminan caracteres diferentes a números
				strPriceTotal=strPriceTotal.replace("$", "");						
				priceTotal=redondear(Float.parseFloat(strPriceTotal));				//Se parsea a flotante y se redondea a dos decimales
			}
		}
	
		if((quantity*priceUnit)==priceTotal){			//Condicional de igualdad entre precio unitario y precio total
			return true;
		}
		else{											//En caso contrario el valor total cobrado es incorrecto
			return false;
		}
	}	
		
	
	public static PriceBuyed isCorrect(int _quantity){	//Metodo para llamar al constructor de la clase
		return new PriceBuyed(_quantity);
	}
	
	public static double redondear(double numero)		//Metodo que redondea a dos decimales
	{
	      return Math.rint(numero*1000)/1000;
	}
}
