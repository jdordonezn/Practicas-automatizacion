#Author: your.email@your.domain.com

@tag
Feature: Login in newtours page
  

  @tag1
  Scenario: Login in newtours
    Given The newtours login page
    When I fill the user and password
    And Click the submit button
    Then I access to a new page
