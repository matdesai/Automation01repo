Feature: verify Sample Webpage for Automation Practice
@sanity
Scenario: verify text box 
Given user Shouid at home page
When user enter name "Apple"
Then user cheak entername correct is "Apple"
@functional
Scenario: verify Btn
Given user Shouid at home page
Then Btn visible or not

@regresion
Scenario: verify Alert popup
Given user Shouid at home page
Then user handle alert popup
@smock
Scenario: verify text box
Given user should at rahulshetty page
When user enter text "kolhapur"
Then user cheak cheak text