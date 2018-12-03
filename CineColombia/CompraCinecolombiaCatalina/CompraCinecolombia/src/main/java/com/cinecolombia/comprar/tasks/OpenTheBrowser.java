package com.cinecolombia.comprar.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.cinecolombia.comprar.tasks.OpenTheBrowser;
import com.cinecolombia.comprar.userinterfaces.CineColombiaHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {
	// Defino el constructor page
	private PageObject page = new CineColombiaHomePage();

	// Constructor para asiganar valor inicial del PageObject
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	@Step("{0} opens the browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
	}

	public static OpenTheBrowser at(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}

}
