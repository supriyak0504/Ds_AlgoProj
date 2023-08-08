@ignore
Feature: Data Structure Introduction

   Scenario: User is on Ds portal main page
     Given User is on Home Page
     When User clicks Get Started on Data Structures-Introduction section
     Then User is on "Data Structures-Introduction" page

     Scenario: Time Complexity Page
       Given User is on "Data Structures-Introduction" page
       When User scrolls down the page
       And User clicks on Time Complexity link
       Then User is on "Time Complexity" page and scrolls down page
       And User clicks on "Try here" box button
       Then User goes back on Time Complexity page

       Scenario: Practice Questions
         Given User is on "Data Structures-Introduction" page
         When User clicks on Practice Questions link
         And User is redirected on "Practice Questions" page
         Then User goes back on Data Structures-Introduction/Time Complexity page





