
Feature: Try Editor
 Scenario:Try Editor with valid input
   Given User should able to access try editor link "https://dsportalapp.herokuapp.com/tryEditor"
  When  User enter valid "print\"hello\"" in try editor box
   And   user click on Run button
   Then  User should able to see the output

 # Scenario Outline:Try Editor with data-driven

    # Given User should able to access try editor link "https://dsportalapp.herokuapp.com/tryEditor"
    # When User enter valid "<Code>"in try editor box
    # And   user click on Run button
     # Then  User should able to see the output
    #  Examples:
      #  | Code |
       # |print "hello"|
       #  |InvalidCode |

