package com.demaut.newtours.test.pages;

import org.junit.Assert;
import java.io.File;
import java.io.IOException;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;



public class NewToursLogin {
	
	ClasePOM Test1;
	WebDriver Pagina;
	WebElement Respuesta,CampoFecha,CampoIP,campoHostName;
	String user="jdordonezn";
	String password="97022602";
	
	@Before
	public void setUp() throws Exception {
		Test1=new ClasePOM();
		Test1.AbirChrome();
		Test1.BuscarPagina("http://www.wechall.net/");
	}
	@After
	public void tearDown() throws Exception {
		Test1.CerrarNavegador();
	}

	@Test
	public void test() {
		Pagina=Test1.iniciarSesion(user,password);
		Assert.assertEquals("[WeChall] WeChall", Pagina.getTitle());
		Test1.BuscarCampoPorXpath("//*[@id='page']/div[2]/div/a");							//Sekeccionar registros de ingresos
		Test1.PresionarClic();
		
		File src= ((TakesScreenshot)Pagina).getScreenshotAs(OutputType.FILE);
		
			try {
				FileUtils.copyFile(src, new File("C:\\Users\\ASUS\\Documents\\Semestre\\Semestre2018_02\\SOPHOS\\Semillero\\RegistroDeEntrada.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("ERROR, no se logro tomar la captura del registro de entradas");
				e.printStackTrace();
			}
		
		CampoFecha=Test1.BuscarCampoPorXpath("//*[@id='page']/table/thead[2]/tr[2]/th[1]");	//Seleccionar campo de fecha de la tabla de registros
		Assert.assertEquals("Fecha",CampoFecha.getText());									//Verificación de contenido campo fecha de la tabla de registros
		CampoIP=Test1.BuscarCampoPorXpath("//*[@id='page']/table/thead[2]/tr[2]/th[2]");	//Seleccionar campo de IP de la tabla de registros
		Assert.assertEquals("IP",CampoIP.getText());										//Verificación de contenido de campo IP de la tabla de registros
		campoHostName=Test1.BuscarCampoPorXpath("//*[@id='page']/table/thead[2]/tr[2]/th[3]");		////Seleccionar campo de Hostname de la tabla de registros
		Assert.assertEquals("Nombre Host",campoHostName.getText());									//Verificación de contenido de Hostaname la tabla de registros
		
		System.out.println("La prueba genero los resultados esperados");
		//fail("Not yet implemented");
	}

}
