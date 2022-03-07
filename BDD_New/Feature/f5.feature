Feature:Test the automationpractice application
@RegressionTest
Scenario:Test the login page with valid details
Given Open chrome browser and url of the application
When Enter Username , password and click login button
Then Success in login

@firstlogin
Examples:
  |input     |output    |
  |arunachalam.anna@hcl.com   |hcl1234 |
  |arunachalam.anna@hcl.com    |hcl12345 |


@RegressionTest @SmokeTest 
Scenario:Test the login page with valid details
Given Open chrome browser and cart url of the application
When Select the product and add to cart
Then Added in Cart
