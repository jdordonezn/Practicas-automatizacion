package co.com.geelbe.certification.tasks;
//Tarea encargada de realizar el ingreso de las credenciales en la pagina de login

import static net.serenitybdd.screenplay.Tasks.instrumented;	//Metodo estatico para instanciar una tarea
import co.com.geelbe.certification.models.LoginData;			//Modelo con datos email y password para realizar login
import co.com.geelbe.certification.ui.LoginForm;				//Interfaz que contiene los campos de login
import net.serenitybdd.screenplay.Actor;						//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Task;							//Librería para indicar una tarea de negocios a nivel superior
import net.serenitybdd.screenplay.actions.Click;				//Metodo para realizar clic sobre un Target dado
import net.serenitybdd.screenplay.actions.Enter;				//Metodo para presionar enter sobre un Target dado

public class EnterThe implements Task{

	private LoginData loginData;								//Modelo de datos con información basica para realizar el login
	
	public EnterThe(LoginData _loginData){						//Constructor inicializa el modelo de datos de login
		this.loginData=_loginData;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {			//Metodo para ingresar el email, contraseña y hacer clic en el boton de ingreso
		actor.attemptsTo(
				Enter.theValue(loginData.getEmail()).into(LoginForm.EMAIL),			
				Enter.theValue(loginData.getPassword()).into(LoginForm.PASSWORD),
				Click.on(LoginForm.BUTTON_lOGIN)
				);
	}	
	
	public static EnterThe credential(LoginData _loginData){	//Metodo para llamar el contructor de la clase
		return instrumented(EnterThe.class,_loginData);
	}

}
