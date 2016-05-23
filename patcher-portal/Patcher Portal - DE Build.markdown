Patcher Portal - Digital Enterprise Build 
=========================================

####Prerequisites: ####

* Patcher Portal credentials
* Patching Tool Support Info File.

####Description: ####
This test is designed to have the user create a 7.x fix and a 7.x build. In 7.x (alternately Digital Enterprise or DE), fixes are no longer patched for the entire portal but for specific modules based on components or a group of components. The default base is known as fix-pack-base-7000. Other modules will have a different base. For testing purposes, use fix-pack-base-7000 data. Users will also require a patching tool support info file that should contain the list of 7.x modules. 

####Test Steps: ####
1. Navigate to Patcher Staging
1. Sign in as administrator.
1. Click the Fixes tab.
1. Click the Create Fix button.
1. Select *7.x* from Product Version drop down menu.
1. Enter the following:    
	a) Patcher Fix Name: 	LPEDELTAFIX-33    
	b) Branch Name:	LPEDELTA-33    
	c) GitHub URL: git@github.com:vishal-reddy/liferay-portal-ee.git
1. Click the Add button.
1. Assert that LPEDELAFIX-33 has been created.
1. Click the "Builds" tab.
1. Click the top account (does not matter which customer).
1. Click "Create Build." 
1. Select *7.x* from Product Version drop down menu.
1. Select *fix-pack-base-7000* from the Project Version drop down menu. 
1. Enter in the appropriate metadata:    
	a) **Tickets List**: LPEDELTAFIX-33    
	b) **Account Name**: ACMEPORTAL    
	c) **Ticket Name**: ACMEPORTAL-5
1. Click Browse...
1. Upload the patching tool support info file.
1. Click "Add." 
1. Assert that the message "Your request completed successfully." displays.
1. Assert that the Patcher Status column displays **Complete**.