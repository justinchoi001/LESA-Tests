Restrict Moving License Types
=============================

#### Prerequisites: ####
* Liferay OSB Account Admin account, or
* Liferay OSB Admin account


#### Description: ####
This test is designed to verify that Account Admins cannot move licenses to a different product; license keys are allowed to be moved to the same offering of the same product. 

This test is a continuation of the OSB Admin - Create Account, OSB - Create Offering, OSB - Create Order, and Generate License.

****

#### Road Map: ####
1. [Sign In As An OSB Account Admin](#SignInAsOSBAccountAdmin)
1. [Create the first offering](#CreateTheFirstOffering)
1. [Create the second offering](#CreateTheSecondOffering)
1. [Create the third offering](#CreateTheThirdOffering)
1. [Add three orders](#AddThreeOrders)
1. [Generate License](#GenerateLicense)
1. [Attempt to Move License](#AttemptToMoveLicense)

****

#### Test Steps: ####
1. <a href="#SignInAsOSBAccountAdmin" name="SignInAsOSBAccountAdmin"></a>Sign into the test server.
1. Click Control Panel > OSB Admin.
1. Click OSB Admin > Sales    
<a href="#CreateTheFirstOffering" name="CreateTheFirstOffering">Create The First Offering</a>
1. Click the Offerings tab.
1. Select **Non-Production** from the Product list.
1. Select **Americas English Gold** from the Support List.
1. Click Search.
1. Assert that only Non-Production products display in the Product column.
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
<a href="#CreateTheSecondOffering" name="CreateTheSecondOffering">Create The Second Offering</a>
1. Create a second offering using the following steps:
1. Click the Add Offering button.
1. Select **Portal Non-Production** from the Product dropdown.
1. Select **60 Days** from the License Lifetime.
1. Enter **2** in the Servers field.
1. Select **Americas English Gold** from the Support dropdown.
1. Select **60 days** from the Support Lifetime dropdown.
1. Enter **4** in the Support Servers field.
1. Click the checkbox for Unlimited Support Tickets.
1. Select **USD** from the Currency dropdown.
1. Click the Save button.
1. Assert that the success message displays.    
<a href="#CreateTheThirdOffering" name="CreateTheThirdOffering">Create The Third Offering</a>
1. Create a third offering using the following steps:
1. Click the Add Offering button.
1. Select **Portal Limited** from the Product dropdown.
1. Select **60 Days** from the License Lifetime.
1. Enter **2** in the Servers field.
1. Select **Americas English Gold** from the Support dropdown.
1. Select **60 days** from the Support Lifetime dropdown.
1. Enter **4** in the Support Servers field.
1. Click the checkbox for Unlimited Support Tickets.
1. Select **USD** from the Currency dropdown.
1. Click the Save button.
1. Assert that the success message displays.    
<a href="#AddThreeOrders" name="AddThreeOrders">Add Three Orders</a>
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
1. Create a second order
1. Click the Add Order button.
1. Select **USD** fro the Currency dropdown.
1. Click the Next button.
1. Select **Acme Portal** from the Account dropdown.
1. Click the Add Offering button.
1. Select **Portal Non-Production** from the Product dropdown.
1. Select **Americas English Gold** from the Support Dropdown.
1. Click the Search button.
1. Click 'Portal Non-Production - 60 Days - Americas English Gold - 60 Days' (created from OSB Admin - Create Offering)
1. Select **4** from the CPU Cores dropdown.
1. Click the Save button.
1. Assert the success message 'Your request completed successfully' displays.
1. Create the third order
1. Click the Add Order button.
1. Select **USD** fro the Currency dropdown.
1. Click the Next button.
1. Select **Acme Portal** from the Account dropdown.
1. Enter **11234** in the Actual Price field.
1. Click the Add Offering button.
1. Select **Portal Limited** from the Product dropdown.
1. Select **Americas English Gold** from the Support Dropdown.
1. Click the Search button.
1. Click 'Portal Limited - 60 Days - Americas English Gold - 60 Days' (created from OSB Admin - Create Offering)
1. Select **3** from the CPU Cores dropdown.
1. Click the Save button.
1. Assert the success message 'Your request completed successfully' displays.    
<a href="#GenerateLicense" name="GenerateLicense">Generate License</a>
1. Click Go to > User Profile
1. Click License
1. Stay on the Portal tab.
1. Click Generate New License
1. Select the **ACMEPORTAL** from the Account dropdown.
1. Select **6.1 GA3** from the Lifery Version dropdown.
1. Select **Portal Non-Production** from the Product dropdown.
1. Select **Portal Non-Production (Production)** from the Type dropdown.
1. Assert that the start date is today (if not pro-rated).
1. Assert that the Lifetime is set to 30 days.
1. Assert that there are License Keys Available    
![screenshot01](https://github.com/liferay/liferay-qa-ee/raw/master/licensing/images/generatelicense01.png)
1. Click the Choose button
1. Enter a host name in the Host Name field.
1. Enter all IP addresses associated with this host name.
1. Enter any MAC Addresses associated with this host name.
1. Click the Generate button.    
![screenshot02](https://github.com/liferay/liferay-qa-ee/raw/master/licensing/images/generatelicense02.png)
1. Click Move License    
![restrict01](https://github.com/liferay/liferay-qa-ee/raw/master/licensing/images/restrictlicense01.png) 
1. Assert that the Choose button displays next to only **Portal Non-Production** Offerings
1. Assert that the Choose button does not display next to **Portal Limited**