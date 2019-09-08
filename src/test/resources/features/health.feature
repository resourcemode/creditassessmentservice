Feature: the health can be retrieved
  Scenario: client makes call to GET /actuator/health
    When the client calls "/actuator/health"
    Then the client receives status code of "200"
    And the client receives  status response "UP"