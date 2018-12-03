package co.com.google.stepsDefinitions;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PruebaStepDefinitiosn {

	
	
	@Given("Precondicion")
	public void precondicion() {
	    System.out.println("Realizando precondiciones");
	}

	@When("Realizo acciones")
	public void realizo_acciones() {
		System.out.println("Realizando acciones");
	}

	@Then("Verifico resultados")
	public void verifico_resultados() {
		System.out.println("Verificando Resultados");
	}
	@Then("Verifico resultados no validos")
	public void verifico_resultados_no_validos() {
		System.out.println("Verificando Resultados no validos");
	}
}
