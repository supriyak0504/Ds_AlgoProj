Feature: Login Feature

  Scenario:User Sign-in with valid credentials
    Given User is on Sign-in Page
    When User enters "Quality_Pirates_ds_algo" username
    And User enters "ds_algo@2023" password
    And User clicks on login
    Then User is logged in successfully


