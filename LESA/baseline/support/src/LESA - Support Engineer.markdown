LESA - Support Engineers
========================

#### Prerequisites: ####
* Liferay Customer Support Engineer account


#### Description: ####
This test is designed to test the 
****

#### Road Map ####
1. [Sign In As Support](#SignInAsSupport)
1. [Create A Ticket](#CreateATicket)
1. [Add Comments](#AddComments)


****

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
1. Assert that the Public tab displays.
1. Assert that the Workers tab displays.
1. Assert that the Liferay tab displays.
1. Assert that the History tab displays.
1. Assert that the Solutions tab displays.    
<a href="#AddComments" name="AddComments">Add Comments</a>
1. Click Add Comment in the Public tab.
1. Enter a new comment: This is the first comment.
1. Click Reply.
1. Assert that the comment has been published.
1. Click Add Comment in the Public tab.
1. Enter a new comment: This is the second comment.
1. Click Save as Draft.
1. Assert that the comment is saved as a draft.
1. Click the Workers tab.
1. Enter a new comment: This is the first comment in the workers' tab.
1. Click Reply.
1. Assert that the comment has been published.
