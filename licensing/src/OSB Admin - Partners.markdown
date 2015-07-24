OSB Admin - Partners
============================

#### Prerequisites: ####
* Liferay OSB Admin account


#### Description: ####
This test is designed to have users add a partner account, assign workers to this partner account, and then configure an existing account to have this partner manage this account.

This test is also a continuation of the OSB Admin - Create Account test.

****
1. Navigate to http://www-uat.liferay.com
1. Sign in as OSB Admin
1. Click the Menu drop down > Control Panel
1. Click OSB Admin > Partner
1. Click the Add Partner button.
1. Enter the name in the Code field.
1. Select **US** from the Support Region dropdown.
1. Enter a telephone number in the Number field.
1. Click the **Primary** radio button.
1. Enter the following:    
	(a) **Street 1:**	 224 Main Street    
	(b) **Street 2:**	Suite 16    
	(c) **Country:**	United States    
	(d) **Region:**		Louisiana    
	(e) **Postal Code**	70801    
	(f) **City:**		Baton Rouge    
1. Click the **Primary** radio button.
1. Click the Save button.
1. Assert that the success message "Your request completed successfully." displays
1. Assert that the partner displays in the search container.
1. Click Actions > Assign Workers
1. Click the Available tab
1. Search for a worker.
1. Click the checkbox.
1. Select **Manager** from the Role drop down.
1. Click Update Association.
