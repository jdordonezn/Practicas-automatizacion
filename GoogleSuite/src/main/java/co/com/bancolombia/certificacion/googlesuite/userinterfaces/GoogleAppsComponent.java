package co.com.bancolombia.certificacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {

	public static final Target GOOGLE_APPS = Target.the("Google apps button").located(By.id("gbwa"));
	//public static final Target GOOGLE_WINDOWS_EMERGENT= Target.the("Google windows emergent").locatedBy("//*[@id='gbw']/div/div/div[2]/div[4]/div/div/div[2]/div/a[1]");
	public static final Target GOOGLE_TRANSLATE =Target.the("Google Translate Option").locatedBy("//a[@id='gb51']//span[@class='gb_W']");
}
