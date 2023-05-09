Feature: Products
  As an admin
  I want to see product
  So that I can manage the product

  @GET
  Scenario: Get - Get all products (positive)
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
  @GET
  Scenario: Get - Get all products (negative)
    Given I set GET invalid endpoints
    When I send GET HTTP request invalid
    Then I receive valid HTTP response code 404


  @POST
  Scenario: POST - Create a new product (positive)
    Given I set POST endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 200
  @POST
  Scenario: POST - Create a new product (negative)
    Given I set POST invalid endpoints
    When I send POST HTTP request invalid
    Then I receive valid HTTP response code 400


  @GetByID
  Scenario: GET - As admin I Get product By ID : 11350 (positive)
    Given I set GET endpoints By ID
    When I send GET HTTP request By ID
    Then I receive valid HTTP response code 200
  @GetByID
  Scenario: GET - As admin I Get product By ID : 11350 with invalid endpoints (negative)
    Given I set GET invalid endpoints By ID
    When I send invalid GET HTTP request By ID
    Then I receive valid HTTP response code 404


  @DELETE
  Scenario: DELETE - As admin I have delete a product (positive)
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200
  @DELETE
  Scenario: DELETE - As admin I have delete a product with invalid endpoints (negative)
    Given I set DELETE invalid endpoints
    When I send invalid DELETE HTTP request
    Then I receive valid HTTP response code 404


  @POST_Ratings
  Scenario: POST - Assign a product rating (positive)
    Given I set POST endpoints assign a product rating
    When I send POST HTTP request assign a product rating
    Then I receive valid HTTP response code 200
  @POST_Ratings
  Scenario: POST - Assign a product rating with invalid endpoints (negative)
    Given I set POST invalid endpoints assign a product rating
    When I send invalid POST HTTP request assign a product rating
    Then I receive valid HTTP response code 404
  @POST_Ratings
  Scenario: POST - Assign a product rating without Authorazation (negative)
    Given I set POST endpoints assign a product rating.
    When I send POST HTTP request assign a product rating without Authorazation
    Then I receive valid HTTP response code 401


  @GetProductRating
  Scenario: GET - Get product ratings (positive)
    Given I set GET endpoints to get rating
    When I send GET HTTP request to get rating
    Then I receive valid HTTP response code 200
  @GetProductRating
  Scenario: GET - Get product ratings with invalid endpoints (negative)
    Given I set GET invalid endpoints to get rating
    When I send invalid GET HTTP request to get rating
    Then I receive valid HTTP response code 404


  @POST_CreateComment
  Scenario: POST - Create a comment for product (positive)
    Given I set POST endpoints comment for product
    When I send POST HTTP request comment for product
    Then I receive valid HTTP response code 200
  @POST_CreateComment
  Scenario: POST - Create a comment for product with invalid endpoints (negative)
    Given I set POST invalid endpoints comment for product
    When I send invalid POST HTTP request comment for product
    Then I receive valid HTTP response code 404
  @POST_CreateComment
  Scenario: POST - Create a comment for product without Authorization (negative)
    Given I set POST endpoints comment without Authorization
    When I send POST HTTP request comment without Authorization
    Then I receive valid HTTP response code 401


  @GetProductComments
  Scenario: GET - Get product comments (positive)
    Given I set GET endpoints to get comment
    When I send GET HTTP request to get comment
    Then I receive valid HTTP response code 200
  @GetProductComments
  Scenario: GET - Get product comments with invalid endpoints (negative)
    Given I set GET invalid endpoints to get comment
    When I send invalid GET HTTP request to get comment
    Then I receive valid HTTP response code 404