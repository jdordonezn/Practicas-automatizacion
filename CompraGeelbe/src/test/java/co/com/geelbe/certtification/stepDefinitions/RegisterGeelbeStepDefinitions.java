package co.com.geelbe.certtification.stepDefinitions;

import static co.com.geelbe.certification.ui.GeelbeComponents.REGISTER;					//Importar el boton de registro de la pagina de inicio de Geelbe.com
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;							//Librería para realizar consultas mediante una "QUESTIONS" que a su vez retornan una consecuencia
import static org.hamcrest.Matchers.equalTo;											//Librería para determinar si hay igualdad entre dos objetos
import java.util.List;																	//Librería para crear y ulilizar de una lista de elementos de cualquier tipo		
import org.openqa.selenium.WebDriver;													//Librería para cargar la pagina web en la ventana del navegador actual	 		
import co.com.geelbe.certification.models.RegisterData;									//Librería que contiene el modelo para llenar el formulario de registro en Geelbe.com
import co.com.geelbe.certification.questions.RegisterResult;							//Librería con pregunta para determinar si aparece el mensaje de registro exitoso luego de haber realizado el registro
import co.com.geelbe.certification.tasks.FillTheFields;									//Librería con tarea encargada de llenar el formulario de registro a partir del modelo de registro
import co.com.geelbe.certification.tasks.GoTo;											//Librería con tarea encargada de hacer clic en el campo de la pagina de incio de Geelbe que se le especifique		
import co.com.geelbe.certification.tasks.OpenTheBrowser;								//Librería con tarea encargada de abrir el navegador en la pagína que le sea entregada como parametro
import co.com.geelbe.certification.ui.GeelbeHomePage;									//Librería que contiene la pagína de inicio de Geelbe.com 
import cucumber.api.java.Before;														//Librería de Cucumber para la definición de tareas que van a ejecutar antes que cualquier otra
import cucumber.api.java.en.Given;														//Librería de Cucumber para la definición de tareas que corren al incio como precondiciones
import cucumber.api.java.en.Then;														//Librería de Cucumber para la definición de tareas que van a realizar acciones finales de validaciónn del proceso 
import cucumber.api.java.en.When;														//Librería de Cucumber para la definición de tareas que van a llevar a cabo para obtener un resultado esperado				
import net.serenitybdd.screenplay.Actor;												//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;								//Librería que permite relacionar a un actor con el webdriver
import net.thucydides.core.annotations.Managed;											//Librería para administrar el webdriver, permite instanciarlo antes del inicio de la prueba y cerrarlo una vez termine

public class RegisterGeelbeStepDefinitions {
	
	@Managed(driver = "chrome")															//Se indica que el driver utilizara el navegador de google chrome
	private WebDriver hisBrowser;														//Se inicializa el driver que será utilizado por el actor
	private Actor juan = Actor.named("juan");											//Se instancia el actor que llevara a cabo las tareas e interacciones
	private GeelbeHomePage geelbeHomePage;												//Inicialización de pagina de incio de geelbe
	@Before
	public void setUp() {
		juan.can(BrowseTheWeb.with(hisBrowser));										//Se le atribuye al actor la capacidad de navegar por la web
	}
	
	@Given("^that Juan is in the register page of geelbe$")
	public void thatJuanIsInTheRegisterPageOfGeelbe() {
		juan.attemptsTo(OpenTheBrowser.on(geelbeHomePage),GoTo.theOption(REGISTER));			//El actor abre en navegador en la pagina de incio de geelbe y realiza clic sobre la opción de registro
	}
	@When("^he enter the data$")
	public void heEnterTheData(List<RegisterData> ListRegister) {
		juan.attemptsTo(FillTheFields.ofRegisterWith(ListRegister.get(0)));						//El actor llena el formulario de registro con el modelo de datos de registro
	}

	@Then("^he should see the message in the screen$")
	public void he_should_see_the_message_in_the_screen(List<String> expectedMessage) {
		juan.should(seeThat(RegisterResult.isAMessage(), equalTo(expectedMessage.get(0))));		//El actor debería ver mensaje de registro satisfactorio tras haberse registrado
	}	
}
