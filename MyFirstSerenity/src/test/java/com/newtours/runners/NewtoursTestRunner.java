package com.newtours.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="features/loginSerenity.feature",
		glue="com.newtours.stepdefinitions",
		plugin= {"html:target/cucumber-html-report"})
public class NewtoursTestRunner {

}
