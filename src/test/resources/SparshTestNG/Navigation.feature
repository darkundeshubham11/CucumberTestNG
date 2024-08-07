@tag
Feature: Second Opinion

  @tag1
  Scenario: To validate the Second Opinion functionality.
    Given Open browser, enter sparsh hospital url
    And click on Hospitals link
    And Select Yeshwantpur hospital from Hospital dropdown
    And Click on Second Opinion link
		When user enters firstname,lastname,phone,email
		And Upload the Report and Write a message and click on send to submit
    Then Thankyou message should be displayed
		And bank info should be available in the page.

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     #| name  | value | status  |
     #| name1 |     5 | success |
     #| name2 |     7 | Fail    |
