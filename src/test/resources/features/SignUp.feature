Feature: Sign Up test

  @SeleniumTest
  Scenario: Sign up process
    Given I login to the website
    When I click on button sign up
    Then I should see free sign up button
    And Sign up header is displayed