@All
Feature: Validating login page of FaceBook
@smoke
  Scenario: Validate username and password
    Given user is on facebook application
    When user should enters username and password
      | Name        | Password    |
      | mahibhapaul | pauline     |
     
    And user clicks login button
    Then user need to validate
@Regression
     Scenario: Validate username and password
    Given user is on facebook application
    When user should enters username and password
      | Name        | Password    |
     
      | 14june1987  | 421hgrk128   |
      | gandhi      | q456ghgsbjhf |
    And user clicks login button
    Then user need to validate
  @Sanity  
    Scenario: Validate username and password
    Given user is on facebook application
    When user should enters username and password
      | Name        | Password    |
     
      | 14june198 | 21hgrk128   |
      | gandhie      | 456ghgsbjhf |
    And user clicks login button
    Then user need to validate
  @Smoke  
    Scenario: Validate username and password
    Given user is on facebook application
    When user should enters username and password
      | Name        | Password    |
     
      | 14july1987  | 621hgrk128   |
      | gansdhi      | 456ghegsbjhf |
    And user clicks login button
    Then user need to validate
    