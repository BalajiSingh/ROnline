Feature: SetSellableItemStatus Soft Delete API

  Background: Getting the Authentication token
    Given I should have the base url for Token generation
    When I pass the username, password and other required values as body
    And I pass "/connect/token" as endpoint
    Then I should get the login access bearer token for Site Core Services
    Given I have the base url for Channel Advisor api
    When I pass desired Headers and params in the POST type request along with endpoint "/oauth2/token"
    Then I should get the token for Channel Advisor Services

  @Api
  Scenario: Removing the record from the SiteCore UI
    Given I should be having the token and the base url for SiteCore
    When I pass the Id as "231847" and Status as "REMOVED" in request payload
    And I pass the POST request with endpoint "/api/SetSellableItemStatus()"
    Then I should get the "200" as Status Code in the response
    And should be able to see "SUCCESS" in the value response
    When User excecute the API request for SiteCore endpoint using same Id as "231847"
    Then I should get the "200" as Status Code in the response
    And Status field in the response body should appear as "REMOVED"
    When User excecute the Minions API request with endpoint "/commerceops/RunMinion()"
    Then record should get updated to Channel Advisor and user should get "200" as response
    When User excecute the Channel Advisor API request
    And User pass the desired access token and parameters "Sku eq", "ID,Sku,Title" along  with Uri "/v1/Products"
    #And User pass the desired access token and parameters "<Param1>", "<Id>", "<Param2>" along  with Uri "<ChannelAdvisorUri>"
    Then user should not be able to see the record on Channel Advisor i.e. Blank response "" in the api

  #Examples:
  #| Id     | MinionEndpoint           | ChannelAdvisorBaseUrl          | Param1 | Param2       | ChannelAdvisorUri |
  #| 231801 | /commerceops/RunMinion() | https://api.channeladvisor.com | Sku eq | ID,Sku,Title | /v1/Products      |
  @Api
  Scenario Outline: Making the record Available on the SiteCore UI
    Given I should be having the token and the base url for SiteCore
    When I pass the Id as "<Id>" and Status as "AVAILABLE" in request payload
    And I pass the POST request with endpoint "/api/SetSellableItemStatus()"
    Then I should get the "200" as Status Code in the response
    And should be able to see "SUCCESS" in the value response
    When User excecute the API request for SiteCore endpoint using same Id as "<Id>"
    Then I should get the "200" as Status Code in the response
    And Status field in the response body should appear as "AVAILABLE"
    When User excecute the Minions API request with endpoint "<MinionEndpoint>"
    Then record should get updated to Channel Advisor and user should get "200" as response
    When User excecute the Channel Advisor API request
    And User pass the desired access token and parameters "<Param1>", "<Id>", "<Param2>" along  with Uri "<ChannelAdvisorUri>"
    Then user should be able to see the record in Channel Advisor "<Id>" in the response

    Examples: 
      | Id     | MinionEndpoint           | ChannelAdvisorBaseUrl          | Param1 | Param2       | ChannelAdvisorUri |
      | 231847 | /commerceops/RunMinion() | https://api.channeladvisor.com | Sku eq | ID,Sku,Title | /v1/Products      |
