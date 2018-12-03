package co.com.geelbe.certtification.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/loginGeelbe.feature",
		glue = "co.com.geelbe.certtification.stepDefinitions",
		snippets = SnippetType.CAMELCASE
)

public class LoginGeelbeRunner {

}
