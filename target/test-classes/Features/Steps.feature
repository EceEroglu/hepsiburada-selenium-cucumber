Feature: Full scenario

  @E2E @Positive @Functional
  Scenario: Add catproduct to cart less than 75

    Given I am on MainPage
    When I click on Login
    And I enter email
    And I enter password
    And I click on login button
    Then I logged in
    When I search catproduct
    And I click on the catproduct
    And I add product to cart
    And I go to cart
    Then I verify catproduct is on the cart
    Then I verify cargo is not free for catproduct
    Then I verify cargo free option price for catproduct


  @E2E @Positive @Functional
  Scenario: Add vacuumcleanerproduct to cart greater than 75

    Given I am on MainPage
    When I click on Login
    And I enter email
    And I enter password
    And I click on login button
    Then I logged in
    When I search vacuumcleanerproduct
    And I click on the vacuumcleanerproduct
    And I add product to cart
    And I go to cart
    Then I verify vacuumcleanerproduct is on the cart
    Then I verify cargo is free for vacuumcleanerproduct




