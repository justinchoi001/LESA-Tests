Patcher Portal - Resolving Build Conflicts
==========================================

####Prerequisites: ####

* Patcher Portal credentials

####Description: ####
This test is designed to have the user resolve conflicting builds. Users will have to create two conflicting builds then resolve them.

####Road Map: ####
1. [Sign In](#SignIn)
1. [Create Two Fixes](#CreateTwoFixes)
1. [Create The Build](#CreateTheBuild)
1. [Resolve The Build](#ResolveTheBuild)

****

####Test Steps: ####
1. <a href="#SignIn" name="SignIn"></a>Navigate to http://cloud-10-50-0-130/
1. Sign in as administrator.    
<a href="#CreateTwoFixes" name="CreateTwoFixes">Create Two Fixes</a>
1. Click the Fixes tab.
1. Click the Create Fix button.
1. Select *6.1.30* from Portal Version.
1. Enter the following:    
	a) Patcher Fix Name: 	LPEBETAFIX-1    
	b) Branch Name:	LPEBETA-1    
	c) GitHub URL: git@github.com:EddieOlson/liferay-portal-ee.git
1. Click the Save button.
1. Assert that LPEBETAFIX-1 has been created.
1. Click the Create Fix button.
1. Select *6.1.30* from Portal Version.
1. Enter the following:    
	a) Patcher Fix Name: 	LPEBETAFIX-2    
	b) Branch Name:	LPEBETA-2    
	c) GitHub URL: git@github.com:EddieOlson/liferay-portal-ee.git
1. Click the Save button.
1. Assert that LPEBETAFIX-2 has been created.    
<a href="#CreateTheBuild" name="CreateTheBuild">Create The Build</a>
1. Click the "Builds" tab.
1. Click "Add Build." 
1. Enter in the appropriate metadata:    
	a) **Portal Version**: 6.1.30    
	b) **Tickets List**: LPEBETAFIX-1, LPEBETAFIX-2    
	c) **Account Name**: (leave blank)    
	d) **Ticket Name**: (leave blank)
1. Click "Save." 
1. Assert that the message "Your request completed successfully." displays.
1. Assert that "Pending Compile" status displays.
1. Assert that the Status URL displays.
1. Assert that the "Pending Conflict" message displays after a few minutes. 
1. Assert that a Git Hash displays.    
<a href="#ResolvingTheConflictingBuild" name="ResolvingTheConflictingBuild">Resolving the Conflicting Build</a>
1. Click on the "Actions" button associated with that build.
1. Click "View Fixes." 
1. Find the "Generated" type fix that is in the "Pending Conflict" status.
1. Click the "Actions" button associated with that fix.
1. Click "Edit." 
1. Enter following:    
	a) **Branch Name**: LPEALPHA-1    
	b) **GitHub URL**: git@github.com:EddieOlson/liferay-portal-ee.git
1. Click the Save button.
1. Refresh the page until the Build is completed.
1. Assert that the Status is Complete
1. Assert there are no conflicts.