package com.cinecolombia.compra.task;

import com.cinecolombia.compra.userinterface.CineColombiaShoppingPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Select implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CineColombiaShoppingPage.PELICULA));		
		
	}

	public static Performable TheMovie() {
		// TODO Auto-generated method stub
		 return Tasks.instrumented(Select.class);
	}

	
	
}
