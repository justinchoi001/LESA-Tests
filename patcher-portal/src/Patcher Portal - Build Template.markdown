Patcher Portal - Build Template
=============================== 

####Prerequisites: ####

* Patcher Portal credentials

####Description: ####
This test is designed to have the user use an existing build as a template for a second build. Users often have to extend an existing build to include new LPEs or fix packs.


#### Road Map: ####
1. [Create A Fix](#CreateAFix)
1. [Create a Second Fix](#CreateASecondFix)
1. [Create a Third Fix](#CreateAThirdFix)
1. [Create a Build](#CreateABuild)
1. [Create a Second Build Using a Template](#CreateASecondBuildUsingATemplate)
****

####Test Steps: ####
1. <a href="#CreateAFix" name="CreateAFix"></a>Navigate to https://http://cloud-10-50-0-130/
1. Sign in as administrator.
1. Click the Patcher Portal Page.
1. Click the Fixes tab.
1. Click the Create Fix button.
1. Select *6.x* from the Product Version drop down menu.
1. Select *liferay-portal-ee 6.1.30* from Project Version.
1. Enter the following:    
	a) Patcher Fix Name: 	LPEALPHAFIX-1    
	b) Branch Name:	LPEALPHA-1    
	c) GitHub URL: git@github.com:EddieOlson/liferay-portal-ee.git
1. Click the Save button.
1. Assert that the LPEALPHAFIX-1 has been created.    
<a href="#CreateASecondFix" name="CreateASecondFix">Create A Second Fix</a>
1. Click the Create Fix button.
1. Select *6.x* from the Product Version drop down menu.
1. Select *liferay-portal-ee 6.1.30* from Project Version.
1. Enter the following:    
	a) Patcher Fix Name: 	LPEALPHAFIX-2    
	b) Branch Name:	LPEALPHA-2    
	c) GitHub URL: git@github.com:EddieOlson/liferay-portal-ee.git
1. Click the Save button.
1. Assert that the LPEALPHAFIX-2 has been created.    
<a href="#CreateAThirdFix" name="CreateAThirdFix">Create A Third Fix</a>
1. Click the Create Fix button.
1. Select *6.x* from the Product Version drop down menu.
1. Select *liferay-portal-ee 6.1.30* from Project Version.
1. Enter the following:    
	a) Patcher Fix Name: 	LPEALPHAFIX-11    
	b) Branch Name:	LPEALPHA-1    
	c) GitHub URL: git@github.com:EddieOlson/liferay-portal-ee.git
1. Click the Save button.
1. Assert that the LPEALPHAFIX-11 has been created.    
<a href="#CreateABuild" name="CreateABuild">Create A Build</a>
1. Click any account.
1. Click Create Build.
1. Select *6.x* from the Product Version drop down.
1. Select *6.1.30* from Portal Version.
1. Enter the following in the Tickets List:    
	 *LPEALPHAFIX-1, LPEALPHAFIX-2*.
1. Enter *ACME* in the Account Code field.
1. Enter *3* in the Ticket Name field.
1. Click the Add button.
1. Wait until the build is completed.    
<a href="#CreateASecondBuildUsingATemplate" name="CreateASecondBuildUsingATemplate">Create A Second Build Using A Template</a>
1. Click Actions > Use as Build Template.    
![screenshot](../images/build-template.png)
1. Enter the following in the Tickets List:    
	 *LPEALPHAFIX-1, LPEALPHAFIX-2, LPEALPHAFIX-11*.
1. Enter *4* in the Ticket Name field.
1. Click the Add button.