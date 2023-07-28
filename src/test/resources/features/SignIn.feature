Feature:
  Scenario:
    Given User able to access Chrome browser
    When Registered User open URL "https://dsportalapp.herokuapp.com/home"
    And User click on the Sign in button.
    And User enter with valid Username:"sdet" and password:"@sdet123"
    And User click on Login button
    Then User will be redirected to the home page
