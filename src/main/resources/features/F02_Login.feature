@smoke
  Feature: users could use login functionality to use their accounts
    Scenario: user could login with valid email and password
      Given user go to login page
      When user login with valid "test@example.com"
      And valid "P@ssword"
      Then user login successfully

    Scenario: user could not login with invalid email and password
      Given user go to the login page
      When user login with invalid "wrong@example.com"
      And the validpass "P@ssword"
      Then user could not login successfully