@smoke
  Feature: user could register with new accounts
    Scenario: user register with valid data successfully
      Given user go to register page
      When user select gender type
      When user enter first name "automation"
      And user enter last name "tester"
      And user enter date of birth
      And user enter email "lamba@test.com"
      And user fills Password field "P@ssword"
      And user fills password field "P@ssword"
      And user clicks on register button
      Then success message is displayed