package co.com.google.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/PruebaList.Feature",glue={"co.com.google.stepsDefinitions"},plugin={"html:Reports","junit:Reports/report.xml","json:Reports/report.json"})

public class PruebaListRunning {

}
