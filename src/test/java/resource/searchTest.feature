@homepage_search
Feature: Home page search
  As a End user
  I want to search a  product
  So that i can view product

  Scenario: single search
    Given I am on homepage
    When I search for product "Baby"
    Then I should be able to see "Baby" products

Scenario Outline: multiple search
  Given I am on homepage
  When I search for product "<search_Item>"
  Then I should be able to see "<searched_product>" products

  Examples:
  |search_Item|searched_product|
  |  Baby Boy       | Baby Boy               |
  |  Baby Girl         |   Baby Girl         |