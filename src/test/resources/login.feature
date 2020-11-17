Feature: Verifying login functionalities

  Scenario Outline: Verifying FB login funtionalities
    Given : User is on facebook page
    When : user should be enter the "<user name>" and "<password>"
    Then : user should click login button
    

    Examples: 
      | user name | password |
      | java      | sql      |
      | sel       | sql      |
      | python    | sql      |
      | api       | sql      |
