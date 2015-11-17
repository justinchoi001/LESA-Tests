LESA - Reporters
=================

This test is to assert that only customer developers can be chosen as ticket reporters. Sometimes, Liferay CSEs will create on behalf of customers and then change the reporter to a customer. Previously, the list of customer developers as potential ticket reporters included account watchers. Because account watchers have no permissions to create tickets, it made no sense to include them in this list. For partner managed accounts, partner developers are also included in the list of ticket reporters.

#### Road Map: ####
1. [Sign In As Liferay CSE](#SignInAsLiferayCSE)
1. [Create A Ticket](#CreateATicket)
1. [Edit Ticket Reporter](#EditTicketReporter)

****

#### Test Steps: ####
1. <a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE"></a>Navigate to http://www-uat.liferay.com
1. Click the Main Menu drop down > Customer Portal
1. Click LESA.
1. Click the Accounts tab
1. Search for an account (e.g. ACMEPORTAL)
1. Click the account link
1. In the Contacts section, note down which user is a watcher.
1. In the Contacts section, note down which user is a developer.     
![screenshot1](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/support/images/reporter-contacts.jpg)
1. Click Back to Previous Page    
<a href="#CreateATicket" name="CreateATicket">Create A Ticket</a>
1. Click the Tickets tab.
1. Click New Ticket
1. Select an account (e.g. ACMEPORTAL)
1. Click Portal Production
1. Click the Continue Without Adding button
1. Click Confirm next to Portal Production
1. Select Document Library from the Component drop down
1. Click Continue
1. Enter in the <b>Provide a summary</b> field: Customer Basic Test
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
1. Note the name of the ticket assignee. If it is the same person, skip the next few steps. If the assignee is another CSE, execute steps 31-34.
1. In a new browser window, navigate to http://www-uat.liferay.com
1. Sign in with the ticket assignee's credentials
1. Click the Main Menu drop down > Customer Portal
1. Click LESA.
1. Click the My Open Tickets filter    
<a href="#EditTicketReporter" name="EditTicketReporter">Edit Ticket Reporter</a>
1. Click on the newly created ticket
1. Click the Edit button.
1. Click the Choose Button next to **Reported by** in the Ticket Info section.    
![screenshot2](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/support/images/reporter-ticketinfo.jpg)
1. In the popup window, verify that only the reporters available are the developers and not the watchers from step 8 (screenshot 1).