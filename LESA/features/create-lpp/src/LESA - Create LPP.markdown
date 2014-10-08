LESA - Create LPP Tickets
=========================
****
#### Prerequisites: ####
* Liferay CSE account
* JIRA account

#### Description: ####
This test is designed to have users create LPP tickets based on a LESA ticket. The Create LPP Ticket button is synchronized with JIRA to create patches based on the environment and requirements from the ticket. Users should also have an active JIRA account. 

On the JIRA ticket, there are three tabs: Main, LESA, and Environment.

* The Main tab contains fields for more information about the issue. Most notably is the Components drop down. The components listed do not match LESA's component list. Some time in the future, LESA Components will match the JIRA components. The JIRA components list is much more detailed and users should try to find the component that best matches the original LESA ticket.
* The LESA tab contains the permalink, the creation date, the account code, and account name.
* The Environment tab is already populated the same details from the LESA ticket.

The following fields are not imported from LESA to JIRA:

* Attachments such as portal-ext.properties and patch info level 
* Links
* Ticket Info
* Summary
* Description. This is blank in JIRA. Users will have to copy or enter new information.
* All comments.

****
#### Road Map: ####
1. [Sign In As Liferay CSE](#SignInAsLiferayCSE)

****

#### Test Steps: ####
1. <a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE"></a>Navigate to http://www-uat.liferay.com
1. Sign in as a Liferay CSE.
1. Click the portrait Main Menu drop down.
1. Click Account Home > Support
1. Click any ticket.
1. Select "Patch" from the Select Issue Type drop down.
1. Click the "Create LPP Ticket" button.
1. Assert that a new browser window or tab opens to JIRA at http://issues.liferay.com
1. Sign into JIRA if not already signed in.
1. Click the Environments tab.
1. Assert that the pre-populated values match those on the ticket.    
![environments](../images/create-lpp-env.jpg)
1. Click the LESA tab.
1. Assert that the pre-populated values match those on the ticket.    
![LESA](../images/create-lpp-lesa.jpg)
1. Click the Main tab.
1. Copy the Summary from the LESA ticket.
1. Enter a description; copy as much information from the LESA ticket.
1. Select the same Component or one that best matches the issue.    
![main01](../images/create-lpp-main01.jpg)
1. Assert that the Affects Version has been properly imported from the LESA ticket
1. Select the correct version from the Issues Fixed in drop down
1. Assert that the Support Office is the correct office
1. Enter a Due Date    
![main02](../images/create-lpp-main02.jpg)
1. Click the appropriate radio button for SSA.
1. Click Create    
![main03](../images/create-lpp-main03.jpg)
1. Assert that the LPP ticket has been created.    
![jira](../images/create-lpp-jira.jpg)
