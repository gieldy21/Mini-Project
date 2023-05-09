Feature: Hello
  As an admin
  I want to say hello
  So that I get data to say hello

  @Index
  Scenario: GET - Say Hello (positive)
    Given I set GET endpoints hello
    When I send GET HTTP request hello
    Then I receive valid HTTP response code 200
  @Index
  Scenario: GET - Say Hello with invalid endpoints (negative)
    Given I set GET invalid endpoints hello
    When I send invalid GET HTTP request hello
    Then I receive valid HTTP response code 404