

Feature: Open Homepage of Portal
  Scenario: Home page
    Given The home page opens with the link "https://dsportalapp.herokuapp.com/"
    When User clicks on Get Started intialPage
    Then user is redirected to home page