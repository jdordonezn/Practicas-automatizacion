package com.newtours.stepdefinitions;

import com.newtours.pages.NewToursLoginSteps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NewtoursLoginStepDefinitions {
	
	@Steps
	NewToursLoginSteps login;
	
	@Given("^The newtours login page$")
	public void the_newtours_login_page() {
	    login.openApplication();
	}

	@When("^I fill the user and password$")
	public void i_fill_the_user_and_password() {
		login.writeData();
	}

	@When("^Click the submit button$")
	public void click_the_submit_button() {
		login.sendData();
	}

	@Then("^I access to a new page$")
	public void i_access_to_a_new_page() {
		System.out.println("Accedo como usuario");
	}

}
