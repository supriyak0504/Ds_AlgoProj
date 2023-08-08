#@ignore
Feature: Login


  Scenario Outline: Login with different credentials

    Given User clicks on sign in option
    When The user enters the "<Username>" and "<Password>"
    Then The signed in homepage appears

    Examples:
      | Username                | Password     |
      | Dsalgo_123              | ds_aldo123   |
      |                         |              |
      | Dsalgo_1$%23            |              |
      |                         | ds_algo2$%   |
      | Quality_Pirates_ds_algo | ds_algo@2023 |











