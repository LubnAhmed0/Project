@smoke
Feature: user change currencies
  Scenario: change dollar to euro
    Given user select customer currency
    When user chose Euro
    Then Euro symbol is shown