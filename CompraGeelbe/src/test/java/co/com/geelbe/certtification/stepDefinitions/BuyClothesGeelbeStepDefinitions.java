package co.com.geelbe.certtification.stepDefinitions;



import static co.com.geelbe.certtification.stepDefinitions.LoginGeelbeStepDefinitions.juan;				//Realizar llamado a actor que viene de realizar el login 
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;											//Librería para realizar una validación mediante una "QUESTIONS" que a su vez retornan una consecuencia
import java.util.List;																					//Librería para crear y ulilizar de una lista de elementos de cualquier tipo
import static co.com.geelbe.certification.exeptions.NotVisibleShoppingCar.getNotVisibleShoppingCarMessage;//Metodo que retorna un mensaje de no visualizar el carrito de compras tras haber agregado un producto
import static co.com.geelbe.certification.exeptions.FailedAddedToShoppingCar.getFailedAggregateMessage;	//Metodo que retorna un mensaje indicando que ha fallado la agregación de un elemento al carrito de compras 
import static co.com.geelbe.certification.exeptions.IncorrectPrice.getIncorrectPriceMessage;			//Metodo que retorna un mensaje indicando que el precio total del carrito de compras es incorrecto
import static co.com.geelbe.certification.exeptions.NotButtonConfirmPay.getNotButtonConfirmPayMessage;	//Metodo que retorna un mensaje indicando que no es visible el boton de confirmar pago
import co.com.geelbe.certification.exeptions.FailedAddedToShoppingCar;									//Excepción tras haber agregado un elemento al carrito y que dicho elemento no sea visible en el carrito de compras 
import co.com.geelbe.certification.exeptions.IncorrectPrice;											//Excepción de diferencia de precios entre el total y el real (precio unitario por cantidad comprada)
import co.com.geelbe.certification.exeptions.NotButtonConfirmPay;										//Exepción tras haber llenado el formulario de pago y que no aparezca el boton de confirmar pago
import co.com.geelbe.certification.exeptions.NotVisibleShoppingCar;										//Exepción de no ver el carrito de compras tras haber agregado un producto al carrito
import co.com.geelbe.certification.models.SendAndPayData;												//Modelo con datos de envio y forma de pago
import co.com.geelbe.certification.models.ClothesAttributesData;										//Modelo de especificaciones de talla y cantidad del producto
import co.com.geelbe.certification.models.SearchData;													//Modelo que contiene la información para realizar una busqueda (Clase, tipo de producto, nombre)		
import co.com.geelbe.certification.questions.ButtonConfirmPay;											//Pregunta para determinar si es visible el boton de confirmar pago tras haber llenado el formulario de pago
import co.com.geelbe.certification.questions.PictureCar;												//Pregunta para saber si es visible la imagen de, carrito de compras tras haber aggregado un producto al carrito
import co.com.geelbe.certification.questions.PriceBuyed;												//Pregunta para determinar si el precio total que aparece en el carrito coincide con el real
import co.com.geelbe.certification.questions.ProductInCarShopping;										//Pregunta para confirmar que el nombre del producto agregado si este en el carrito de compras
import co.com.geelbe.certification.tasks.Aggregate;														//Tarea encargada de hacer agregar producto al carrito de compras
import co.com.geelbe.certification.tasks.FillFormat;													//Tarea encargada de llenar el formulario de envio y pago del producto
import co.com.geelbe.certification.tasks.Search;														//Tarea encargada de realizar la busqueda del articulo  mediante el modelo de busqueda
import co.com.geelbe.certification.tasks.Select;														//Tarea encargada de realizar la selección de la talla y la cantidad del producto mediante 
import cucumber.api.java.en.Given;																		//Librería de Cucumber para la definición de tareas que corren al incio como precondiciones
import cucumber.api.java.en.Then;																		//Librería de Cucumber para la definición de tareas que van a realizar acciones finales de validaciónn del proceso
import cucumber.api.java.en.When;																		//Librería de Cucumber para la definición de tareas que van a llevar a cabo para obtener un resultado esperado

public class BuyClothesGeelbeStepDefinitions {


	@Given("^that juan search clothes$")
	public void thatJuanSearchClothes(List<SearchData> ModelSearchData) {
		juan.attemptsTo(Search.clothesWith(ModelSearchData.get(0)));							//El actor realiza la busqueda de ropa mediante el modelo entregado como parametro
	}
	
	@When("^he select the attributes$")
	public void heSelectTheAttributes(List<ClothesAttributesData> ModelClothesAtributes) {
		juan.attemptsTo(Select.AttibutesWith(ModelClothesAtributes.get(0)));					//El actor selecciona los los atributos (talla y cantidad) mediante el modelo entregado compo parametro 
	}
		
	@When("^aggregate to shopping car$")
	public void aggregateToShoppingCar() {
		juan.attemptsTo(Aggregate.toCar());																								//El actor agrega el articulo seleccionado al carrito de compras
		juan.should(seeThat(PictureCar.isVisible()).orComplainWith(NotVisibleShoppingCar.class,getNotVisibleShoppingCarMessage()));		//El actor debería ver la imagen del carrito de compras luego de haber agregado el producto al mismo
	}

	@Then("^he should see the product (.*) in the shopping car and the correct price of (.*) total$")
	public void heShouldSeeTheProductInTheShoppingCarAndTheCorrectPriceOfTotal(String _nameProduct, int _quantity) {
		juan.should(seeThat(ProductInCarShopping.isVisible(_nameProduct)).orComplainWith(FailedAddedToShoppingCar.class,getFailedAggregateMessage()));	//El actor debería ver que el nombre del producto aparezca en el carrito de compras
		juan.should(seeThat(PriceBuyed.isCorrect(_quantity)).orComplainWith(IncorrectPrice.class,getIncorrectPriceMessage()));							//El actor debería validar que el precio total de la compra sea el correcto							
	}

	@Then("^so he fill the shipping form and the payment form$")
	public void soHeFillTheShippingFormAndThePaymentForm(List<SendAndPayData> ModelSendAndPay) {
		juan.attemptsTo(FillFormat.ofSendAndPayWith(ModelSendAndPay.get(0)));															//El actor llena el formato de envio y de pago
		juan.should(seeThat(ButtonConfirmPay.isVisible()).orComplainWith(NotButtonConfirmPay.class,getNotButtonConfirmPayMessage()));	//El actor verifica que el boton para confirmar el pago sea visible 
	}
	

}
