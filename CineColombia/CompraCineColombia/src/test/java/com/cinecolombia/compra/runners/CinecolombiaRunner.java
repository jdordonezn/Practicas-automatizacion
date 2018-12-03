package com.cinecolombia.compra.runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resource/cinecolombia_compra.feature",
	glue= {"com.cinecolombia.compra.stepdefinitions"},
	snippets= SnippetType.CAMELCASE
		
		
		)
public class CinecolombiaRunner {

}
