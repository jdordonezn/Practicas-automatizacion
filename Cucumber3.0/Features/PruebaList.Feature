#Author: david.ordonez@udea.edu.co

@tag
Feature: Manejo de Datatables
  Yo quiero realizar una prueba de listas de ususarios para un Login

  @tag1
  Scenario: Caso exitos de manejo de DataTables
    Given Tengo la base de datos
     	| username 			| password | status  |
      | jdordonez 	 	| 1234567  | success |
      | davidordonez 	| 7123400  | Fail    |
    When  Ingreso valores
    Then Valido datos
    

		