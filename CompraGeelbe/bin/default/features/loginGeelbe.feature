#Author: david.ordonez@udea.edu.co

@Login
Feature: Login in Geelbe.com
    As a web user  
  	I want to login into Geelbe.com

  Scenario: Login with correct data 
    Given that Juan is in the login page of geelbe
    When he enter the credentials
			|Email						|Password	|
			|pru3b4@gmail.com	|123456		|
    Then he should see the logout button

