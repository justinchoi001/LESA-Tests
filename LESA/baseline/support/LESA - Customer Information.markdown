LESA - Customer Information
===========================

#### Prerequisites: ####
* Liferay Experience Manager account


#### Description: ####
This test is designed to have users verify the basic functionality of the customer information tabs. The functionality is designed for Liferay Experience Managers and Sales Reps to enter information about the customer such as account information and any Global Services projects. Only workers assigned to that account will be able to make changes.

****
#### Road Map: ####
1. [Sign In As Liferay EM](#SignInAsLiferayEM)


****

#### Test Steps: ####
1. <a href="#SignInAsLiferayEM" name="SignInAsLiferayEM"></a>Navigate to http://www-support-2.liferay.com
1. Click the Main Menu drop down > Customer Portal
1. Click LESA.
1. In the Basic Search, search for an account and ticket that the Experience Manager is assigned to.
1. Click any ticket (e.g. ABCDEF-123) then click the account link in the Ticket Info. 
1. Assert there are three tabs: Account Information, Customer Information, and Global Services.    
![account information](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/support/images/customer-information01.jpg)
1. Click the Customer Information tab.
1. Assert that only Liferay workers assigned to that account can edit.
1. Click Edit in the On-Boarding Contact section.
1. Enter the following: 123 Main Street, Anytown, CA 90210
1. Click the Save button.
1. Assert that "Your request completed successfully." message displays.
1. Assert that the address has been added.
1. Click the Collapse button for On-Boarding Contact.
1. Assert that the field is collapsed.
1. Click the Add Account Call button.
1. Assert the pop up displays.    
![add account call](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/support/images/customer-information02.jpg)
1. Enter the following:    
	(a) Call Type: Outgoing    
	(b) Call Date: {today's date}    
	(c) Call Length: 1:30:15    
	(d) Summary: Resolving clustering issues    
	(e) Clients Present: Hannibal Smith, B.A. Baracus, H.M. Murdoch, Templeton Peck    
	(f) Notes: {none}    
	(g) Action Items: Escape to LA.
1. Click the Save button.
1. Click the Global Services tab.
1. Click the Add Project button.
1. Enter the following:    
	(a) Project name: Mexican Slayride    
	(b) Client Contacts: Amy    
	(b) Liferay Contacts: Alfred    
	(d) Type of Project /Project Dates: Help Mexican villagers    
	(e) General notes: {none}   
	(f) Debrief of Project: {none}    
1. Click the Save button.    
![add gs project](https://github.com/liferay/liferay-qa-ee/raw/master/LESA/baseline/support/images/customer-information03.jpg)
1. Click the Manage Attachment button.
1. Upload an image.
1. Click Save
1. Click the Manage Links button.
1. Enter a link.
1. Click Save.

