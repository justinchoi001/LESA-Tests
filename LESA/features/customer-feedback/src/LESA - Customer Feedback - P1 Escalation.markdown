LESA - Customer Feedback - P1 Escalation
========================================
****
#### Prerequisites: ####
* Customer account
* Liferay CSE account
* Partner (non manager) account


#### Description: ####
This test is designed to have users test the feedback feature. Customers will submit a feedback on a five point test demonstrating satisfactions. Assert that CSEs and partners are able to view P1 escalation tickets' feedback.

****
#### Road Map: ####
1. [Sign In As Customer](#SignInAsCustomer)
1. [Open A Ticket](#OpenATicket)
1. [Sign In As Partner](#SignInAsPartner)
1. [Resolve The ticket](#ResolveTheTicket)
1. [Submit Feedback](#SubmitFeedback)
1. [Assert Partner Can See Feedback](#AssertPartnerCanSeeFeedback)
1. [Assert Liferay CSEs Can See Feedback](#AssertLiferayCSEsCanSeeFeedback)

****

#### Test Steps: ####
1. <a href="#SignInAsCustomer" name="SignInAsCustomer"></a>Navigate to http://www-uat.liferay.com
1. Click the Menu drop down
1. Click Sign In
1. Enter the following:    
	(a) **Email Address:**	vineith.kaul@ihg.com.broken    
	(b) **Password:**	test
1. Click Sign In
1. Click Menu > User Profile
1. Click Support    
<a href="#OpenATicket" name="OpenATicket">Open A Ticket</a>
1. Click New Ticket
1. Select Intercontinental Hotel Groups from the drop down
1. Click Portal Production
1. Click Continue Without Adding
1. Click Create Ticket
1. Enter Customer Feedback Test in the Subject field
1. Select Unstable with Periodic Interruptions from the System Status field
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
1. Select Document Library from the Component drop down
1. Enter "this is a customer feedback test" in the Description text area
1. Click Save
1. Click the created ticket in the Support page
1. Assert the following:    
	(a) **Status:**		Incident Reported    
	(b) **Severity:**	Major    
	(c) **Resolution:**	N/A    
	(d) **Escalation Level:**	P1
1. Assert that the ticket has been assigned to Jogen Gondalia
1. Remember the ticket number (e.g. IHG-57)
1. Click Menu > Sign Out
1. Assert that the user has been signed out    
<a href="#SignInAsPartner" name="SignInAsPartner">Sign In as the Partner</a>
1. Click Menu > Sign In
1. Enter the following:    
	(a) **Email Address:**	jogen.gondalia@cignex.com.broken    
	(b) **Password:**	test
1. Click Sign In
1. Click Menu > User Profile
1. Click Support
1. Click My Open Tickets
1. Assert the ticket displays in the results (e.g. IHG-57)    
<a href="#ResolveTheTicket" name="ResolveTheTicket">Resolve The Ticket</a>
1. Click the newly created ticket's link
1. Assert the Proposed Solution button displays
1. Click Proposed Solution
1. Enter "Customer Feedback test" in the Instructions field
1. Upload an .xml file
1. Click Save
1. Assert that "Your request completed successfully" message displays
1. Sign Out    
<a href="#SubmitFeedback" name="SubmitFeedback">Submit Feedback</a>
1. Click Menu > Sign In
1. Enter the following:    
	(a) **Email Address:**	vineith.kaul@ihg.com.broken    
	(b) **Password:**	test
1. Click Sign In
1. Click Menu > User Profile
1. Click Support
1. Click the newly created ticket's link in the results field
1. Assert the Solutions Repository solution pop-up displays
1. Click Yes to accept the pre-production resolution
1. Click Yes to accept the production resolution
1. Assert the Edit Feedback button displays
1. Click 4 on all the radio buttons
1. Enter "Feedback completed" in the comments text area
1. Click Save
1. Assert that "Your request completed successfully" message displays
1. Sign Out    
<a href="#AssertPartnerCanSeeFeedback" name="AssertPartnerCanSeeFeedback">Assert Partners Can See Feedback</a>
1. Click Menu > Sign In
1. Enter the following:    
	(a) **Email Address:**	jogen.gondalia@cignex.com.broken    
	(b) **Password:**	test
1. Click Sign In
1. Click Menu > User Profile
1. Click Support
1. Enter the ticket name in the Basic Search field
1. Click Search
1. Assert that the Ticket Feedback section displays
1. Click Menu > Sign Out    
<a href="#AssertLiferayCSEsCanSeeFeedback" name="AssertLiferayCSEsCanSeeFeedback">Assert Liferay CSEs Can See Feedback</a>
1. Click Menu > Sign In
1. Enter the following:    
	(a) **Email Address:**	brian.suh@liferay.com.broken    
	(b) **Password:**	test
1. Click Sign In
1. Click Menu > User Profile
1. Click Support
1. Enter the ticket name in the Basic Search field
1. Click Search
1. Assert that the Ticket Feedback section displays