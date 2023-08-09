
Feature: Graph

  Scenario: User is on Ds portal main page
    Given User is on home/Graph page
    When User click on Get Started button under Graph
    And User is redirected on Graph page
    Then User clicks on Graph link under Topics Covered section

  Scenario: Graph Page
    Given User is on Graph Page under Graph section
    When User scrolls down on the Graph Page
    And Clicks on Try here button
    Then User is redirected on Try Editor
    And User goes back on Graph Page

  Scenario: Graph Representations
    Given User is on Graph Page
    When User clicks on Graph Representations link on Graph Page
    And Scrolls down on the page
    And Clicks on Try here button
    Then User is redirected on Try Editor
    And User goes back on Graph Page

  Scenario: Practice Questions
    Given User is on Graph Page page
    When User clicks on Practice Questions link
    And User is redirected on "Practice Questions" page
    Then User goes back on Graph Page

    Scenario: Graph Representations link
      Given User is on Graph Page
      When User clicks on Graph Representation link under Topics covered
      And Scrolls down on the page
      And Clicks on Try here button
      Then User is redirected on Try Editor
      And User goes back on Graph Page



