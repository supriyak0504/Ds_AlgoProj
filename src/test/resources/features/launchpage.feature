#Feature: Account Holder withdraws cash
#
#Scenario: Account has sufficient funds

  #Pre-Condition
#    Given The account balance is $100

  #Actions
#      And the card is valid
#      And the machine contains enough money
#     When the Account Holder requests $20

  #Assertion
#     Then the ATM should dispense $20
#      And the account balance should be $80
#      And the card should be returned


  Feature: Launch Page of ds-algo

    @Verify-getStared
    Scenario: User Launch Home Page of an ds-algo project
      Given User opens "https://dsportalapp.herokuapp.com/" link
      When User clicks on "Get Started" Button
      Then User is redirected to homepage



