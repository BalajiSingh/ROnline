Feature: Search vehicles to fetch all records

  @Api
  Scenario: Getting All Vehicles
    Given I should have the base url for search vehicle
    When I fetch the records with "/api/vehicles" endpoint
    Then I should get status code "200" in response
    And I should get 10 vehicles records in the response

  @Api
  Scenario: Getting Items per page
    Given I should have the base url for search vehicle
    When I pass items per page as "80"
    And I fetch the records with "/api/vehicles" endpoint
    Then I should get status code "200" in response
    And I should get 80 vehicles records in the response

  @Api
  Scenario: Getting Items as per display name
    Given I should have the base url for search vehicle
    When I pass keyword to search the records as "Navistar"
    And I fetch the records with "/api/vehicles" endpoint
    Then I should get status code "200" in response
    And I should get vehicles records with searched keyword "NAVISTAR INTERNATIONAL" in the response

  @Api
  Scenario: Getting Items per page along with pageNumber
    Given I should have the base url for search vehicle
    When I pass items per page as "80" and page number as "1"
    And I fetch the records with "/api/vehicles" endpoint
    Then I should get status code "200" in response
    And I should get 80 vehicles records in the response
