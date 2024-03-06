Feature:

  Scenario: 4 Item per page
    Given I open Demowebshop Start page
    When I push the apparel-shoes button on a webpage header
    Then I click to the "Display per page" dropdown menu
    When I choose 4 Items per page
    Then 4 Items is visible on the page
    And Each item has name
    And Each item has foto
    And Each item has "add to cart" button
    And Each item has rating in stars

  Scenario: 8 Item per page
    Given I open Demowebshop Start page
    When I push the apparel-shoes button on a webpage header
    Then I click to the "Display per page" dropdown menu
    When I choose 8 Items per page
    Then 8 Items is visible on the page
    And Each item has name
    And Each item has foto
    And Each item has "add to cart" button
    And Each item has rating in stars


  Scenario: 12 Item per page
    Given I open Demowebshop Start page
    When I push the apparel-shoes button on a webpage header
    Then I click to the "Display per page" dropdown menu
    When I choose 12 Items per page
    Then 12 Items is visible on the page
    And Each item has name
    And Each item has foto
    And Each item has "add to cart" button
    And Each item has rating in stars




