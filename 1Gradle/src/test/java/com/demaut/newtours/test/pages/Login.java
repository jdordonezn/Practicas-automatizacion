
package com.demaut.newtours.test.pages;

import org.openqa.selenium.WebDriver;			//Importando componente para manejar el Driver web de Selenium
import org.openqa.selenium.WebElement;			//Importando componente para manejar elementos web de una pagina
import org.openqa.selenium.support.CacheLookup;	//Importando componente para almacenar información volatil en la memoria cache
import org.openqa.selenium.support.FindBy;		//Importando componente para localizar elementos web en una pagina
import org.openqa.selenium.support.How;			//Importando componente para identificación de elementos utilizando el metodo de busqueda @FindBy

/*
 * Clase Login haciendo uso de Page Factory
*/
public class Login {
	WebDriver myDriver;
	
	  
	@FindBy(name="username")	//Busqueda del campo usuario mediante del nombre
	@CacheLookup				//Almacenar el campo usuario en la cache temporalmente mientras se asigna a un espacio fijo
	WebElement username;		//Asignación del campo usuario al elemento web "username"
	
	@FindBy(how=How.XPATH,using="//*[@id='wc_toplogin']/div[2]/input")		//Busqueda del campo contraseña mediante la dirección absoluta 
	@CacheLookup															//Almacenar el campo contraseña en la cache temporalmente mientras se asigna a un espacio fijo	
	WebElement password;													//Asignación del campo contraseña al elemento web "password"
	
	@FindBy(how=How.ID_OR_NAME,using="login")			//Busqueda del boton para iniciar sesion  mediante el nombre o id 
	@CacheLookup										//Almacenar el boton en la cache temporalmente mientras se asigna a un espacio fijo
	WebElement botonIniciarSesion;						//Asignación boton al elemento web "botonIniciarSesion"

	//Inicialización del driver (este ya se encuentra en la pagina de "Incio de Sesion") 
	public Login(WebDriver _myDriver) {					
		myDriver=_myDriver;
		// TODO Auto-generated constructor stub
	}
	
	//Metodo Iniciar Sesion llenando los campos de usuario y contraseña con las variables de entrada.
	public void IniciarSesion(String _user, String _password){		
		username.sendKeys(_user);					
		password.sendKeys(_password);
		botonIniciarSesion.click();
		
	}
	
}
