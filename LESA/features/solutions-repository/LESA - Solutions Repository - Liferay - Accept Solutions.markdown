LESA - Solutions Repository - Liferay - Accept Solutions
========================================================
****
#### Prerequisites: ####
* Customer account
* Liferay CSE account
* Partner (non manager) account


#### Description: ####
This test is designed to have users test the solutions repository's acceptance feature. A simulated Liferay customer will create a ticket and a simulated Liferay Customer Support Engineer will offer a solution. The customer will then accept the solution. Assert that the pop-up window appears for accepting the patch in pre-production and production environments. 

****
#### Road Map: ####
1. [Sign In As Customer](#SignInAsCustomer)
1. [Open A Ticket](#OpenATicket)
1. [Sign In As Liferay CSE](#SignInAsLiferayCSE)
1. [Resolve The Ticket](#ResolveTheTicket)
1. [Accept The Solution](#AcceptTheSolution)

****

#### Test Steps: ####
1. <a href="#SignInAsCustomer" name="SignInAsCustomer"></a>Navigate to http://www-uat.liferay.com
1. Click the Menu drop down
1. Click Sign In
1. Sign in as a customer with Liferay Support
1. Click Menu > Customer Portal
1. Click the LESA button    
<a href="#OpenATicket" name="OpenATicket">Open A Ticket</a>
1. Click New Ticket
1. Click Portal Production
1. Click Continue Without Adding
1. Click Create Ticket
1. Enter "Solutions Repository Test - Accept Solution" in the Summary field
1. Select Document Library from the Component drop down
1. Select Completely Inoperable/ Shutdown from the System Status field
1. Enter "This is a solutions repository test" in the Description text area
1. Select the following:    
	(a) **Liferay Version**:	 6.2 EE    
	(b) **Application Server**:	Weblogic 12c    
	(c) **Database:**			Oracle 11.2    
	(d) **Operating System**:	Ubuntu 13    
	(e) **Java Virtual Machine:**	Java 7    
	(f) **Primary Browser:**		Firefox 20+
1. Click Upload New in the Portal-ext section
1. Upload a .txt file
1. Flag the "This portal-ext is current" check box if it is not already flagged
1. Click Upload New in the Patch Level section
1. Upload a .txt file
1. Flag the "This patch level is current" check box if it is not already flagged
1. Click Save
1. Click the created ticket in the Support page
1. Assert the following:    
	(a) **Status:**		Incident Reported    
	(b) **Severity:**	Critical    
	(c) **Resolution:**	N/A    
	(d) **Escalation Level:**	1
1. Assert that the ticket has been assigned to Liferay
1. Assert that there is only one ticket created.
1. Remember the assigned CSE
1. Click Menu > Sign Out
1. Assert that the user has been signed out    
<a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE">Sign In as Liferay CSE</a>
1. Click Menu > Sign In
1. Sign in as the assigned CSE
1. Click Menu > Customer Portal
1. Click the LESA button
1. Click My Open Tickets
1. Assert the ticket displays in the results (e.g. ABCDEF-123)    
<a href="#ResolveTheTicket" name="ResolveTheTicket">Resolve The Ticket</a>
1. Click the newly created ticket's link
1. Assert the Propose Solution button displays    
1. Click Propose Solution
1. Enter "Solutions Repository test" in the Instructions field
1. Upload an .xml file
1. Click Save
1. Assert that "Your request completed successfully" message displays
1. Assert that "Solution Proposed" displays in the Status box
1. Assert that "Customer" displays in the Pending box
1. Sign Out    
<a href="#AcceptTheSolution" name="AcceptTheSolution">Accept The Solution</a>
1. Sign in as a customer with Liferay Support
1. Click Menu > Customer Portal
1. Click the LESA button
1. Click Menu > User Profile
1. Click Support
1. Click the newly created ticket's link in the results field
1. Assert the Solutions Repository solution pop-up displays    
![screenshot01.jpg](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/features/solutions-repository/images/LESA-Solutions-Repository-Partner-Accept Solutions/screenshot01.jpg)
1. Close the pop-up window
1. Assert that the Solution Proposed tab displays on the right side
1. Click the Solution Proposed tab
1. Assert the Solutions Repository solution pop-up displays
1. Click Yes to accept the preproduction resolution
1. Click Yes to accept the production resolution
1. Assert that "Closed" displays in the Status box
1. Assert that "Completed" displays in the Resolution box