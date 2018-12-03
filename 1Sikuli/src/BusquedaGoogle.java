import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
public class BusquedaGoogle {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		//Cargar el driver de Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\Semestre\\Semestre2018_02\\SOPHOS\\Semillero\\Selenium\\chromedriver.exe");

        //Creación de objetos de la clase patron de pantalla, cargando los archivos en formato imagen
        Screen screen = new Screen();
        Pattern InputTex = new Pattern("Pictures/TextBrow.PNG");	
        Pattern openButton = new Pattern("Pictures/ButtonBrow.PNG");
        Pattern optionJava=new Pattern("Pictures/PictureJava.PNG");
        Pattern optionJavaScripts=new Pattern("Pictures/PictureJavaScript.PNG");
        
        WebDriver daniel = new ChromeDriver();      
        daniel.manage().window().maximize();
        daniel.get("https://www.google.com/");
        

        //Esperar a que aparezca en totalidad los componentes de la ventana
        
        screen.wait(InputTex,10);
        screen.type(InputTex,"java");
        screen.type(InputTex,Key.ESC);
       
        screen.click(openButton);
        screen.click(optionJavaScripts);
        
        
	}

}
