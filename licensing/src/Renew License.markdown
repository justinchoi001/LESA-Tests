Renew A License
==================

#### Prerequisites: ####
* Liferay OSB Account Admin account, or
* Liferay OSB Admin account


#### Description: ####
This test is designed to renew a license using the Renew License button. In the past, Provisioning team members renewed a license the same way they would have for a new license. The Renew button is designed to save time with one click. To test, find an expired license and click the Renew button. Testers will generate an expired license first for testing purposes. Execute this test twice, once for an customer account (ACME Portal) and once for Liferay Trial.

This test is a continuation of the OSB Admin - Create Account and the OSB - Create Offering.

****

#### Road Map ####


****

#### Test Steps: ####
1. Sign into the test server.
1. Click the main drop down menu > Account Home > License
1. Click **Generate New License**
1. Select **Acme Portal** from the Account drop down.
1. Select **6.1 GA3** from the Choose Liferay Version drop down.
1. Select **Portal Development** from the Product drop down.
1. Select **Portal Development** from the Type drop down.
1. Choose a date further back than 90 days     
![screenshot01](../images/renewlicense01.png)
1. Click the Choose button.
1. Assert that the Expiration date in the License Info drop down is before today    
![screenshot02](../images/renewlicense02.png)
1. Select **5** from the Maximum Connections drop down.
1. Click Generate.
1. Assert that the license has been generated and ready for download.
1. Assert that the license status is Expired.    
![screenshot03](../images/renewlicense03.png)
1. Click Download.
1. In a new browser window, navigate to customer portal and download a 6.1 EE GA3 SP4 bundle. 
1. Start up the new 6.1 EE GA3 Liferay bundle.
1. Deploy the expired license
1. Assert in the console that the license is expired.
1. Navigate back to the test server browser window.
1. Using the same account's expired license, choose Start date as today.
1. Select **60 Days** from the Duration drop down.
1. Click the Renew button.
1. Assert that the old license is now in the Deactivated License section.
1. Assert that a new license that expires in 60 days has been generated.    
![screenshot04](../images/renewlicense04.png)
1. Click Download License. 
1. Go to the bundle.
1. In the {liferay.home}\data\license folder, delete the expired license.
1. Deploy the new license.
1. Assert that the license is deployed and that it is current.
1. **Repeat this test for Liferay Trial.**