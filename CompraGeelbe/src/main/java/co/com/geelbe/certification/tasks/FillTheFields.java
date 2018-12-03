package co.com.geelbe.certification.tasks;
//Tarea encargada de realizar el registro 
import static net.serenitybdd.screenplay.Tasks.instrumented;			//Metodo estatico para instanciar una tarea
import co.com.geelbe.certification.models.RegisterData;					//Modelo para llenar el formulario de registro en Geelbe.com
import co.com.geelbe.certification.ui.RegisterForm;						//Interfaz de pagina de Registro de Geelbe.com
import net.serenitybdd.screenplay.Actor;								//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Task;									//Librería para indicar una tarea de negocios a nivel superior
import net.serenitybdd.screenplay.actions.Click;						//Metodo para realizar clic sobre un Target dado
import net.serenitybdd.screenplay.actions.Enter;						//Metodo para presionar enter sobre un Target dado
import net.serenitybdd.screenplay.conditions.Check;						//Metodo para evaluar una condicion que, retorna un boolean


public class FillTheFields implements Task {

	private RegisterData registerData;									//Modelo con datos para llenar el formulario de registro
	
	public FillTheFields(RegisterData _registerData) {					//Contructor para inicializar el modelo de registro
		this.registerData = _registerData;						
	}
	@Override	
	public <T extends Actor> void performAs(T actor) {					//Metodo para llenar los campos de registro con el modelo dado
		actor.attemptsTo(
				Enter.theValue(registerData.getFirstName()).into(RegisterForm.FIRSTNAME),
				Enter.theValue(registerData.getLastName()).into(RegisterForm.LASTNAME),
				Enter.theValue(registerData.getEmail()).into(RegisterForm.EMAIL),
				Enter.theValue(registerData.getPassword()).into(RegisterForm.PASSWORD),
				Enter.theValue(registerData.getPassword()).into(RegisterForm.PASSWORD_CONFIRM)
				);
		//Condicional para seleccionar el genero del actor
		actor.attemptsTo(Check.whether(registerData.getGender().equals("F")).andIfSo(Click.on(RegisterForm.FEMALE_GENDER)));
		actor.attemptsTo(Check.whether(registerData.getGender().equals("M")).andIfSo(Click.on(RegisterForm.MALE_GENDER)));
		//Aceptar de terminos y condicones
		actor.attemptsTo(
				Click.on(RegisterForm.TERMS_CONDITIONS),
				Click.on(RegisterForm.BUTTON_REGISTER)
				);
		
	}
	public static FillTheFields ofRegisterWith(RegisterData _registerData){	//Metodo encargado de llamar al constructor
		return instrumented(FillTheFields.class,_registerData);
	}

}
