package co.com.geelbe.certification.tasks;
//Tarea encargada de agregar un elemento al carrito de compra

import static co.com.geelbe.certification.ui.GeelbeClothingFinder.BUTTON_AGGREGATE_CAR;

import net.serenitybdd.screenplay.Actor;			//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Task;				//Librería para indicar una tarea de negocios a nivel superior
import net.serenitybdd.screenplay.actions.Click;	//Metodo para realizar clic sobre un Target dado

public class Aggregate implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {			//Metodo para realizar clic sobre el boton para agregar productos al carrito de compras
		actor.attemptsTo(Click.on(BUTTON_AGGREGATE_CAR));		
	}
	
	public static Aggregate toCar(){							//Metodo para llamar al constructor de la clase
		return new Aggregate();
	}

}
