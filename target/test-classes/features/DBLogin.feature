@DBLoginFeature
Feature: Techfios billing login page functionality validation FROM SEPTEMBER2022 DATABASE

  @DBScenario1 
  Scenario Outline: User should be able to login with valid credentials
    Given User is on the techfios login page
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User clicks on sign in button
    Then User should land on dashboard page