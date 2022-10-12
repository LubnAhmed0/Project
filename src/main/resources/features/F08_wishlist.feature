@smoke
  Feature: user could add items to wishlist
    Scenario: add item to wishlist successfully
      When user clicks on add button
      Then Success message is displayed

      Scenario: add new item
        When user clicks on add button
        And user clicks on wishlist
        Then the quantity number is more than one