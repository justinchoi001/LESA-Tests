Account Admin Generated Legacy Licenses
=======================================

#### Prerequisites: ####
* Liferay Account Admin account 


####Description: ####
This test is designed to verify that an OSB Account Admin generated liferay.com license in XML format will be registered as a valid license upon deployment. The license in question was deployed on legacy portal versions such as Portal 5.2 SP5 and 6.0. The bug was that Account Admins generated licenses were invalid. Do **not** use CSE or OSB Admin credentials.  


****

####Test Steps: ####
1. Navigate to http://www-uat.liferay.com
1. Sign in as a Liferay OSB Account Admin.
1. Click Main Menu > Account Home.
1. Click License (if not visible, append license to /web/{user name}/)    
![screenshot01](../images/license.png)
1. Click Generate New License
1. Select Liferay Trial
1. Select 5.2 SP5 from the Choose Liferay Version drop down
1. Select Portal Development from the Product drop down
1. Select Portal Developer (Developer) from the Type drop down
1. Click the Choose button for the 30 Day license.
1. Click the Generate button.
1. Click Download License file.
1. Start up a vanilla Liferay portal 5.2 SP5 bundle available from [Customer Portal](https://www-nightly.liferay.com/group/customer/products/portal/5.2).
1. Deploy the license.
1. Verify that the license deployed as a valid license.
1. Navigate back to the License home page.
1. Select 6.0 SP1 from the Choose Liferay Version drop down
1. Select Portal Development from the Product drop down
1. Select Portal Developer (Developer) from the Type drop down
1. Click the Choose button for the 60 Day license.
1. Click the Generate button.
1. Click Download License file.
1. Start up a vanilla Liferay portal 6.0 SP1 bundle available from [Customer Portal](https://www-nightly.liferay.com/group/customer/products/portal/6.0).
1. Deploy the license.
1. Verify that the license deployed as a valid license.