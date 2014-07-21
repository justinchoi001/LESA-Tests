OSB Admin - Reduce Number of License Keys
=========================================

#### Prerequisites: ####
* Liferay OSB Admin account


#### Description: ####
This test is designed to have users reduce the number of license keys available to a Liferay subscriber. Users cannot reduce the number of license keys available if the user has used the maximum number of licenses and has opened tickets under that license. This is true especially for older active accounts. 

****

#### Test Steps: ####
1. Navigate to http://www-uat.liferay.com
1. Sign in as OSB Admin
1. Click the Menu drop down > Control Panel
1. Click OSB Admin > Accounts
1. Select an account whose End of Support is next year AND who has unused licenses for Portal Non-Production
1. Click the View Orders button
1. Click the Order ID link for that account
1. In the Portal Non-Production Quantity box, reduce the number by 1
1. Click Recalculate
1. Click Save
1. Assert the "Your request completed successfully" message displays.