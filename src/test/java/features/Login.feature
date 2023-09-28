@test @FERegression
  Feature: Login
    I want to login to automation practice website
  @testCase1
Scenario Outline: Check success login with valid credentials
    Given I open Website
    When I click signin
    And I type email "<email>"
    And I type password "<password>"
    And I click on submit login
    Then I validate my account title

    Examples:
    | email      | password |
    | test@moakt.cc | Test@123|