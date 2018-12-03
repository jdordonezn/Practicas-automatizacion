#Author: david.ordonez@udea.edu.co

@Register 
Feature: Register in Geelbe.com
    As a web user  
  	I want to register into Geelbe.com

  Scenario Outline: Register with correct data 
    Given that Juan is in the register page of geelbe
    When he enter the data
    	|FirstName	|LastName		| Gender	|Email	| Password	|
    	|<FirstName>|<LastName>	|<Gender>	|<Email>|<Password>	|
    Then he should see the message in the screen
    	|Has ingresado como <FirstName> <LastName>|
    Examples:
        	|FirstName	|LastName	| Gender	|Email							|Password	|
    			|David			|Noriega	|M				|pru3b4@gmail.com		|123456		|
    


