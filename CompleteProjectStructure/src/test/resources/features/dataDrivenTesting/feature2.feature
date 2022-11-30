Feature: feature2
Scenario Outline: data driven
Given user is on "Execute Automation" page
When user checks the select box

 Then user enters "<intial>" on the textbox
 And  user enters "<first name>" on the text box
 And user enters "<middle name>" on the textbox
 And user select the gender by click on it 
 And user select the  languages 
Then click on the save Button
Examples:
|initial|firstname|middlename|
|bass|krishna|mohan|
|Kaja|rahghu|varma|
|yall|sheereesh|kumar|