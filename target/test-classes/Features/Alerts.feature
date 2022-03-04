  @demoQA
Feature: Handle all alerts type

  Background:
    Given The user goes to ToolsQA url
    When The user click the "Alerts, Frame & Windows" module and clicks on "Alerts" page

  @wip1
  Scenario: Click Button to see alert message
    Then Handling the Click Button to See alert


  Scenario: On button click, alert will appear after 5 seconds
    Then Handling the Click Button appears after 5 seconds alert


  Scenario: On button click, confirm box will appear
    Then Handling the confirm box appear alert


  Scenario: On button click, prompt box will appear
    Then Handling prompt box appear alert
