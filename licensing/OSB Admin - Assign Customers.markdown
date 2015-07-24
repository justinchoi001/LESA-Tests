OSB Admin - Assign Customers
============================

#### Prerequisites: ####
* Liferay OSB Admin account


#### Description: ####
This test is designed to have users add customers to an account. When assigning a customer, select a role: Manager, Developer, Sales and Watcher. Watchers have no rights to add comments or give feedback on tickets. They monitor the progress of tickets. Administrators can also set the amount of email notifications sent to the customer.

This test is also a continuation of the OSB Admin - Create Account test.

****
1. Navigate to http://www-uat.liferay.com
1. Sign in as OSB Admin
1. Click the Menu drop down > Control Panel
1. Click OSB Admin > Accounts
1. Enter *ACMEPORTAL* in the Code field.
1. Click Search.
1. Click Acme Portal link.    
1. Click the Assign Customers button.
1. Click the Available tab.
1. Search for a customer by first name and last name
1. Select **All** from the Notifications dropdown.
1. Select **Developer** from the Role dropdown.
1. Click the Update Associations button.
1. Assert that the customer displays on the Current tab.
1. Assert that Notifications is set to **All**.
1. Assert that Role is set to **Developer.**