#Author: your.email@your.domain.com

Feature: Google Translate
  As a web user
  I want to use Google Translate
  to translate words between different languages

  Scenario: Traslate from english to spanish
    Given that susan wants to translate a word
    When she translates the word cheese from English to Spanish
    Then she should see the word queso in the screen
