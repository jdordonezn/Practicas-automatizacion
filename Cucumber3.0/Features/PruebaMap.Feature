#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Manejo de DataTables
  Yo quiero realizar una prueba de mapas par ususarios y contraseña

  @tag2
  Scenario Outline: Title of your scenario outline
    Given Dispogo de una Base de Datos
      | username 		| password | 
      | jdordonezn 	| 12324523 | 
      | davidordonez| 00023445 | 
    When Realizo Procedimientos
    Then Valido el resultado

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
