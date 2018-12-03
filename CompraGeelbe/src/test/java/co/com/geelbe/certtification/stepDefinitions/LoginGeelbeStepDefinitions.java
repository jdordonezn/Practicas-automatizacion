package co.com.geelbe.certtification.stepDefinitions;

import static co.com.geelbe.certification.ui.GeelbeComponents.LOGIN;							//Importar el boton de login de la pagina de inicio de Geelbe.com
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;									//Librería para realizar consultas mediante una "QUESTIONS" que a su vez retornan una consecuencia
import java.util.List;																			//Librería para crear y ulilizar de una lista de elementos de cualquier tipo
import org.openqa.selenium.WebDriver;															//Librería para cargar la pagina web en la ventana del navegador actual	
import static co.com.geelbe.certification.exeptions.UnableToLogin.getUnableToLoginMessage;		//Metodo que retorna el mensaje de la exepción debido a que no fue posible realizar el login satisfactoriamente
import co.com.geelbe.certification.exeptions.UnableToLogin;										//Librería con exepción para identificar si no fue posible realizar el login satisfactoriamente 
import co.com.geelbe.certification.models.LoginData;											//Librería que contiene el modelo para llenar los campos de login
import co.com.geelbe.certification.questions.ButtonLogout;										//Librería con pregunta para saber si es visible el boton logout tras haberse logeado						
import co.com.geelbe.certification.tasks.EnterThe;												//Librería con tarea encargada de llenar los campos email y password del login							
import co.com.geelbe.certification.tasks.GoTo;													//Librería con tarea encargada de hacer clic en el campo de la pagina de incio de Geelbe que se le especifique
import co.com.geelbe.certification.tasks.OpenTheBrowser;										//Librería con tarea encargada de abrir el navegador en la pagína que le sea entregada como parametro
import co.com.geelbe.certification.ui.GeelbeHomePage;											//Librería que contiene la pagína de inicio de Geelbe.com 
import cucumber.api.java.Before;																//Librería de Cucumber para la definición de tareas que van a ejecutar antes que cualquier otra
import cucumber.api.java.en.Given;																//Librería de Cucumber para la definición de tareas que corren al incio como precondiciones
import cucumber.api.java.en.Then;																//Librería de Cucumber para la definición de tareas que van a realizar acciones finales de validaciónn del proceso
import cucumber.api.java.en.When;																//Librería de Cucumber para la definición de tareas que van a llevar a cabo para obtener un resultado esperado
import net.serenitybdd.screenplay.Actor;														//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;										//Librería que permite relacionar a un actor con el webdriver
import net.thucydides.core.annotations.Managed;													//Librería para administrar el webdriver, permite instanciarlo antes del inicio de la prueba y cerrarlo una vez termine

public class LoginGeelbeStepDefinitions {

	@Managed(driver = "chrome")																	//Se indica que el driver utilizara el navegador de google chrome
	private WebDriver hisBrowser;																//Se inicializa el driver que será utilizado por el actor
	public static Actor juan = Actor.named("juan");												//Se instancia el actor que llevara a cabo las tareas e interacciones
	private GeelbeHomePage geelbeHomePage;														//Inicialización de pagina de incio de geelbe
	@Before
	public void setUp() {
		juan.can(BrowseTheWeb.with(hisBrowser));												//Se le atribuye al actor la capacidad de navegar por la web
	}
	
	@Given("^that Juan is in the login page of geelbe$")
	public void thatJuanIsInTheLoginPageOfGeelbe() {
	    juan.attemptsTo(OpenTheBrowser.on(geelbeHomePage),GoTo.theOption(LOGIN));				//El actor abre el navegador en la pagina de inicio de Geelbe.com y hace clic en la opción de login
	}

	@When("^he enter the credentials$")
	public void heEnterTheCredentials(List<LoginData> ListDataLogin) {
		juan.attemptsTo(EnterThe.credential(ListDataLogin.get(0)));								//El actor ingresa las credenciales con el modelo de datos de Login
	}

	@Then("^he should see the logout button$")
	public void heShouldSeeTheLogoutButton() {
		juan.should(seeThat(ButtonLogout.isVisible()).orComplainWith(UnableToLogin.class,getUnableToLoginMessage()));	//El actor debería ver el boton de logout tras haber iniciado sesión
	}

}
