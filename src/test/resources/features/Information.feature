@information
Feature: Information category
  As a user I want see information regarding the application or sales so I am up to date

  @regression
  Scenario: Manuel wants to see the Shipping and Returns information
    Given Manuel is on index page
    When he clicks on Shipping and Returns link
    Then Shipping and Returns information is displayed

  @regression
  Scenario: Manuel wants to see the Privacy Notice information
    Given Manuel is on index page
    When he clicks on Privacy Notice link
    Then Privacy Notice information is displayed

  @regression
  Scenario: Manuel wants to see the Conditions of Use information
    Given Manuel is on index page
    When he clicks on Conditions of Use link
    Then Conditions of Use information is displayed

  @regression
  Scenario: Manuel wants to see the Contact Us information
    Given Manuel is on index page
    When he clicks on Contact Us link
    Then Contact Us information is displayed