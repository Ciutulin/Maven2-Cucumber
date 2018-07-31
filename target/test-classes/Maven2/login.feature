Feature: OrangeHRM log in

  @login

  Scenario: As a User, I should be able to log in

    Given user in on log in page
    When he enter username and password
    And he clicks on submit button
    Then he should be loged in successfully


  @nologin
  Scenario Outline: Invalid Credential

    Given user is on login page
    When he enter invalid "<username>" and "<password>"
    And he clicks on submit button
    Then he should not be able to log in with "<errormessage>"

    Examples:
    | username | password | errormessage                  |
    |Dana      | admin123 | Invalid credentials           |
    |Admin     | admin    |  Invalid credentials          |
    |          | admin123 |  Username cannot be empty     |
    |          | admin    |  Username cannot be empty     |
    |Admin     |          |  Password cannot be empty     |
    |Dana      |          |  Password cannot be empty     |
    |Dana      |admin     |  Invalid credentials          |
