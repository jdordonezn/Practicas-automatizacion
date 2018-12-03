package co.com.google.stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import java.util.List;

public class PruebaListStepDefinitions {
	
	/*
	@Given("Tengo la base de datos")
	public void tengo_la_base_de_datos(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<String> users=dataTable.asList();
		System.out.println("Datos como lista:");
		for(int i=3;i<users.size();i++){
			System.out.println(users.get(i)+"\t");
		}
		System.out.println();
	    throw new cucumber.api.PendingException();
	*/
	@Given("Tengo la base de datos")
	public void tengo_la_base_de_datos(List<String> data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		System.out.println("Tabla"+data);
	    throw new cucumber.api.PendingException();
	}

	@When("Ingreso valores")
	public void ingreso_valores() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Valido datos")
	public void valido_datos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
