import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MiClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\Semestre\\Semestre2018_02\\SOPHOS\\Semillero\\Selenium\\chromedriver.exe");
		WebDriver Juan=new ChromeDriver();
		WebElement txt;
		Juan.get("http://wechall.net");
		Juan.findElement(By.name("username")).sendKeys("jdordonezn");
		Juan.findElement(By.name("password")).sendKeys("97022602");
		Juan.findElement(By.name("login")).click();
		txt=Juan.findElement(By.className("box_c"));
		
		System.out.println(txt.getText());
		

	}

}
