import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPOM {
	public static WebDriver abrirNavegador() {
		WebDriver myDriver=new FirefoxDriver();
		myDriver.get("http://google.com");
		return myDriver;
	}
	public static WebDriver digitarTexto(WebDriver _myDriver,String texto){
		_myDriver.findElement(By.id("lst-ib")).sendKeys(texto);
		return _myDriver;
	}
	public static WebDriver digitarTexto(WebDriver _myDriver){
		_myDriver.findElement(By.id("lst-ib")).sendKeys("c++");
		return _myDriver;
	}
	
	public static WebDriver presionarClic(WebDriver _myDriver){
		_myDriver.findElement(By.name("btnK")).click();
		return _myDriver;
	}
	public static void cerrarNavegador(WebDriver _myDriver) {
		_myDriver.close();
		
	}
}
