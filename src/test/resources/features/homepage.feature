#Feature: Account Holder withdraws cash
#
#Scenario: Account has sufficient funds
#    Given The account balance is $100
#      And the card is valid
#      And the machine contains enough money
#     When the Account Holder requests $20
#     Then the ATM should dispense $20
#      And the account balance should be $80
#      And the card should be returned


  Feature: Open Homepage of Portal
    Scenario: Home page
      Given The home page opens with the link "https://dsportalapp.herokuapp.com/home"
      When user clicks get started without registration
      Then user is redirected to home page
