package co.com.google.stepsDefinitions;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class PruebaDeSiaStepDefinitions {
	
	WebElement CampoPlanDeEstudios;
	ClasePOM test1=new ClasePOM();
	
	@Given("Puedo entrar al portal de la UNAL")
	public void puedo_entrar_al_portal_de_la_UNAL() {
		test1.AbirChrome();
	    test1.BuscarPagina("https://siamed.unal.edu.co/academia/");
		// Write code here that turns the phrase above into concrete actions
	    System.out.println("Paso aqui 0");
	}

	@When("Ingreso al buscador de cursos")
	public void ingreso_al_buscador_de_cursos() {
		System.out.println("Paso aqui 1");
		//test1.BuscarCampoPorXpath("//*[@id='menu']");
		test1.BuscarCampoPorXpath("//*[@id=\"5_mod\"]");
		//*[@id="5_mod"]
		test1.PresionarClic();
		System.out.println("Paso aqui 2");
		test1.BuscarCampoPorXpath("//*[@id='5_ser']/a[1]");
		test1.PresionarClic();
		System.out.println("Paso aqui 3");
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("Selecciono como criterio de busqueda el pregrado Ing de Sistemas")
	public void selecciono_como_criterio_de_busqueda_el_pregrado_Ing_de_Sistemas() {
		test1.BuscarCampoPorID("btn_criterio_plan");
		test1.PresionarClic();
		CampoPlanDeEstudios=test1.BuscarCampoPorID("valor_criterio_planestudio_PRE");
		CampoPlanDeEstudios.sendKeys("3520");
		test1.BuscarCampoPorXpath("//*[@id='bloque_crear_criterio_planestudio']/div/div[2]/a");
		test1.PresionarEnter();
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Valido los cursos disponibles")
	public void valido_los_cursos_disponibles() {
		test1.CerrarNavegador();
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("some other action")
	public void some_other_action() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	}



}
