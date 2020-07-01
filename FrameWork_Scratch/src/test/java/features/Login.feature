Feature: Application Login 

Scenario Outline: Positive Testcase For Validating Login 
	Given Initialize The Browser 
	And Navigate to " http://www.qaclickacademy.com/" Site
	And Click on Login in the HomePage
	When User Enter UserName <username> Password <password> and click login
	Then Verify User Is Successfully Logged in or not
	
	Examples:
	|username					|password	|
	|3003mathuselvi@gmail.com	|mathu@selvi|
	|mathuselvi					|950041		|
	
