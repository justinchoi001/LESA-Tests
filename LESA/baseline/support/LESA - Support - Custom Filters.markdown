LESA - Support - Custom Filters
===============================

#### Prerequisites: ####
* Liferay Customer Support Engineer account


#### Description: ####
This test is designed to test the custom filters. Users will design a custom filter, export the filter, and then delete the filter.

****

#### Road Map ####
1. [Sign In As Support](#SignInAsSupport)
1. [Create A Ticket](#CreateATicket)
1. [Create A Filter](#CreateAFilter)
1. [Export A Filter](#ExportAFilter)
1. [Delete A Filter](#DeleteAFilter)

#### Test Steps ####
1. <a href="#SignInAsSupport" name="SignInAsSupport"></a>Navigate to http://www-uat.liferay.com
1. Click the Menu drop down
1. Click Sign In
1. Sign in with Liferay Customer credentials
1. Click Menu > Customer Portal
1. Click the LESA button    
<a href="#CreateATicket" name="CreateATicket">Create A Ticket</a>
1. Click New Ticket
1. Select an account
1. Click Portal Production
1. Click the Continue Without Adding button
1. Click Create Ticket
1. Enter in the <b>Provide a summary</b> field: Customer Basic Test
1. Select Document Library from the Component drop down
1. Select <b>System Status</b>: Completely Inoperable / Shutdown    
1. Enter: "This is a customer test" in the Description
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
1. Click the Submit button
1. Assert that the system redirects to the newly created ticket.
1. Click Back to Previous Page
1. Click Advanced >> (if not already on Advanced search)
1. Click Reset.    
<a href="#CreateAFilter" name="CreateAFilter">Create A Filter</a>
1. Check the following boxes:    
	(a) **Severity:**	Critical    
	(b) **Escalation:**	1    
	(c) **Status:**	Incident Reported    
	(d) **Component:**	Document Library    
	(e) **Product:**	Portal Production    
	(f) **Version:**	6.2 EE    
	(g) **Operating System:**	Ubuntu 13    
	(h) **App Server:**	Weblogic 12c
	(i) **Database:**	Oracle 11.2    
1. Click the plus sign next to Custom Filters
1. Enter in the name field: filter1
1. Select Public in the Visibility drop down.
1. Click the Add New Filter button.
1. Assert that filter1 displays in the Custom Filters drop down.
1. Assert that the Permalink displays.
![customer-filter01](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/support/images/custom-filter01.jpg)    
<a href="#ExportAFilter" name="ExportAFilter">Export A Filter</a>
1. Right click the Permalink
1. Click Copy Link Location.
1. Open a new browser tab
1. Paste the Permalink.
1. Assert that the search results match the criteria    
	(a) Critical tickets    
	(b) Document Library    
	(c) WebLogic 12c    
	(d) Oracle 11.2    
<a href="#DeleteAFilter" name="DeleteAFilter">Delete A Filter</a>
1. Click the Delete icon.
1. Click the OK button.
1. Assert the "Your request completed successfully" message displays.