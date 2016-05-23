Patcher Portal - Error Message
==============================

####Prerequisites: ####

* Patcher Portal credentials

####Description: ####
This test is designed to have the user verify that whenever users add a non-existing Fix in a new build, the system will display an error message. The error message will state which Fix(es) are missing. This can happen when a user has added a Fix to a Build before the Fix has finished compiling, or when a Fix does not exist at all.

####Test Steps: ####
1. Navigate to Patcher Staging
1. Click the Accounts tab
1. Click on any account link
1. Click the Create Build button
1. Select *6.x* from the Product Version.
1. Select *6.1.30* from Portal Version.
1. Enter the following:    
	a) Tickets List: 	*any LPEs that do not exist* (e.g. LPEALPHAFIX-100, LPEALPHAFIX-1001)    
	b) Account Code: ACME    
	c) Ticket Name: 1
1. Click the Add button.
1. Assert the following message displays:    
![screenshot](https://github.com/liferay/liferay-qa-ee/raw/master/patcher-portal/images/build-error-message.png)
	