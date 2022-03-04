Feature: Login Functionality

  @login @sauceDemo
  Scenario Outline: <Username> should login with valid credentials
    Given The users should land on login page
    Then The users should login with "<Username>" and "<Password>" successfully
    Examples:
      | Username                | Password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

  @login_negative @sauceDemo
  Scenario Outline: The users should not login with invalid credentials
    Given The users should land on login page
    Then The users should not login with "<InvalidUsername>" and "<InvalidPassword>"
    Examples:
      | TYPE                  | InvalidUsername         | InvalidPassword |
      | Blank username        |                         | secret_sauce    |
      | Blank password        | problem_user            |                 |
      | Both blank            |                         |                 |
      | Correct only password | standard                | secret_sauce    |
      | Correct only username | performance_glitch_user | secretsauce     |
      | Random                | abcdex                  | 0123456         |
      | Mixed                 | secret_sauce            | standard_user   |
