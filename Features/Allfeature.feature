
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
 # I want to use this template for my feature file

  #@tag1
  #Scenario: Title of your scenario
  #  Given I want to write a step with precondition
  #  And some other precondition
  #  When I complete action
  #  And some other action
   # And yet another action
    #Then I validate the outcomes
    #And check more outcomes

 # @tag2
 # Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   #When I check for the <value> in step
   #Then I verify the <status> in step

  #  Examples: 
 #    | name  | value | status  |
  #   | name1 |     5 | success |
  #    | name2 |     7 | Fail    |
      
Feature: Snapdeal portal product selection   
@skip_scenario
Scenario: Selecting a product in snapdeal site
Given user is on snapdeal portal
When user enters a productname in the search field
And user clicks on search button
Then user selects one product from the search list
Then user clicks on add to cart button
##Then user verifies the product gets added to the cart


Scenario: Selecting a product in snapdeal site1
Given user is on snapdeal portal1
When user enters a productname in the search field1
And user clicks on search button1
Then user selects one product from the search list1
Then user clicks on add to cart button1



