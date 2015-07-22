OSB Admin - Create Account
==========================

#### Prerequisites: ####
* Liferay OSB Admin account


#### Description: ####
This test is designed to have users create an account. Note that the Business Account Name field is not used in the index when searching for projects on the main page. Projects and Code can be used when searching for an account.

****
1. Navigate to http://www-uat.liferay.com
1. Sign in as OSB Admin
1. Click the Menu drop down > Control Panel
1. Click OSB Admin > Accounts
1. Click the Add Account button.
1. Enter the following:    
	(a)	**Business Account Name:**	{company name} e.g. Acme Inc.    
	(b) **Project Name:**	{project name} e.g. Acme Portal    
	(c)	**Code:**	ACMEPORTAL    
1. Select the following:   
	(a)	**Type:**	Group    
	(b)	**Industry:**	Telecommunications    
	(c)	**Tier:**	Strategic    
1. Enter **10** in the Maximum Contacts Field.
1. Enter the following in the Special Instructions field:    
	This is the special instructions field. Put all important updates here.
1. Enter the following:
	(a) *Address:** 	123 Main Street    
	(b) **Country:**	United States    
	(c) **State/Provices:**	Maine    
	(d) **City:**	Any Town    
	(e) **Postal Code:**	12345
1. Click Save.
1. Assert that Acme Portal has been created.
