Customer Portal - Liferay Sync
==============================

#### Prerequisites: ####
* Liferay CSE account


#### Description: ####
This test is designed to have users verify the basic functionality of customer portal. Users will verify specific links for downloading Liferay Sync.

****
#### Road Map: ####
1. [Sign In As Liferay CSE](#SignInAsLiferayCSE)
1. [Assert Knowledge](#AssertKnowledge)
1. [Assert Documentation](#AssertDocumentation)


****

#### Test Steps: ####
1. <a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE"></a>Navigate to http://www-uat.liferay.com
1. Click Customer Portal.
1. Click Liferay Sync.
1. Assert that the Sync welcome page displays.    
![sync welcome](https://github.com/liferay/liferay-qa-ee/raw/master/customer-portal/images/sync-welcome.jpg)
1. Assert that the Features, Knowledge, Documentation, Matrix, and Create a Ticket links appear.
1. Click the Get it now link to the left.
1. Assert that the portal redirects to the Liferay Download page.
1. Click Download for Liferay Sync.
1. Save the .msi file.
1. Click the Download button for Liferay Sync Mobile.
1. Assert the link redirects to Google Play store.    
![sync mobile download](https://github.com/liferay/liferay-qa-ee/raw/master/customer-portal/images/sync-mobile.jpg)
1. Click Back on the browser several times to return to the welcome page.
1. Click the Features link.
1. Assert that the portal redirects to the Features page.    
![sync features](https://github.com/liferay/liferay-qa-ee/raw/master/customer-portal/images/sync-features.jpg)
1. Click Back on the browser.
1. Click the Knowledge link
1. Assert that the portal directs to Knowledge Base page with Sync articles listed    
![sync kb](https://github.com/liferay/liferay-qa-ee/raw/master/customer-portal/images/sync-kb.jpg)
1. Click Back on the browser
1. Click Documentation
1. Assert that the portal directs to the Documentation page    
![sync documentation](https://github.com/liferay/liferay-qa-ee/raw/master/customer-portal/images/sync-documentation.jpg)
1. Click Back on the browser
1. Click Matrix
1. Assert that the portal directs to the chart showing Sync's compatibility with different environments.    
![sync matrix](https://github.com/liferay/liferay-qa-ee/raw/master/customer-portal/images/sync-matrix.jpg)
1. Click "Create a Ticket"
1. Assert that the portal redirects to LESA. 
