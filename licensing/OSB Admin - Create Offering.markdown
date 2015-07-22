OSB Admin - Create Offering
===========================

#### Prerequisites: ####
* Liferay OSB Admin account


#### Description: ####
This test is designed to have users add an offering. An offering is a combination of a product, a level of support, and the currency. The currency set will determine which support region. Provisioning can also set the price, the license lifetime, the number of servers, the number of tickets, and the number of users.

****
1. Navigate to http://www-uat.liferay.com
1. Sign in as OSB Admin
1. Click the Menu drop down > Control Panel
1. Click OSB Admin > Sales
1. Click the Offerings tab.
1. Select **Non-Production** from the Product list.
1. Select **Americas English Gold** from the Support List.
1. Click Search.
1. Assert that only Non-Production products display in the Product columnn.
1. Assert that only Americas English Gold Support display in the Support column.
1. Assert that only USD displays in the Currency column.
1. Click the Add Offering button.
1. Select **Portal Non-Production** from the Product dropdown.
1. Select **30 Days** from the License Lifetime.
1. Enter **1** in the Servers field.
1. Select **Americas English Gold** from the Support dropdown.
1. Select **30 days** from the Support Lifetime dropdown.
1. Enter **5** in the Support Servers field.
1. Click the checkbox for Unlimited Support Tickets.
1. Select **USD** from the Currency dropdown.
1. Click the Save button.
1. Assert that the success message displays.
1. Assert that the new Non-Production offering has been created.    
![offering01](https://github.com/liferay/liferay-qa-ee/raw/master/licensing/images/offering01.png)