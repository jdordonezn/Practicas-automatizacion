package com.cinecolombia.compra.stepdefinitions;


import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.cinecolombia.compra.questions.TheMovieIs;
import com.cinecolombia.compra.task.OpenThePage;
import com.cinecolombia.compra.task.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class CinecolombiaStepDefinitions {
	
	@Managed (driver="Chrome")
	private WebDriver herBrowser;
	private Actor malory= Actor.named("Malory");
	
	
	@Before 
	public void ConfiguracionInicial(){
		malory.can(BrowseTheWeb.with(herBrowser));
		
	}
	
	@Test	
	
	
	@Given("^that malory wants to enter the cinecolombia page$")
	public void that_malory_wants_to_enter_the_cinecolombia_page(){
		malory.wasAbleTo(OpenThePage.TheCineColombiaPage());
	}


	@When("^select the movie (.*)$")
	public void select_the_movie(String pelicula)  {
		malory.attemptsTo(Select.TheMovie());
	
	}

	@Then("^she can see the purchase option$")
	public void she_can_see_the_purchase_option()  {
		malory.should(seeThat(TheMovieIs.displayed(),equalTo("ATAQUE SUBMARINO")));
	}



}
