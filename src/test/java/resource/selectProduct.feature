Feature: select product
  As an End user
  I want to select a product
  So that I can view product

  Background: I am on Web page site
    Given I am on homepage
    When I search for product "Baby Jumpsuit"
    Then I should be able to see "Baby Jumpsuit" products

    Scenario: single selection
      Given I am on result page
      When I select any "Baby Jumpsuit"
      Then I should be able to see "Jumpsuit" in detail
      And I should be able to select "0-3 months"

