LESA - Customers
================

#### Prerequisites: ####
* Liferay Customer account


#### Description: ####
This test is designed to assert basic functionality and permissions granted to Liferay Customer view on LESA. Users will sign in as a Customer and create a ticket, edit the ticket status and details, and add a comment to the ticket.

****

#### Road Map ####
1. [Sign In As Customer](#SignInAsCustomer)
1. [Verify Ticket Counts Are Correct](#VerifyTicketCountsAreCorrect)
1. [Create A Ticket](#CreateATicket)
1. [Add A Comment](#AddAComment)
1. [Add An Attachment](#AddAnAttachment)
1. [Assert Top Permalink](#AssertTopPermalink)

****


#### Test Steps: ####
1. <a href="#SignInAsCustomer" name="SignInAsCustomer"></a>Navigate to http://www-uat.liferay.com
1. Click the Menu drop down
1. Click Sign In
1. Sign in with Liferay Customer credentials
1. Click Menu > User Profile
1. Click Support    
<a href="#VerifyTicketCountsAreCorrect" name="VerifyTicketCountsAreCorrect">Verify Ticket Counts Are Correct</a>
1. Click My Open Tickets
1. Assert that the number of My Open Tickets matches the search results
1. Click Need Response
1. Assert that the number of Need Response tickets matches the search results
1. Click In Progress
1. Assert that the number of In Progress tickets matches the search results   
<a href="#CreateATicket" name="CreateATicket">Create A Ticket</a>
1. Click New Ticket
1. Select the account associated with this customer
1. Click Portal Production
1. Click the Continue Without Adding button
1. Click Create Ticket
1. Enter in the <b>Subject</b> field: Partner Basic Test
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
1. Enter: "This is a customer test" in the Description
1. Click the Save button
1. Enter the name of the account used in the search field (e.g. ABCDEFG)
1. Assert only one ticket was created.
1. Click the newly created ticket (ABCDEFG-123).
1. Assert this ticket has been assigned to a Liferay Support Engineer.
1. Assert that the customer cannot change the Status of the ticket.
1. Assert that the ticket is pending Liferay.
1. Assert that the Liferay comments tab does not display.
1. Assert that the Workers comments tab does not display.    
<a href="#AddAComment" name="AddAComment">Add A Comment</a>
1. Click the Add Comment link.
1. Click the Bold button.
1. Enter text between the bold formatting brackets.
1. Click the Italics button.
1. Enter text between the italics formatting brackets.
1. Click the Underline button.
1. Enter text between the underline formatting brackets.
1. Click the Quotes button.
1. Enter text between the quotation formatting brackets.
1. Click the Code button.
1. Enter text between the code formatting brackets.
1. Click Reply.
1. Assert that the first line of text is in bold.
1. Assert that the second line of text is in italics.
1. Assert that the third line of text is underlined.
1. Assert that the fourth line of text is in quotation marks.
1. Assert that the fifth line of text is in a code box.    
![customer-comment01](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/customers/images/customer-comment01.png)
1. Assert that users cannot edit the last comment.
1. Click the Add Comment link.    
<a href="#AddAnAttachment" name="AddAnAttachment">Add An Attachment</a>
1. Enter 'This is a draft' in the Comments field.
1. Click the Save as Draft button.
1. Click the Edit link.
1. Click the Browse button.
1. Upload an image file.
1. Click Publish.
1. Assert that the second comment has been published.
1. Assert that the user cannot edit the first comment.
1. Assert that the user cannot edit the second comment.
1. Assert that the user cannot change the assignee.
1. Click the Close Ticket button.
1. Select 'Duplicate' from the drop down.
1. Enter 'This is a duplicate' in the Comment field.
1. Click the Close Ticket button.
1. Assert that 'Your request completed successfully' displays.
1. Assert that 'Closed' displays as the Status.
1. Assert that 'Duplicate' displays as the Resolution.
1. Assert that the Reopen button displays.
1. Click the Reopen button.
1. Click OK in the confirmation window.
1. Assert that 'Your request completed successfully' displays.
1. Assert that 'Reopened' displays as the Status.
1. Assert that 'N/A' displays in the Resolution field.
1. Click the Collapse All link.
1. Assert that the comments display a minimal view.
1. Click the Expand All link.
1. Assert that the comments display the full view.    
<a href="#AssertTopPermalink" name="AssertTopPermalink">Assert Top Permalink</a>
1. Click the Click For Permalink link.
1. Copy the URL.
1. Open a new browser window.
1. Paste the URL in the URL field.
1. Assert that the full ticket displays without signing a second time.
