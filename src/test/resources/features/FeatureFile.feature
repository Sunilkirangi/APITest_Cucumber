
Feature: Test NY_Times API
  Scenario Outline:  User should be able validate the NYtimes_Book API Response

    Given User sets the base API request <URI>
    And User authenticates the API request with <Api-Key>
    When User send the API request to get all results
    Then User validates the response status <code> and results

    Examples:
      |URL                    |API-Key                         | Code|
      |https://api.nytimes.com|38BAcyUfn9ET2OlPEbCTXK0BNQ2JgSfe| 200 |
