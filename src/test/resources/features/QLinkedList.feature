
Feature: Linked List
  Scenario:Linked List GetStarted
    Given User is on the "home page" after logged in.
    When User click on Get Started button of "Linked List"
  Then User redirected to Linked List  Page

  Scenario:Linked List_Introduction
    Given User is on the Linked List page
    When User click on Introduction Link
    Then User should be directed to "Linked List Introduction" Page

  Scenario:Linked List_Introduction_TryEditor
    Given User is on the LinkedList page
    When User click on Tryhere button on Introduction Link
    Then User should be directed to TryEditor Page

  Scenario:Linked List_Creating Link List
    Given User is on the Linked List page
    When User click on Creating Link List Link
    Then User redirected to "Creating Link List" Page

  Scenario:Linked List_Creating Link List_TryEditor
    Given User is on the Creating Link List page
    When User click on Tryhere button on Creating Link List
    Then User should be directed to Creating Link List

  Scenario:Linked List_Types of Linked List
    Given User is on the Linked List page
    When User click on Types of Linked List Link
    Then User redirected to Types of Linked List Page

  Scenario:Linked List_Linked List_TryEditor
    Given User is on the Linked List page
    When User click on Tryhere button on Linked List
    Then User should be directed to Linked List

  Scenario:Linked List_Implement Linked List in Python
    Given User is on the Linked List page
    When User click on "Implement Linked List in Python" link
    Then User redirected to Implement Linked List in Python page

  Scenario:Linked List_Traversal
    Given User is on the Linked List page
    When User click on Traversal link
    Then User redirected to Traversal page

  Scenario:Linked List_Insertion
    Given User is on the Linked List page
    When User click on Insertion link
    Then User redirected to Insertion page

  Scenario:Linked List_Deletion
    Given User is on the Linked List page
    When User click on Deletion link
    Then User redirected to Deletion page

  Scenario:Linked List_Deletion_TryEditor
    Given User is on the LinkedList page
    When User click on tryhere button on Deletion Link
    Then User should be redirected to TryEditor Page


