Patcher Portal - Incorporate New Fixes
======================================

####Prerequisites: ####

* Patcher Portal credentials

####Description: ####
This test is designed to test how updated fixes are incorporated into existing builds.

#### Test Steps: ####
1. Navigate to Patcher Staging
1. Sign in as administrator.
1. Click the Fixes tab.
1. Click the Create Fix button.
1. Select *6.x* from the Product Version drop down menu.
1. Select *liferay-portal-ee 6.1.30* from Project Version.
1. Enter the following:    
	a) Patcher Fix Name: 	LPEALPHAFIX-11    
	b) Branch Name:	LPEALPHA-1    
	c) GitHub URL: git@github.com:EddieOlson/liferay-portal-ee.git
1. Click the Save button.
1. Assert that LPEALPHAFIX-11 has been created.
1. Click the Builds tab.
1. Click on any account
1. Click the Create Build button
1. Select *6.x* from the Product Version drop down menu.
1. Select *6.1.30* from the Project Version drop down menu.
1. Enter in the appropriate metadata:    
	a) **Portal Version**: 6.1.30    
	b) **Tickets List**: LPEALPHAFIX-11    
	c) **Account Name**: ACME    
	d) **Ticket Name**: 101
1. Click "Add".
1. Assert that the Build ACME-101 has been created.
1. Click on the Fixes tab.
1. Click Actions > Edit for LPEALPHAFIX-11
1. Click Update.
1. Assert that the Version column displays 1.1 once the fix has been updated
1. Click the Builds tab.
1. Assert that the light bulb icon indicating a build is obsolete displays    
![image01](../images/new-fixpack01.png)
1. Click the Account containing the build    
![image04](../images/new-fixpack04.png)
1. Click Actions > Edit for ACME-101
1. Click Update
1. Assert that the Version column displays 1.1 once the fix has been updated
1. Assert that the light bulb icon indicating a build is obsolete does not display    
![image03](../images/new-fixpack03.png)