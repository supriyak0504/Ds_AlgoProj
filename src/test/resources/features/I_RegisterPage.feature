@ignore
Feature: Registration Page

  Scenario Outline: User Registration
    When User clicks on home page button
    When User enters "<Username>" and "<Password>" and "<Password Confirmation>"
    And User clicks on Register button
    Then User is Registered and logged in

    Examples:
      | Username                | Password     | Password Confirmation |
      |                         |              |                       |
      | Quality@#45             |              |                       |
      |                         | Pirates$#45  |                       |
      |                         |              | QualityPirates        |
      | Qualilty123             | Pirates124   |                       |
      | Pirates#4&              |              | Pirates^%6            |
      | Quality_Pirates_ds_algo | ds_algo@2023 | ds_algo@2023          |

