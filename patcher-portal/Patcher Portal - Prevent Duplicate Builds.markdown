Patcher Portal - Prevent Duplicate Builds
=========================================

####Prerequisites: ####

* Patcher Portal credentials

####Description: ####
This test is designed to test the prevention of creating duplicate builds. Users will create a valid build and then attempt to create the same build again. The system should return an error message that the build already exists. This test is not product version specific.


####Test Steps: ####
1. Navigate to Patcher Staging
1. Sign in as administrator.
1. Click the Fixes tab.
1. Click the Create Fix button.
1. Select *6.x* from Product Version drop down menu.
1. Select *liferay-portal-ee 6.1.30* from the Project Version drop down menu.
1. Enter the following:    
	a) Patcher Fix Name: 	LPEALPHAFIX-11    
	b) Branch Name:	LPEALPHA-1    
	c) GitHub URL: git@github.com:EddieOlson/liferay-portal-ee.git
1. Click the Save button.
1. Assert that LPEALPHAFIX-11 has been created.
1. Click the Create Fix button.
1. Select *6.x* from Product Version drop down menu.
1. Select *liferay-portal-ee 6.1.30* from the Project Version drop down menu.
1. Enter the following:    
	a) Patcher Fix Name: 	LPEALPHAFIX-12    
	b) Branch Name:	LPEALPHA-2    
	c) GitHub URL: git@github.com:EddieOlson/liferay-portal-ee.git
1. Click the Save button.
1. Assert that LPEALPHAFIX-12 has been created.
1. Click the "Accounts" tab.
1. Click the top account (does not matter which customer).
1. Click "Create Build." 
1. Select *6.x* from Product Version drop down menu.
1. Select *6.1.30* from the Project Version drop down menu. 
1. Enter in the appropriate metadata:    
	a) **Portal Version**: 6.1.30    
	b) **Tickets List**: LPEALPHAFIX-11,LPEALPHAFIX-12    
	c) **Account Name**: ACMEPORTAL    
	d) **Ticket Name**: ACMEPORTAL-2
1. Click "Add." 
1. Assert that the message "Your request completed successfully." displays.
1. Click on the "Accounts" tab.
1. Select a different account other than ACMEPORTAL
1. Click "Create Build." 
1. Select *6.x* from Product Version drop down menu.
1. Select *6.1.30* from the Project Version drop down menu. 
1. Enter in the appropriate metadata:    
	a) **Portal Version**: 6.1.30    
	b) **Tickets List**: LPEALPHAFIX-11,LPEALPHAFIX-12    
	c) **Account Name**: ACMEPORTAL    
	d) **Ticket Name**: ACMEPORTAL-2
1. Click "Add." 
1. Assert that the message that "The build name already exists." displays.