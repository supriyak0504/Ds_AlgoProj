@ignore
Feature: Stack

  Scenario: User is on Ds portal main page
    Given User is on home/Stack page
    When User clicks on Get Started button under Stack section
    Then User is redirected on Stack page

  Scenario: Operations in Stack
    When User click on Operations in Stack link under Topics Covered section
    Then User is redirected on Stack/Operations in Stack
    And User scrolls down on Operations in Stack page
    When User clicks on Try Here button on Operations in Stack page
    Then User is redirected on Try Editor
    And User goes back on Operations in Stack page

  Scenario: Implementation
    Given User is on Stack/Operations in Stack page
    When User clicks on Implementation link under Topics Covered section
    Then User is redirected on Stack/Implementation page
    When User clicks on Try Here button on Implementation page
    Then User is redirected on Try Editor
    And User goes back on Implementation page

  Scenario: Applications
    Given User is on Stack page
    When User clicks on Applications link under Topics Covered section
    Then User is redirected to Stack/Stack-Applications
    When User scrolls down on the Applications page
    Then User is redirected on Try Editor
    And User goes back on Stack page

  Scenario: Practice Questions
    Given User is on Stack page
    Then User clicks on Operations in Stacks link
    When User clicks on Practice Questions link under Stack section
    Then User is redirected on Practice Questions page
    And User goes back on Stack Page




