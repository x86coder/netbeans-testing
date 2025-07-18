Feature: Welcome Page
    Tests basic welcome screen functionality

Scenario: Load page
    Given I open browser
    When I go to home page
    Then I should see page title as "Walmart Mexico"