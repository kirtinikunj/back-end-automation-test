Feature: Testing end point

  Scenario: Check if the game application can be accessed by user
    When User send a GET request
    Then User can assert that data contains jackpotid Bingo
    And User must get back a valid status code 200

