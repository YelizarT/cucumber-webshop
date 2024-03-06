Feature:
@gridMode
  Scenario: Checking the display of elements in Grid mode
    Given I open Demowebshop Start page
    When I push the apparel-shoes button on a webpage header
    Given I click to the "View as" dropdown menu to select display mode
    When I selects Grid display mode
    Then Elements are displayed on the page in Grid mode

  Scenario: Checking the display of elements in List mode
    Given I open Demowebshop Start page
    When I push the apparel-shoes button on a webpage header
    Given I click to the "View as" dropdown menu to select display mode
    When I selects List display mode
    Then Elements are displayed on the page in List mode