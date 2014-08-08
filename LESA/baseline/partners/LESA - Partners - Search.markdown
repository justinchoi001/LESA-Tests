LESA - Partners - Search
======================== 

#### Prerequisites: ####
* Liferay Partner account


#### Description: ####
This test is designed to assert basic functionality and permissions granted to Liferay Partner view on LESA. Users will sign in as a Partner and create a ticket, edit the ticket status and details, and add a comment to the ticket.

****

#### Road Map ####
1. [Sign In As Partner](#SignInAsPartner)
1. [Create A Ticket](#CreateATicket)
1. [Search For Multiple Words](#SearchForMultipleWords)
1. [Search Within A Text Attachment](#SearchWithinATextAttachment)
1. [Create Custom Filter](#CreateCustomFilter)
1. [Delete Custom Filter](#DeleteCustomFilter)

#### Test Steps: ####
1. <a href="#SignInAsPartner" name="SignInAsPartner"></a>Navigate to http://www-uat.liferay.com
1. Click the Menu drop down
1. Click Sign In
1. Sign in with Liferay Partner credentials
1. Click Menu > User Profile
1. Click Support    
<a href="#CreateATicket" name="CreateATicket">Create A Ticket</a>
1. Click New Ticket
1. Select an account
1. Click Portal Production
1. Click the Continue Without Adding button
1. Click Create Ticket
1. Enter in the <b>Subject</b> field: Panzer Kampfwagen V
1. Select <b>System Status</b>: Critical Applications Are Completely Inoperable
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
1. Enter: "German World War 2 Tank" in the Description
1. Click the Save button.
1. Assert that the message "Your request completed successfully" displays.
1. Search for the newly created ticket.
1. Click the Manage Attachment button.
1. Upload a text document that has unique words (e.g. Panther tank)
1. Click the Save button.
1. Assert that the message "Your request completed successfully" displays.
1. Note the key information about this ticket:    
	(a) **Status:**			Incident Reported    
	(b) **Severity:**		Critical    
	(c) **Pending:**		Liferay    
	(d) **Escalation Level:**	1    
1. Click Back to Previous Page.
<a href="#SearchForMultipleWords" name="SearchForMultipleWords">Search For Multiple Words</a>
1. Click the Basic link next to Search if the Search is set to Advanced Search 
1. Enter "Panzer Kampfwagen V" in the Search field.
1. Click the Search button.
1. Assert that the newly created ticket displays in the Search results section.    
![image01](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/partners/images/LESA-partners-search/LESA-partners-search01.jpg)
1. Clear the search field    
<a href="#SearchWithinATextAttachment" name="SearchWithinATextAttachment">Search Within A Text Attachment</a>
1. Enter "Panther Tank" in the Search field.
1. Click the Search button.
1. Assert that the newly created ticket displays in the Search results section.   
![image01](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/partners/images/LESA-partners-search/LESA-partners-search01.jpg)
1. Click the Advanced link next to the Search field to expand Advanced Search   
<a href="#CreateCustomFilter" name="CreateCustomFilter">Create Custom Filter</a>
1. Check the following boxes:    
	(a) **Status:**			Incident Reported    
	(b) **Severity:**		Critical    
	(c) **Pending:**		Liferay    
	(d) **Escalation Level:**	1    
	(e) **Component:**		Document Library   
	(f) **Application Server:**	Weblogic 12c    
	(g) **Database:**			Oracle 11.2
1. Click the plus sign next to Custom Filters
1. Enter a name in the Name field: filter1
1. Click the Add New Filter button
1. Assert that "Your request completed successfully" message displays
1. Assert that "filter1" displays in the Custom Filters drop down
1. Select filter1.
1. Click the Search button
1. Assert that the newly created ticket displays in the Search results section.    
![image01](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/partners/images/LESA-partners-search/LESA-partners-search01.jpg)    
<a href="#DeleteCustomFilter" name="DeleteCustomFilter">Delete Custom Filter</a>
1. Click the Garbage can icon next to Custom Filters.
1. Assert that "Your request completed successfully" message displays
