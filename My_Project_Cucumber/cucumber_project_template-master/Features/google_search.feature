Feature: Google Search
  Verify Google Search functionality with several search inputs content.

  Scenario: Google Search with text
    Given The web browser is opened on google home page
    When The user inserts a text sentence in search input element
    Then The google homepage shows searching results
