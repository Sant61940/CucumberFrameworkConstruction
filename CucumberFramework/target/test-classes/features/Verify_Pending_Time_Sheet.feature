@timesheets
Feature: This feature is to get pending timesheet
Scenario: This tes is to verify pending timesheet

Given the user is on homepage
When the user clicks on the time option from the menu
And the user enters the name as "John Smith"
And clicks on the view button
Then the user should see the message as "<message>" 
