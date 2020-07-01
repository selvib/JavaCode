Feature: Application Login 



Scenario: HoemPage Default Login 
	Given User is on NetBanking landing page 
	When User Login to Application with "Selvi" and Password "3003" 
	Then HomePage is populated 
	And Cards are displayed are "true"
	
Scenario: HoemPage Default Login 
	Given User is on NetBanking landing page 
	When User Login to Application with "Sandy" and Password "420420" 
	Then HomePage is populated 
	And Cards are displayed are "false"