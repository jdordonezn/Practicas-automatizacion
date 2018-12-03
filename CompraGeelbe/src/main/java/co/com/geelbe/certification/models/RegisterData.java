package co.com.geelbe.certification.models;
//Modelo de Datos para realizar el Registro en Geelbe.com

public class RegisterData {

	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String password;
	
	//Constructor
	public RegisterData(String _firstName, String _lastName, String _gender, String _email, String _password){
		this.firstName=_firstName;
		this.lastName=_lastName;
		this.gender=_gender;
		this.email=_email;
		this.password=_password;
	}
	
	//Get Methods
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	
	//Set Methods 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
