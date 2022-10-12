@smoke
  Feature: user could follow the website pages in different platform
    Scenario: user follow facebook page
      When user click on facebook button
     Then facebook window is opened

    Scenario: user follow twitter page
      When user click on twitter button
      Then twitter window is opened

    Scenario: user follow rss page
      When user click on rss button
      Then rss window is opened

    Scenario: user follow youtube page
      When user click on youtube button
      Then youtube window is opened


