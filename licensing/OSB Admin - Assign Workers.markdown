OSB Admin - Assign Workers
==========================

#### Prerequisites: ####
* Liferay OSB Admin account


#### Description: ####
This test is designed to have users add workers to an account. 'Workers' in this context refer to employees in the Support and Sales Departments who regularly service this account. They do not work on the tickets but convey the customer's needs, goals, and priorities to Liferay. At the same time, these workers also convey how Liferay support and portal can meet the customer's needs and goals. 'Workers' can also refer to Liferay Partners; partners are companies who market and sell Liferay's portal to their customers and are entitled to escalate tickets to Liferay. 

This test is also a continuation of the OSB Admin - Create Account test.

****
1. Navigate to http://www-uat.liferay.com
1. Sign in as OSB Admin
1. Click the Menu drop down > Control Panel
1. Click OSB Admin > Accounts
1. Enter *ACMEPORTAL* in the Code field.
1. Click Search.
1. Click Acme Portal link.    
![assignworkers01.png](https://github.com/liferay/liferay-qa-ee/raw/master/licensing/images/assignworkers01.png)
1. Click the Assign Workers button.    
![assignworkers02.png](https://github.com/liferay/liferay-qa-ee/raw/master/licensing/images/assignworkers02.png)
1. Click the Available tab.
1. Enter the following:    
	(a) **First Name:**	first name (e.g. Jane)    
	(b) **Last name:**	last name	(e.g. Smith)    
1. Click the Search button.
1. Assert that the search returns a valid name.
1. Select "Sales Manager" from the Role dropdown.    
![assignworkers03.png](https://github.com/liferay/liferay-qa-ee/raw/master/licensing/images/assignworkers03.png)
1. Click Update Associations
1. Click the Current tab.
1. Assert that the newly assigned Worker appears here.