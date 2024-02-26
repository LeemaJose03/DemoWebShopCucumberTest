Feature: Login functionality of DemoWenShop Application

Background:
Given Open the browser
And Launch the URL

Scenario Outline: Login for positive testcase
When Click on Login
And Enter valid mail as <mailid>
And Enter valid password as <password>
And Click on Login button
Then HomePage should be displayed 

Examples:
|mailid|password|
|leema@gmail.com|Leema.123|
|leema3@gmail.com|Leema.123|

 