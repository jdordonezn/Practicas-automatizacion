package com.demaut.newtours.test.pages;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class NewToursLogin2 {
	ClasePOM test=new ClasePOM();
	WebElement campoResponse;
	@Before
	public void setUp() throws Exception {
		test.AbirChrome();
		test.BuscarPagina("http://newtours.demoaut.com/mercurywelcome.php");
	}

	@After
	public void tearDown() throws Exception {
		campoResponse=test.BuscarCampoPorXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font");
		System.out.println("Respuesta:\n"+campoResponse.getText());
		test.CerrarNavegador();
	}

	@Test
	public void test() {
		test.BuscarCampoPorXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input");
		test.DigitarTexto("jdordonezn");
		test.BuscarCampoPorXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input");
		test.DigitarTexto("97022602");
		test.PresionarEnter();
		fail("Not yet implemented");
	}

}
