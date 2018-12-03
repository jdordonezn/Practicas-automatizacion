package co.com.geelbe.certification.models;
//Modelo de Datos para realizar el Login en Geelbe.com

public class LoginData {
	
	private String email;
	private String password;
	
	//Constructor
	public LoginData(String _email,String _password){
		this.email=_email;
		this.password=_password;
	}
	
	//Get Methods
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	
	//Set Methods 
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
