@runall
Feature: Automation of Twitter Web Page


Scenario Outline: Automating the Twitter Web Page
Given that user launch the "<url>" and is on login page
Then click on login
Then user login with valid "<username>" & "<password>" 
And click on second login
Then serach for favorite twitter "<profile>"
And click on the valid profile from the suggestions
Then click on followers of the profile
And print all the followers



Examples: 
|         url        |          username           | password |  profile |
|https://twitter.com/|  ashukshukla612@gmail.com   | 123456789@#|@imVkohli | 