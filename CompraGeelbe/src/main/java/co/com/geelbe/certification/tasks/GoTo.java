package co.com.geelbe.certification.tasks;
//Tarea encargada de ir a la opci�n dada 

import static net.serenitybdd.screenplay.Tasks.instrumented;	//Metodo estatico para instanciar una tarea
import net.serenitybdd.screenplay.Actor;						//Librer�a para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Task;							//Librer�a para indicar una tarea de negocios a nivel superior
import net.serenitybdd.screenplay.actions.Click;				//Metodo para realizar clic sobre un Target dado
import net.serenitybdd.screenplay.targets.Target;				//Librer�a para mapear cada elemento web 

public class GoTo implements Task{

	private Target GeelbeOption;								//Opci�n de pagina de inicio de Geelbe.com
	
	public GoTo(Target _GeelbeOption){							//Constructor que incializa la opci�n
		this.GeelbeOption=_GeelbeOption;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {			//Metodo que hace clic sobre una opci�n dada en la pagina de inicio de Geelbe
		actor.attemptsTo(Click.on(GeelbeOption));
	}
	
	public static GoTo theOption(Target _GeelbeOptions) {		//Metodo que llama al constructor de la clase
		return instrumented(GoTo.class,_GeelbeOptions);
	}
	
	

}
