package com.cinecolombia.compra.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.cinecolombia.compra.userinterfaces.CineColombiaCartelera;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Select implements Task{

	private String nameMovie;
	
	public Select(String _nameMovie) {
		this.nameMovie=_nameMovie;
		// TODO Auto-generated constructor stub
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(CineColombiaCartelera.PELICULA));
	}

	public static Performable TheMovie(String _nameMovie) {
		// TODO Auto-generated method stub
		return instrumented(Select.class,_nameMovie);
	}

}
