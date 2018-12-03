package co.com.bancolombia.certificacion.googlesuite.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.googlesuite.tasks.Goto;
import co.com.bancolombia.certificacion.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.googlesuite.tasks.Translate;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor susan = Actor.named("Susan");
	
	private GoogleHomePage googleTranslate;
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
		//susan.wasAbleTo(OpenTheBrowser.on());
		//susan.wasAbleTo(Goto.theApp());
		susan.wasAbleTo(OpenTheBrowser.on(googleTranslate));
	}

	@When("^she translates the word cheese from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
		susan.wasAbleTo(Translate.the());
	}

	@Then("^she should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {
		
	}
}
