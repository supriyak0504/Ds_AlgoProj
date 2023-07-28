Feature: Exploring Home Page without Sign-in

  Scenario: User on Home Page, clicks Get Started button under Linked List without sign-in
    Given User is on Home Page
    When User clicks on "Get Started" Button without login
    Then User sees warning "You are not logged in"

 Scenario: User is on Home Page and clicks the dropped down menu without sign-in
   Given User is on Main Page
   When  User clicks on dropdown menu without login
   And User clicks on all the options in the dropdown menu without login
   Then User sees warning "You are not logged in"









