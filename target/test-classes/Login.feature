
Feature: Validating login of adactin application 
  I want to use this template for my feature file

 
  Scenario: Validating login with correct username and correct password
    Given User Launch  page on chrome browser
    When user enter "thenukarnan" and "R72S7Q"
    And user click login button
    Then user verifies hello thenukarnan is visible or not
  
    
    Scenario: Validating login with correct username and incorrect password
    Given User Launch  page on chrome browser
    When user enter "thenukarnan" and "R72S7"
    And user click login button
    Then user verifies home page is visible are not
    
    Scenario: Validating login with correct username and correct password
    Given User Launch  page on chrome browser
    When user enter "thenukarnan" and "R72S7Q"
    And user click login button
    Then book hotel using mandatory field
    

 
