package co.com.google.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features/PruebaDESIA.Feature",glue="co.com.google.stepsDefinitions",tags="@tag1")

public class PruebaDeSiaRunning {

}
