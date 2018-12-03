package co.com.geelbe.certification.tasks;
//Tarea encargada de llenar el formulario de los datos de envio y pado de los productos contenidos en el carrito de compras

import static net.serenitybdd.screenplay.Tasks.instrumented;		//Metodo estatico para instanciar una tarea
import java.util.HashMap;											//Librería para instanciar un mapa hash
import java.util.Map;												//Librería para incializar y utlizar mapa
import co.com.geelbe.certification.models.SendAndPayData;			//Modelo con datos de envio y forma de pago
import co.com.geelbe.certification.ui.SendAndPayFormat;				//Interfaz con el fomulario de envio y pago de un producto
import net.serenitybdd.screenplay.Actor;							//Librería para invocar un actor que tiene habilidades y permite realizar tarear e interacciones
import net.serenitybdd.screenplay.Task;								//Librería para indicar una tarea de negocios a nivel superior
import net.serenitybdd.screenplay.actions.Click;					//Metodo para realizar clic sobre un Target dado
import net.serenitybdd.screenplay.actions.Enter;					//Metodo para presionar enter sobre un Target dado

public class FillFormat implements Task{

	private Map<String,String> cities=new HashMap<String,String>();  			//Se instancia mapa de ciudades 
	private Map<String,String> departaments=new HashMap<String,String>();		//Se instancia mapa de departamentos	
	private SendAndPayData buyData;												//Modelo de datos de envio y forma de pago
	public FillFormat(SendAndPayData _buyData) {								//Contructor para incializar las claves de las ciudades y departamentos así como el modelo de datos de envio y pago 
		this.buyData=_buyData;
		cities.put("Bogota", "1120");
		cities.put("Medellin", "1429");
		cities.put("Cali", "1265");
		departaments.put("Cundinamarca", "142");
		departaments.put("Antioquia", "146");
		departaments.put("Valle", "152");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {						//Metodo para llenar el formulario de envio y forma de pago 
		actor.attemptsTo(
				//Llenar formulario de Datos de envio
				Enter.theValue(buyData.getAddress()).into(SendAndPayFormat.ADDRESS),
				Click.on(SendAndPayFormat.selectDepartament(departaments.get(buyData.getDepartament()))),
				Click.on(SendAndPayFormat.selectCyty(cities.get(buyData.getCity()))),
				Enter.theValue(buyData.getTelephone()).into(SendAndPayFormat.TELEPHONE),
				Enter.theValue(buyData.getIdentification()).into(SendAndPayFormat.IDENTIFICATION),
				//Llenar formulario de Formas de Datos Pago
				Click.on(SendAndPayFormat.selectTypePay(buyData.getFormPay())),
				Enter.theValue(buyData.getNameTirular()).into(SendAndPayFormat.NAME_TITULAR),
				Enter.theValue(buyData.getNumberCard()).into(SendAndPayFormat.NUMBER_CARD),
				Click.on(SendAndPayFormat.selectTypeCard(buyData.getTypeCard())),
				Click.on(SendAndPayFormat.selectExpirationMonth(buyData.getExpirationMonth())),
				Click.on(SendAndPayFormat.selectExpirationYear(buyData.getExpirationYear())),
				Enter.theValue(buyData.getSecurityCode()).into(SendAndPayFormat.SECURITY_CODE),
				Click.on(SendAndPayFormat.selectDues(buyData.getDues()))
				);
	}
	
	public static FillFormat ofSendAndPayWith(SendAndPayData _buyData){		//Metodo para llamar al constructor de la clase
		return instrumented(FillFormat.class,_buyData);
	}
}
