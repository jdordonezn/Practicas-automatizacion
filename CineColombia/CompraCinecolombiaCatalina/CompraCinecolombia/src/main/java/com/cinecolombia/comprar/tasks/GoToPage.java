package com.cinecolombia.comprar.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.cinecolombia.comprar.userinterfaces.CineColombiaSelectCartelera;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoToPage implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(CineColombiaSelectCartelera.CINECOLOMBIA_CANCEL));
		actor.attemptsTo(Click.on(CineColombiaSelectCartelera.CINECOLOMBIA_SELECT_CARTELERA));
	}
	public static GoToPage theApp() {
		// TODO Auto-generated method stub
		return instrumented(GoToPage.class);
	}
	
	
	
}
