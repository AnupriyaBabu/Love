Feature: Adactin Login Page Validation
Scenario: Adactin Login Page Validation with Valid Crdentials
Given User should be in Login Page
When User should Enter the Login Crdentials    "<username>","<password>"
And User should Click Login button
Then User should validate login success
And User should select SearchHotel details
And User should Click Search button


   Examples:
   | Username       |	Password |
   | Kavi@gmail.com |	HQ70U3   |
   | Geetha	        |  12356   |
   | Pavi@gmail.com |	SW20UG   |
   | Ramkumar       |	78569    |
   | Ravi           |	45623    |