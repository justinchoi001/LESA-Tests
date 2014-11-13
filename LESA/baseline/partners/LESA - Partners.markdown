LESA - Partners
===============

#### Prerequisites: ####
* Liferay Partner account


#### Description: ####
This test is designed to assert basic functionality and permissions granted to Liferay Partner view on LESA. Users will sign in as a Partner and create a ticket, edit the ticket status and details, and add a comment to the ticket.

****

#### Road Map ####
1. [Sign In As Partner](#SignInAsPartner)
1. [Verify Ticket Counts Are Correct](#VerifyTicketCountsAreCorrect)
1. [Create A Ticket](#CreateATicket)
1. [Change Ticket Status](#ChangeTicketStatus)
1. [Verify Comments Display In The Right Tabs](#VerifyCommentsDisplayInTheRightTabs)

****


#### Test Steps: ####
1. <a href="#SignInAsPartner" name="SignInAsPartner"></a>Navigate to http://www-uat.liferay.com
1. Click the Menu drop down
1. Click Sign In
1. Sign in with Liferay Partner credentials
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
1. Select an account
1. Click Portal Production
1. Click the Continue Without Adding button
1. Click Create Ticket
1. Enter in the <b>Provide a summary</b> field: Partner Basic Test
1. Select Document Library from the Component drop down
1. Select <b>System Status</b>: Completely Inoperable / Shutdown    
![image02](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/partners/images/LESA-partners/LESA-partners02.jpg)
1. Enter: "This is a partner test" in the Description
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
1. Enter the name of the account used in the search field (e.g. ABCDEFG)
1. Assert only one ticket was created.
1. Click My Open Tickets
1. Select a ticket that has been assigned to this particular partner
1. Click the Status drop down
1. Select Closed
1. Select Duplicate in the Resolution drop down
1. Assert the ticket is now closed
1. Click the Reopen button
1. Click OK in the pop up window
1. Assert "Reopened" displays in the Status box
1. Assert "Liferay, Partner" displays in the Pending Box    
<a href="#VerifyCommentsDisplayInTheRightTabs" name="VerifyCommentsDisplayInTheRightTabs">Verify Comments Display In The Right Tabs</a>
1. Click Add Comment
1. Enter: "This is a comment with an attachment"
1. Click the Save as Draft button
1. Assert that a pop up window displays with a message: "Did you mean to attach files? You wrote "attach" in the message but there are no files attached. Submit anyway?"
1. Click OK
1. Assert that the comment has been published as a Draft    
![image01](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/partners/images/LESA-partners/LESA-partners01.jpg)    
1. Click the Workers tab
1. Click Add Comment
1. Enter: "This is a comment in the Workers tab"
1. Click Reply
1. Assert that "Please select a valid need Response from."
1. Flag the Partner check box.
1. Click Reply
1. Assert that the comment has been published
1. Click the Public tab.
1. Assert that the Worker comment does not display in the Public section
1. Click Back to Previous Page
1. Select a ticket whose assignee is not the partner and that the partner has worked on.
1. Click the Watch Ticket button
1. Assert that the message "Your request completed successfully" displays.
1. Click Add Comment
1. Enter: "This is a comment." in the Comments field
1. Check the "Need Response from Customer" check box
1. Click the Add Attachment button
1. Upload an image file. 
1. Click Reply
1. Assert that the comment displays
1. Assert that the image link displays 
1. Click the Unwatch Ticket button
1. Assert that the message "Your request completed successfully" displays.
1. Assert that the Liferay comments tab is hidden.