#Author: your.email@your.domain.com

@tag
Feature: buy movie ticket  
I as a user of cinecolombia wish to buy a ticket online


  @tag2
  Scenario Outline: select movie
    Given that malory wants to enter the cinecolombia page
    When select the movie <|pelicula|>    
    Then she can see the purchase option

    Examples: 
      | pelicula  | 
      | name1     |    
      
