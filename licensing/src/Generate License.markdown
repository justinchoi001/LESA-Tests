Generate A License
==================

#### Prerequisites: ####
* Liferay OSB Account Admin account
* Liferay OSB Admin account


#### Description: ####
This test is designed to have a user generate the XML license. Provisioning team members can generate a license two ways: generating an Order ID or by generating an XML file. This test covers the latter instance.

This test is a continuation of the OSB Admin - Create Account and the OSB - Create Offering.

****

#### Test Steps: ####
1. Navigate to http://www-uat.liferay.com
1. Sign in as OSB Admin
1. Click the Menu drop down > Account Home
1. Click License
1. Stay on the Portal tab. 
1. Click the Generate New License button.
1. Select the **ACMEPORTAL** from the Account dropdown.
1. Select **6.1 GA3** from the Lifery Version dropdown.
1. Select **Portal Non-Production** from the Product dropdown.
1. Select **Portal Non-Production (Production)** from the Type dropdown.
1. Assert that the start date is today (if not pro-rated).
1. Assert that the Lifetime is set to 30 days.
1. Assert that there are License Keys Available    
![screenshot01](../images/generatelicense01.png)
1. Click the Choose button
1. Enter a host name in the Host Name field.
1. Enter all IP addresses associated with this host name.
1. Enter any MAC Addresses associated with this host name.
1. Click the Generate button.    
![screenshot02](../images/generatelicense02.png)
1. Click Download License File.