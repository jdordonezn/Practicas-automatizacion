package co.com.geelbe.certification.tasks;
//Tarea encargada de realizar la busqueda de un producto mediante un modelo que incluye categoría, tipo de producto, y nombre

import static co.com.geelbe.certification.ui.GeelbeClothingFinder.*;	//Iterfaz de pagina para realizar la busqueda de ropa en Geelbe.com 
import static net.serenitybdd.screenplay.Tasks.instrumented;	//Metodo estatico para instanciar una tarea
import org.openqa.selenium.Keys;								//Librería que permite llamar teclas presionables							
import co.com.geelbe.certification.interactions.SelectProduct;	//Interaccion para realizar  la seleccion de un producto por el nombre
import co.com.geelbe.certification.models.SearchData;			//Modelo que contiene la información para realizar una busqueda (Clase, tipo de producto, nombre)
import net.serenitybdd.screenplay.Actor;						//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Task;							//Librería para indicar una tarea de negocios a nivel superior
import net.serenitybdd.screenplay.actions.Click;				//Metodo para realizar clic sobre un Target dado
import net.serenitybdd.screenplay.actions.Enter;				//Metodo para presionar enter sobre un Target dado
import net.serenitybdd.screenplay.conditions.Check;				//Metodo para evaluar una condicion que, retorna un boolean

public class Search implements Task{

	private SearchData searchData;								//Modelo que contiene la información para realizar una busqueda 
	public Search(SearchData _searchData){						//Constructor para incializar modelo de busqueda
		this.searchData=_searchData;
	}	
	@Override
	public <T extends Actor> void performAs(T actor) {			//Metodo encargado de seleccionar categoria ingresar tipo de producto y seleccionar el nombre
		//Condicional para saber a que categoria pertenece el producto buscado
		actor.attemptsTo(Check.whether(searchData.getCategory().equals("Hogar")).andIfSo(Click.on(HOME_ELEMENTS)));
		actor.attemptsTo(Check.whether(searchData.getCategory().equals("Hombre")).andIfSo(Click.on(CLOTHES_FOR_MEN)));
		actor.attemptsTo(Check.whether(searchData.getCategory().equals("Mujer")).andIfSo(Click.on(CLOTHES_FOR_WOMEN)));
		actor.attemptsTo(Check.whether(searchData.getCategory().equals("Niños")).andIfSo(Click.on(CLOTHES_FOR_CHILDREN)));
		//Ingresar tipo de producto y seleccionar el nombre
		actor.attemptsTo(Enter.theValue(searchData.getClothesKind()+Keys.ENTER).into(SPECIFIC_CLOTHES));
		actor.attemptsTo(SelectProduct.withName(searchData.getName(), LIST_PRODUCTS));
	}
	public static Search clothesWith(SearchData _searchData){	//Metodo que llama al constructor	
		return instrumented(Search.class,_searchData);
	}
	
	

}
