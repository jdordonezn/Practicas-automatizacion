package co.com.geelbe.certification.tasks;
//Tarea encargada  de seleccionar los atributos de un producto dado un modelo de especificaciones

import static net.serenitybdd.screenplay.Tasks.instrumented;		//Metodo estatico para instanciar una tarea
import co.com.geelbe.certification.interactions.SelectAttribute;	//Interacción para seleccionar talla y cantidad
import co.com.geelbe.certification.models.ClothesAttributesData;	//Modelo de datos de los atributos del producto
import net.serenitybdd.screenplay.Actor;							//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Task;								//Librería para indicar una tarea de negocios a nivel superior

public class Select implements Task{

	private ClothesAttributesData atributesData;					//Modelo de datos de los atributos del producto
	
	public Select(ClothesAttributesData _atributesData) {			//Contructor para incializar el modelo de los atributos 
		this.atributesData=_atributesData;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {				//Metodo encargado de seleccionar los atributos talla y cantidad
		actor.attemptsTo(SelectAttribute.as(atributesData.getSize(), atributesData.getQuantity()));
	}
	public static Select AttibutesWith(ClothesAttributesData _atributesData){	//Metodo encargado de llamar al constructor
		return instrumented(Select.class,_atributesData);
	}

}
