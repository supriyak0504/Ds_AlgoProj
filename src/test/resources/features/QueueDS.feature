Feature: Queue Data Structure
  Scenario: Queue DS Home Page
    Given User is on the SignedIn Home Page
    When User Clicks on "Get Started" button on Queue Data Structure
    Then The queue page appears

  Scenario: Implementation of Queue in Python
      When User clicks on Implementation of Queue in python
      Then The Implementation of Queue in python page opens
      And User clicks on Try here button
      Then the text editor opens and user gives python code
      And User clicks on Run Button
      Then The output is displayed

    Scenario:Implementation Using collections.deque

    When User clicks on implementation using collections.deque
    Then The implementation using collections.deque page opens
    And User clicks on Try here button
      Then the text editor opens and user gives python code
      And User clicks on Run Button
      Then The output is displayed

  Scenario: Implementation using array

    When User clicks on implementation using array
    Then The implementation using array page opens
    And User clicks on Try here button
    Then the text editor opens and user gives python code
    And User clicks on Run Button
    Then The output is displayed

  Scenario: Queue Operations

    When User clicks on Queue Operations
    Then The Queue Operations page opens
    And User clicks on Try here button
    Then the text editor opens and user gives python code
    And User clicks on Run Button
    Then The output is displayed

  Scenario: Practice Questions

    When User clicks on Practice Questions
    Then The Practice Questions Page Opens And User navigates back to queue operations
    Then User clicks on NumpyNinja And Main HomePage Displays
    And User clicks on main page Get Started



