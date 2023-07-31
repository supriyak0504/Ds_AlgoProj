Feature: Login Feature

  @Verify-login
  Scenario Outline: User Sign-in with valid credentials
    Given User is on Sign-in Page
    When User enters "<Username>" username
    And User enters "<Password>" password
    And User clicks on login
    Then User is logged in successfully
    Examples:
      | Username                | Password     |
      | Quality_Pirates         | ds_algo@     |
      | Quality_Pirates_ds_algo | ds_algo@2023 |


