$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Allfeature.feature");
formatter.feature({
  "comments": [
    {
      "line": 2,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 3,
      "value": "#Keywords Summary :"
    },
    {
      "line": 4,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 5,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 6,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 7,
      "value": "#When: Some key actions"
    },
    {
      "line": 8,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 9,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 10,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 11,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 12,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 13,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 14,
      "value": "#| (Data Tables)"
    },
    {
      "line": 15,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 16,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 17,
      "value": "#\"\""
    },
    {
      "line": 18,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    },
    {
      "line": 20,
      "value": "#@tag"
    },
    {
      "line": 21,
      "value": "#Feature: Title of your feature"
    },
    {
      "line": 22,
      "value": "# I want to use this template for my feature file"
    },
    {
      "line": 24,
      "value": "#@tag1"
    },
    {
      "line": 25,
      "value": "#Scenario: Title of your scenario"
    },
    {
      "line": 26,
      "value": "#  Given I want to write a step with precondition"
    },
    {
      "line": 27,
      "value": "#  And some other precondition"
    },
    {
      "line": 28,
      "value": "#  When I complete action"
    },
    {
      "line": 29,
      "value": "#  And some other action"
    },
    {
      "line": 30,
      "value": "# And yet another action"
    },
    {
      "line": 31,
      "value": "#Then I validate the outcomes"
    },
    {
      "line": 32,
      "value": "#And check more outcomes"
    },
    {
      "line": 34,
      "value": "# @tag2"
    },
    {
      "line": 35,
      "value": "# Scenario Outline: Title of your scenario outline"
    },
    {
      "line": 36,
      "value": "#  Given I want to write a step with \u003cname\u003e"
    },
    {
      "line": 37,
      "value": "#When I check for the \u003cvalue\u003e in step"
    },
    {
      "line": 38,
      "value": "#Then I verify the \u003cstatus\u003e in step"
    },
    {
      "line": 40,
      "value": "#  Examples:"
    },
    {
      "line": 41,
      "value": "#    | name  | value | status  |"
    },
    {
      "line": 42,
      "value": "#   | name1 |     5 | success |"
    },
    {
      "line": 43,
      "value": "#    | name2 |     7 | Fail    |"
    }
  ],
  "line": 45,
  "name": "Snapdeal portal product selection",
  "description": "",
  "id": "snapdeal-portal-product-selection",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 47,
  "name": "Selecting a product in snapdeal site",
  "description": "",
  "id": "snapdeal-portal-product-selection;selecting-a-product-in-snapdeal-site",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@skip_scenario"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "user is on snapdeal portal",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "user enters a productname in the search field",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user selects one product from the search list",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "user clicks on add to cart button",
  "keyword": "Then "
});
formatter.match({
  "location": "GlueClass.launch()"
});
formatter.result({
  "duration": 16443514235,
  "status": "passed"
});
formatter.match({
  "location": "GlueClass.productSelection()"
});
formatter.result({
  "duration": 1316169224,
  "status": "passed"
});
formatter.match({
  "location": "GlueClass.click()"
});
formatter.result({
  "duration": 5726922441,
  "status": "passed"
});
formatter.match({
  "location": "GlueClass.select()"
});
formatter.result({
  "duration": 9855719574,
  "status": "passed"
});
formatter.match({
  "location": "GlueClass.addtocart()"
});
formatter.result({
  "duration": 3603696329,
  "status": "passed"
});
});