package co.com.geelbe.certification.models;
//Modelo de Datos para llenar el formulario de envio y de pago en Geelbe.com

public class SendAndPayData {

	private String address;
	private String departament;
	private String city;
	private String telephone;
	private String identification;
	private String formPay;
	private String nameTitular;
	private String numberCard;	
	private String typeCard;
	private String expirationMonth;
	private String expirationYear;
	private String securityCode;
	private String dues;

	
	//Constructor
	public SendAndPayData(String _address,String _departament,String _city,String _telephone,String _identification,String _formPay,String _nameTitular,String _numberCard,String _typeCard,String _expirationMonth,String _expirationYear,String _securityCode,String _dues){
	
		this.address=_address;
		this.departament=_departament;
		this.city=_city;
		this.telephone=_telephone;
		this.identification=_identification;
		this.formPay=_formPay;
		this.nameTitular=_nameTitular;
		this.numberCard=_numberCard;
		this.typeCard=_typeCard;
		this.expirationMonth=_expirationMonth;
		this.expirationYear=_expirationYear;
		this.securityCode=_securityCode;
		this.dues=_dues;
	}
	
	//Get Methods
	public String getAddress() {
		return address;
	}
	public String getDepartament() {
		return departament;
	}
	public String getCity() {
		return city;
	}
	public String getTelephone() {
		return telephone;
	}
	public String getIdentification() {
		return identification;
	}
	public String getFormPay() {
		return formPay;
	}
	public String getNameTirular() {
		return nameTitular;
	}
	public String getNumberCard() {
		return numberCard;
	}
	public String getTypeCard() {
		return typeCard;
	}
	public String getExpirationMonth() {
		return expirationMonth;
	}
	public String getExpirationYear() {
		return expirationYear;
	}
	public String getSecurityCode() {
		return securityCode;
	}
	public String getDues() {
		return dues;
	}
	
	//Set Methods
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDepartament(String departament) {
		this.departament = departament;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public void setFormPay(String formPay) {
		this.formPay = formPay;
	}
	public void setNameTirular(String nameTirular) {
		this.nameTitular = nameTirular;
	}
	public void setNumberCard(String numberCard) {
		this.numberCard = numberCard;
	}
	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}
	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public void setDues(String dues) {
		this.dues = dues;
	}
}
