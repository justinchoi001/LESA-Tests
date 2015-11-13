LESA - History Tab
==================

#### Prerequisites: ####
* Liferay Customer Support Engineer account
* Customer (Developer) Account


#### Description: ####
This test is designed to verify that each ticket history is accurate. Every comment, ticket status change, due dates, and solutions are tracked on the history tab. In this test, sign in as a CSE, create a ticket, (sign out and sign in again as the ticket assignee if necessary), verify the due date, add a comment, add an attachment. Change the status from Investigating to Engineer Analyzing and then to On Hold.  Verify that there is a new due date. Change the ticket status back to Reproduced, add a few comments, and propose a solution. 

****
#### Road Map: ####
1. [Sign In As Liferay CSE](#SignInAsLiferayCSE)
1. [Create A Ticket](#CreateATicket)
1. [Assert Original Due Date](#AssertOriginalDueDate)
1. [Update The Ticket](#UpdateTheTicket)
1. [Verify History Tab Accuracy Part 1](#VerifyHistoryTabAccuracyPart1)
1. [Verify History Tab Status Changes](#VerifyHistoryTabStatusChanges)
1. [Track Solutions](#TrackSolutions)

****

#### Test Steps: ####
1. <a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE"></a>Navigate to http://www-uat.liferay.com
1. Click the Menu drop down
1. Sign in with Liferay Customer credentials
1. Click Menu > Customer Portal
1. Click the LESA button    
<a href="#CreateATicket" name="CreateATicket">Create A Ticket</a>
1. Click New Ticket
1. Select an account
1. Click the Choose button for Portal Production
1. Click the Continue Without Adding button
1. Click the Confirm button for Portal Production
1. Select the Document Library component from the dropdown.
1. Click the Continue button.
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
<a href="#AssertOriginalDueDate" name="AssertOriginalDueDate">Assert Original Due Date</a>
1. Assert that the due date is one week from today
1. Note the ticket number (e.g. ACMEPORTAL-123)
1. Sign out and sign in again if the ticket is not assigned to this CSE. Skip if the ticket is assigned to this CSE.
1. Navigate back to LESA home page.
1. Go to the newly created ticket (e.g. ACMEPORTAL-123).    
<a href="#UpdateTheTicket" name="UpdateTheTicket">Update The Ticket</a>
1. Change the ticket status to <b>Investigating</b>
1. Click Add Comment
1. Enter the following: **This is the first comment.**
1. Click Add Attachments
1. Click Browse
1. Upload a .txt file.
1. Click Reply.    
<a href="#VerifyHistoryTabAccuracyPart1" name="VerifyHistoryTabAccuracyPart1">Verify History Tab Accuracy Part 1</a>
1. Click the History tab.
1. Assert that the assignee is correct
1. Assert that the portal-ext.properties and patch info files are listed in the New Value column.
1. Assert that the attachment on the comment is listed in the New Value column.
1. Assert that the change in ticket status from *Incident Reported* to *Investigating* is listed
1. Assert that the comment displays.
1. Assert that the ticket is now Pending Customer.
1. Scroll to the top and change the status to Engineer Analyzing.
1. Assert that *Engineering Analyzing* appears in the New Value column.    
<a href="#VerifyHistoryTabStatusChanges" name="VerifyHistoryTabStatusChanges">Verify History Tab Status Changes</a>
1. Scroll to the top and change the status to On Hold
1. Assert that *On Hold* appears in the New Value column.
1. In a new browser, sign in as the customer developer associated with this account.
1. Click the Menu drop down
1. Sign in with Liferay Customer credentials
1. Click Menu > Customer Portal
1. Click the LESA button
1. Click this ticket (e.g. ACMEPORTAL-123).
1. Click Add Comment
1. Enter: **Customer's Comment** in the Comments field.
1. Click the Reply button.
1. Assert that the ticket status displays **PENDING**.    
![screenshot01](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/features/history-tab/images/status.jpg)
1. Go to the original browser signed in as the CSE.
1. Assert that the *Pending* appears in the New Value column.
1. Assert that the new comment displays.    
![screenshot02](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/features/history-tab/images/status-change.jpg)    
<a href="#TrackSolutions" name="TrackSolutions">Track Solutions</a>
1. Click the Propose Solution button.
1. Enter: **This is the proposed solution**
1. Click the Browse button.
1. Upload a zip file under 100MB.
1. Click the Send button.
1. Assert that the ticket status displays **SOLUTION PROPOSED**.    
1. Assert that the *Solution Proposed* displays in the New Value column
1. Go to the second browser signed in as the customer developer.
1. Refresh the page.
1. Click No in the Solutions Repository Window.
1. Select "The fix did not deploy" from the drop down.
1. Enter the following in the **Please explain:** field: "When the fix was deployed, the portal registered it and added it to the blacklist."
1. Click Send.
1. Go to the original browser signed in as the CSE.
1. Refresh the page on the History tab.
1. Assert that *Investigating* is now the ticket status.
1. Assert that *Investigating* displays in the New Value column.
1. Assert that the ticket is now pending Liferay.