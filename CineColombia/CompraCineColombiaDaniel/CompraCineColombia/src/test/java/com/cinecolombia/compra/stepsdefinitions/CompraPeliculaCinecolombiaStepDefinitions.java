package com.cinecolombia.compra.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.cinecolombia.compra.questions.NameMovie;
import com.cinecolombia.compra.tasks.Buy;
import com.cinecolombia.compra.tasks.GoTo;
import com.cinecolombia.compra.tasks.OpenTheBrowser;
import com.cinecolombia.compra.tasks.Select;
import com.cinecolombia.compra.userinterfaces.CineColombiaHomePage;
import com.cinecolombia.compra.userinterfaces.InformOfMovie;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CompraPeliculaCinecolombiaStepDefinitions {

	//Inicializamos el Driver
	@Managed(driver = "Chrome")
	WebDriver hisDriver;
	
	//Definimos el actor para el metodo
	private Actor daniel = Actor.named("Daniel");
	
	//
	private CineColombiaHomePage cineColombiaHomePage;
	
	//
	@Before
	public void setup() {
		daniel.can(BrowseTheWeb.with(hisDriver));
	}
	@Given("^Un cliente puede acceder a la pagina de cinemark$")
	public void unClientePuedeAccederALaPaginaDeCinemark() {
		daniel.wasAbleTo(OpenTheBrowser.at(cineColombiaHomePage));
	    // Write code here that turns the phrase above into concrete actions
	}


	@Given("^Puede acceder al contenido de las peliculas en cartelera$")
	public void puedeAccederAlContenidoDeLasPeliculasEnCartelera() {
		/////////daniel.attemptsTo(GoTo.MoviesInCartelera());
	    // Write code here that turns the phrase above into concrete actions

	}
	
	@When("^Selecciono una pelicula de interes (.*)$")
	public void seleccionoUnaPeliculaDeInteres(String _nameMovie) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("AQUI!------:"+NameMovie.Is(_nameMovie).toString());
		System.out.println("Campo seteado?:"+InformOfMovie.nameMovie.toString());
		daniel.should(seeThat(NameMovie.Is(_nameMovie),equalTo("ANIMALES FANTÁSTICOS: LOS CRÍMENES DE GRINDELWALD - CINE COLOMBIA")));
		
		daniel.attemptsTo(Select.TheMovie(_nameMovie));
		//System.out.println("asdvf:"+NameMovie.Is().toString());
		//daniel.should(seeThat(NameMovie.Is(), equalTo("title="ANIMALES FANTÁSTICOS: LOS CRÍMENES DE GRINDELWALD - CINE COLOMBIA")));

	}


	@Then("^Puedo realizar la compra de la pelicula$")
	public void puedoRealizarLaCompraDeLaPelicula() {
	    // Write code here that turns the phrase above into concrete actions
		daniel.attemptsTo(Buy.TheMovie());
	}
	
	@Then("^Verificar verifico compra$")
	public void verificarVerificoCompra() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

}
