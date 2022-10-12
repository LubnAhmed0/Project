@smoke
  Feature: user could use search field functionally
    Background: user navigate to search field
    Scenario Outline: user could search using product name
      When user enter "<Name>"
      Then search shows relevant "<results>"
      Examples:
        | Name |results|
        |book  |book   |
        |laptop|laptop |
        |nike  |nike   |
      Scenario Outline: user could search for product using sku
        When user search by "<sku>"
        And opens the product
        Then "<samesku>" appears
        Examples:
        |sku|samesku|
        |SCI_FAITH|SCI_FAITH|
        |APPLE_CAM|APPLE_CAM|
        |SF_PRO_11|SF_PRO_11|