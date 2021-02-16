Feature: Application Login 


Scenario: Home page default login
Given User is on netbanking login page 
When User log into application with "John" and "1234"
Then Home page is populated
And Cards are displayed "True"

Scenario: Home page default login
Given User is on netbanking login page 
When User log into application with "Salman" and "7890"
Then Home page is populated
And Cards are displayed "False"