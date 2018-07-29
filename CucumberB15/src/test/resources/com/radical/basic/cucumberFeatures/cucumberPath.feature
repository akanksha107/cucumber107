Feature: Facebook login1
As a fb user, I want to login using my username & password

Scenario: validate fb login scenario1
Given the user is on facebook login page
When he enters "akanksha.choudhary.5437" as user name
And he enters "akanksha@0401" as password
Then check username is present in textbox
When click login






 