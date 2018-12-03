package co.com.geelbe.certification.tasks;
//Tarea encargada de abrir el navegador en la pagina dada

import static co.com.geelbe.certification.exeptions.WithoutNetwork.getErrorNetworkMessage;	//Metodo que retorna un mensaje indicando que el equipo no tiene internet
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;				//Librer�a para realizar una validaci�n mediante una pregunta que a su vez retornan una consecuencia
import static net.serenitybdd.screenplay.Tasks.instrumented;				//Metodo estatico para instanciar una tarea
import co.com.geelbe.certification.exeptions.WithoutNetwork;				//Excepci�n para control de equipo sin internet 			
import co.com.geelbe.certification.questions.GeelbePage;					//Pregunta para determinar si fue posible ingresar a la pagina de inicio de Geelbe
import net.serenitybdd.core.pages.PageObject;								//Librer�a que nos representar una pag�na web como un objeto
import net.serenitybdd.screenplay.Actor;									//Librer�a para invocar un actor que tiene habilidades y permite realizar tarear e interacciones			
import net.serenitybdd.screenplay.Task;										//Librer�a para indicar una tarea de negocios a nivel superior
import net.serenitybdd.screenplay.actions.Open;								//Librer�a que permite abrir el navegador				
import net.thucydides.core.annotations.Step;								//Librer�a para indicar un paso en una prueba de aceptaci�n dentro de la prueba					

public class OpenTheBrowser implements Task {

	private PageObject page;												

	public OpenTheBrowser(PageObject page) {								//Constructor para inicializar la pagina
		this.page = page;
	}
	
	@Step("{0} Opens the browser on Geelbes home page ")
	@Override
	public <T extends Actor> void performAs(T actor) {						//Metodo para abrir y validar una pagina dada en el navegador	
		actor.attemptsTo(Open.browserOn(page));						
		actor.should(seeThat(GeelbePage.isVisible()).orComplainWith(WithoutNetwork.class,getErrorNetworkMessage()));
	}
	
	public static OpenTheBrowser on(PageObject page) {						//Metodo para llamar al contructor
		return instrumented(OpenTheBrowser.class, page);
	}
	

}
