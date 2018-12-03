package co.com.google.stepsDefinitions;

import java.util.HashMap;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class PruebaMapStepDefinitions {
	private Map<String,String > mapaBD=new HashMap<String,String >();
	private String user1="jdordonezn";
	private String pass2="00023445";
	private String user2="root";
	@Given("Dispogo de una Base de Datos")
	public void dispogo_de_una_Base_de_Datos(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		mapaBD=dataTable.asMap(String.class, String.class);
		System.out.println("Dsotos como mapa:"+mapaBD);
		System.out.println("Contraseña de usuario->"+user1+":"+mapaBD.get(user1));
		System.out.println("Existe el usuario->"+user2+":"+mapaBD.containsKey(user2));
		System.out.println("Existe la contraseña->"+pass2+":"+mapaBD.containsValue(pass2));
		
	    throw new cucumber.api.PendingException();
    
	}

	@When("Realizo Procedimientos")
	public void realizo_Procedimientos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Valido el resultado")
	public void valido_el_resultado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	    
	    
	}

}
