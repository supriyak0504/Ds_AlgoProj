
Feature: Array
  Scenario:Array Data Structure
    Given The user is on the home page after logged in "https://dsportalapp.herokuapp.com/home".
    When User click the Array GetStarted button.
    Then The user be directed to "ARRAY" Data Structure Page.

  Scenario: Arrays in Python
    Given The user is on the "Array page" after logged in
    When The user clicks "Arrays in Python" button
    Then The user should be redirected to Arrays in Python page

  Scenario: TryEditor Button Array in Python Page
    Given The user is on the "Array in Python Page" after logged in
    When User click on tryhere button
    Then User redirected to the try editor page

  Scenario:  Arrays Using List
    Given User is on the "Arrays in Python page"
    When User clicks Arrays Using List link
    Then User should be redirected to "Arrays Using List" page

  Scenario: TryEditor Button in "Arrays Using List" Page
    Given User is on the "Arrays Using List"
    When User clicks "Try Here" button
    Then User should be redirected to tryEditor page with Run button

  Scenario:  Basic Operation in Lists
    Given User is on the "Arrays Using List" page
    When User clicks "Basic Operation in Lists" link
    Then User should be redirected to Basic Operation in Lists page

  Scenario: TryEditor Button in "Basic Operation in Lists" Page
    Given User is on the "Basic Operation in Lists"page
    When User clicks "Try Here" button of Basic operation in list page
    Then User redirected to tryEditor page with Run

  Scenario:  Applications of Array
    Given User is on the Basic Operation Lists page
    When User clicks Applications of Array link
    Then User should be redirected to Applications of Array page

  Scenario: TryEditor Button in "Applications of Array" Page
    Given User is on the Applications of Array page
    When User clicks "Try Here" button of Applications of array Page
    Then User redirected to tryEditor page with Run Box

    Scenario: Practice Question
      Given The user is on "Applications on Array" page
      When User clicks Practice Questions link
      Then User should be redirected to Practice page


 # Scenario: Practice Question_Search the array with Run Button
  #  Given The user is on Practice page
   # When User clicks Search the array link
   # Then User should be redirected to Question page
   # And User write the python code after clear the Editor Box
   # And User click the run button
   # Then User able to see python program result at editor output window

  #Scenario: Practice Question_Search the array with Submit Button
  #  Given The user is on Practice page
   # When User clicks Search the array link
   # Then User should be redirected to Question page
   # And User write the python code after clear the Editor Box
   # And User click the Submit button
   # Then User able to see Error massage "error occurred during submission"
