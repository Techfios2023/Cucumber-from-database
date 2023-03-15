@LoginFeature
Feature: Techfios billing login page functionality validation

  @Scenario1 @Smoke
  Scenario Outline: User should be able to login with valid credentials
    Given User is on the techfios login page
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User clicks on sign in button
    Then User should land on dashboard page
    And User clicks on bankCash
    And User clicks on newAccount
    And User enters "<accountTitle>" in the "accountTitle" field in accounts page
    And User enters "<description>" in the "description" field in accounts page
    And User enters "<initialBalance>" in the "initialBalance" field in accounts page
    And User enters "<accountNumber>" in the "accountNumber" field in accounts page
    And User enters "<contactPerson>" in the "contactPerson" field in accounts page
    And User enters "<Phone>" in the "Phone" field in accounts page
    And User enters "<internetBankingURL>" in the "internetBankingURL" field in accounts page
    And User clicks on submit
    Then User should be able to validate account created successfully

    Examples: 
      | username          | password | accountTitle | description  | initialBalance | accountNumber | contactPerson | Phone        | internetBankingURL    |
      | demo@techfios.com | abc123   | Abdal        | BankTechFios |      1,000,000 |      12345678 | Sudip         | 214-123-1234 | http://www.google.com |
