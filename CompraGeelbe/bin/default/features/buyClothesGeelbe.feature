#Author: david.ordonez@udea.edu.co

Feature: Buy clothes in Geelbe.com
    As a web user registered
  	I want to login in Geelbe.com for search clothes and buy it
	
  Background: Login with correct data 
    Given that Juan is in the login page of geelbe
    When he enter the credentials
			|Email						|Password	|
			|pru3b4@gmail.com	|123456		|
    Then he should see the logout button
  @Buy
  Scenario Outline: Buy in Geelbe.com
    Given that juan search clothes
    	|category  | clothesKind | name		|
    	|<category>|<clothesKind>|<name>  |			
    When he select the attributes
    	| size	| quantity	|
    	| <size>|<quantity>	|
    And aggregate to shopping car 
    Then he should see the product <name> in the shopping cart and the correct price of <quantity> total
    And  so he fill the shipping form and the payment form
    	 |address		| departament	|city		|	telephone	|identification		| formPay	| nameTitular	|numberCard		| typeCard |expirationMonth		| expirationYear	| securityCode	| dues	|
    	 |<address>	| <department>|<city>	|<telephone>|<identification>	|<formPay>|<nameTitular>|<numberCard>	|<typeCard>|<expirationMonth>	|<expirationYear>	|<securityCode>	|<dues>	|
    	    
    Examples: 
      | category  | clothesKind | name  										|	size		| quantity | address					| department	|city	|	telephone	|identification	| formPay	| nameTitular		| numberCard		| typeCard		|expirationMonth	| expirationYear	| securityCode	| dues	|
      | Hombre 		| Relojes			| Apa-Ba Negro - Reebok			| S--A		| 2 			 |Cra 29B No 70-35	|146					|1429	|3002211000	|1026333101			| 20			| David	Noriega	|	10892325435		| MASTERCARD	|5								|	2019						|	9876					|5			|				
      

