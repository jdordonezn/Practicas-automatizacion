package co.com.google.stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class BuscarEnGoogleStepDefinitions {
	
	ClasePOM test1=new ClasePOM();
	@Given("Que puedo abrir el navegador")
	public void que_puedo_abrir_el_navegador() {
		test1.AbirChrome();
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("Voy a google y realizo una busqueda")
	public void voy_a_google_y_realizo_una_busqueda() {
		test1.BuscarPagina("http://google.com");
		
	    // Write code here that turns the phrase above into concrete actions
	}

	/*
	@When("Realizo una busqueda")
	public void realizo_una_busqueda() {
		test1.BuscarCampoPorID("lst-ib");
		test1.DigitarTexto("iron man y la realidad");
		test1.PresionarEnter();
	    // Write code here that turns the phrase above into concrete actions
	}

	*/
	@When("Realizo busqueda {string} on google")
	public void realizo_busqueda_on_google(String string) {
	    // Write code here that turns the phrase above into concrete actions
		test1.BuscarCampoPorID("lst-ib");
		test1.DigitarTexto(string);
		test1.PresionarEnter();
	}
	@Then("Valido que el resultado sea el esperado")
	public void valido_que_el_resultado_sea_el_esperado() {
		System.out.println();
		test1.CerrarNavegador();
	    // Write code here that turns the phrase above into concrete actions
	}
}
