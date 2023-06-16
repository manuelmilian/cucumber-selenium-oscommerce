@search
Feature: Search function
  As a client I want to find some product so I will be able to buy it

  @smoke
  Scenario Outline: Manuel wants to find some product using the quick find option
    Given Manuel is on index page
    When he types "<product>" in the text box of quick find
    And submit the search
    Then a list of keyboards "<answer>" appear

    Examples:
      | product      | answer                           |
      | keyboard     | Microsoft Internet Keyboard PS/2 |
      | mouse        | Microsoft IntelliMouse Explorer  |
      | Blade runner | Blade Runner - Director's Cut    |