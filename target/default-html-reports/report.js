$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Widgets.feature");
formatter.feature({
  "name": "Verify Hover over functionality works",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@456"
    },
    {
      "name": "@demoQA"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify that message appears after hovering over",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Confirm \"\u003cMessage\u003e\" that appears after hovering",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Message"
      ]
    },
    {
      "cells": [
        "You hovered over the Button"
      ]
    },
    {
      "cells": [
        "You hovered over the text field"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user goes to ToolsQA url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoQASauceDemo.StepDefinitions.AlertsStepDef.the_user_goes_to_ToolsQA_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the \"Widgets\" module and clicks on \"Tool Tips\" page",
  "keyword": "When "
});
formatter.match({
  "location": "com.demoQASauceDemo.StepDefinitions.AlertsStepDef.the_user_click_the_module_and_clicks_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that message appears after hovering over",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@456"
    },
    {
      "name": "@demoQA"
    }
  ]
});
formatter.step({
  "name": "Confirm \"You hovered over the Button\" that appears after hovering",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoQASauceDemo.StepDefinitions.WidgetsStepDef.confirm_that_appears_after_hovering_the_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user goes to ToolsQA url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoQASauceDemo.StepDefinitions.AlertsStepDef.the_user_goes_to_ToolsQA_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the \"Widgets\" module and clicks on \"Tool Tips\" page",
  "keyword": "When "
});
formatter.match({
  "location": "com.demoQASauceDemo.StepDefinitions.AlertsStepDef.the_user_click_the_module_and_clicks_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that message appears after hovering over",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@456"
    },
    {
      "name": "@demoQA"
    }
  ]
});
formatter.step({
  "name": "Confirm \"You hovered over the text field\" that appears after hovering",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoQASauceDemo.StepDefinitions.WidgetsStepDef.confirm_that_appears_after_hovering_the_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});