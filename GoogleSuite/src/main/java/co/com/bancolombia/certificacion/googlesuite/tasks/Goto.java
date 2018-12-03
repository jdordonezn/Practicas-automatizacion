package co.com.bancolombia.certificacion.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponent;

public class Goto implements Task{

	private Target googleApps;
	
	public Goto(Target googleApps) {
		this.googleApps = googleApps;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		//actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS));
		//actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_TRANSLATE));
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS),
				Click.on(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}

	public static Goto theApp(Target googleApp) {
		return instrumented(Goto.class, googleApp);
	}

}
