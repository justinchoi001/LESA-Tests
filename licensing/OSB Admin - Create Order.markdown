OSB Admin - Create Order
========================

#### Prerequisites: ####
* Liferay OSB Admin account


#### Description: ####
This test is designed to have users add an order. Orders contain multiple offerings and start date for support. Provision can also pro-rate orders. In this test, users will add an order to be associated with Acme Portal. Users should note the UUID; this number can be used to register licenses in lieu of deploying an XML file.

This test is a continuation of OSB Admin - Create Account and OSB Admin - Create Offerings

****
1. Navigate to http://www-uat.liferay.com
1. Sign in as OSB Admin
1. Click the Menu drop down > Control Panel
1. Click OSB Admin > Sales
1. Click the Orders tab.
1. Click the Add Order button.
1. Select **USD** fro the Currency dropdown.
1. Click the Next button.
1. Select **Acme Portal** from the Account dropdown.
1. Click the Add Offering button.
1. Select **Portal Non-Production** from the Product dropdown.
1. Select **Americas English Gold** from the Support Dropdown.
1. Click the Search button.
1. Click 'Portal Non-Production - 30 Days - Americas English Gold - 30 Days' (created from OSB Admin - Create Offering)
1. Select **5** from the CPU Cores dropdown.
1. Click the Save button.
1. Assert the success message 'Your request completed successfully' displays.
1. Click Last to go to the last page.
1. Assert that the newly created order displays. (If not on the last page, check the second to last.)    
![order01](https://github.com/liferay/liferay-qa-ee/raw/master/licensing/images/order01.png)
