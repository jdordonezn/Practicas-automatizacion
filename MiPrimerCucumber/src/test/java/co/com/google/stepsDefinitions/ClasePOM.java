package co.com.google.stepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.runtime.Timeout;

import org.openqa.selenium.Keys;



public class ClasePOM {
	
	
	private WebDriver myDriver;
	//WebDriverWait wait1 = new WebDriverWait(myDriver,10);
	private WebElement myElement;
	private boolean CampoEncontrado;
	
	
	
	public void AbirChrome(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\Semestre\\Semestre2018_02\\SOPHOS\\Semillero\\Selenium\\chromedriver.exe");
		myDriver=new ChromeDriver();
		myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void AbrirMozilla(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Documents\\Semestre\\Semestre2018_02\\SOPHOS\\Semillero\\Selenium\\geckodriver.exe");
		myDriver=new FirefoxDriver();
	}
	public void BuscarPagina(String _url){
		myDriver.get(_url);
	}
	//Metodo para realizar busqueda de campo por ID, en caso de no encontrar se captura por medio de una exepción captura 
	public WebElement BuscarCampoPorID(String _id){
		try {
			//myDriver.wait(15000);
			//myElement=myDriver.findElement(By.id(_id)).then(function(){driver.sleep(5000)});
			//myElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(_id)));
			
			myElement=myDriver.findElement(By.id(_id));
		} catch (Exception e) {
			// TODO: handle exception
			CampoEncontrado=false;
			System.out.println("ERROR, Elemento no encontrado");
		}
		return myElement;
	}
	
	public WebElement BuscarCampoPorNombre(String _name){
		myElement=myDriver.findElement(By.id(_name));
		if(myElement.equals(null)){
			CampoEncontrado=false;
		}
		else{
			CampoEncontrado=true;
		}
		return myElement;
	}
	public WebElement BuscarCampoPorXpath(String _xpath){
		try {
			myElement=myDriver.findElement(By.xpath(_xpath));
		} catch (Exception e) {
			// TODO: handle exception
			CampoEncontrado=false;
			System.out.println("ERROR, Elemento no encontrado");
		}
		return myElement;
	}
	
	public void DigitarTexto(String _textoABuscar){
		if(CampoEncontrado){
			myElement.sendKeys(_textoABuscar);
		}
		else{
			System.out.println("ERROR, No es posible digitar texto en campo inexistente");
		}
	}
	
	public void PresionarEnter(){
		if(CampoEncontrado){
			myElement.sendKeys(Keys.ENTER);
		}
		else{
			System.out.println("ERROR, No es posible presionar enter en campo inexistente");
		}
	}
	public void PresionarClic(){
		if(CampoEncontrado){
			myElement.click();
		}
		else{
			System.out.println("ERROR, No es posible presionar clic en campo inexistente");
		}
	}
	

	public void CerrarNavegador(){
		myDriver.close();
	}
	
/*	public WebDriver iniciarSesion(String _user, String _password){
		Login myLogin=PageFactory.initElements(myDriver, Login.class);	//Creacion de objeto mediante Page Factory 
		myLogin.IniciarSesion(_user, _password);						//Llamada del metodo iniciar sesion de la clase Login
		return myDriver;
	}
*/
	public ClasePOM() {
		
		myElement=null;
		CampoEncontrado=true;
		// TODO Auto-generated constructor stub
	}
	public ClasePOM(WebDriver _myDriver) {
		myDriver=_myDriver;
		myElement=null;
		CampoEncontrado=true;
		// TODO Auto-generated constructor stub
	}

}
