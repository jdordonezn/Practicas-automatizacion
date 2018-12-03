import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Miclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Documents\\Semestre\\Semestre2018_02\\SOPHOS\\Semillero\\Selenium\\geckodriver.exe");
		List<WebElement> elements;
		int cont=0;
		WebDriver myDriver=new FirefoxDriver();
		
		/*
		myDriver= LoginPOM.abrirNavegador();
		//myDriver=LoginPOM.digitarTexto(myDriver, "java");
		myDriver=LoginPOM.digitarTexto(myDriver);
		myDriver=LoginPOM.presionarClic(myDriver);
		LoginPOM.cerrarNavegador(myDriver);
	//	login.abrirNavegador();
		*/
		myDriver.get("http://wechall.net");
		myDriver.findElement(By.name("username")).sendKeys("jdordonezn");	//Ingresar campos de login
		myDriver.findElement(By.name("password")).sendKeys("97022602");
		myDriver.findElement(By.name("login")).click();						//Clic en boton de ingreso
		
		elements=myDriver.findElements(By.className("box_c"));				//Seleccionar elementos web con nombre de clase box_c
		System.out.println("RESPONSE:");			
		for(WebElement i:elements){					
			if(cont==1){													//Seleccionar segundo elemento encontrado
				System.out.println(i.getText());
			}
			cont++;
		}
		
	}

}
