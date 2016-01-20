Patcher Portal - Versioning 
===========================

####Prerequisites: ####

* Patcher Portal credentials

####Description: ####
This test is designed to have the user create a fix and then create a new version of the fix. Once a new version has been created, the user will assert that it will be built automatically. The user will then verify that the new version is included in an existing build. The user will do the same for a build.

####Test Steps: ####
1. Navigate to Patcher Staging
1. Sign in as administrator.
1. Click the Fixes tab.
1. Click the Create Fix button.
1. Select *6.1.30* from Portal Version.
1. Enter the following:    
	a) Patcher Fix Name: 	LPEALPHAFIX-11    
	b) Branch Name:	LPEALPHA-1    
	c) GitHub URL: git@github.com:EddieOlson/liferay-portal-ee.git
1. Click the Save button.
1. Assert that LPEALPHAFIX-11 has been created.
1. Click the "Builds" tab.
1. Click "Add Build." 
1. Enter in the appropriate metadata:    
	a) **Portal Version**: 6.1.30    
	b) **Tickets List**: LPEALPHAFIX-11    
	c) **Account Name**: (leave blank)    
	d) **Ticket Name**: (leave blank)
1. Click "Save." 
1. Assert that the message "Your request completed successfully." displays.
1. Click the Fixes tab.
1. Click Actions > Edit for LPEALPHAFIX-11.
1. Click the Save button (no need to make actual changes).
1. Assert that "Your request completed successfully." displays.
1. Assert that the Status is changed to Adding.
1. After several minutes, assert that the process is completed.
1. Assert that LPEALPHAFIX-1 has version 1.1.
1. Click the "Builds" tab.
1. Click Actions > Edit for LPEALPHAFIX-11
1. Click the Save button (no need to make actual changes).
1. Assert that "Your request completed successfully." displays.
1. Once the build is complete, click Actions > View Fixes.
1. Assert that the build LPEALPHAFIX-1 has version 1.1.