OSB Admin - Legacy Licenses
===========================

#### Prerequisites: ####
* Liferay CSE account 


####Description: ####
This test is designed to verify that a CSE generated liferay.com license in XML format will be registered as a valid license upon deployment. The license in question was deployed on legacy portal versions such as Portal 5.2 SP5 and 6.0. The bug was that CSE generated licenses were invalid but CAS generated licenses remained valid. Do **not** use CAS or Admin credentials.  


****

####Test Steps: ####
1. Navigate to http://www-uat.liferay.com
1. Sign in as a Liferay Customer Support Engineer.
1. Click Main Menu > Account Home.
1. Click License (if not visible, append license to /web/{user name}/)    
![screenshot01](https://github.com/liferay/liferay-qa-ee/raw/master/licensing/images/license.png)
1. Click Generate New License
1. Select 5.2 SP5 from the Choose Liferay Version drop down
1. Select Portal Development from the Product drop down
1. Select Portal Developer (Developer) from the Type drop down
1. Click the Choose button for the 30 Day license.
1. Click the Generate button.
1. Click Download License file.
1. Start up a vanilla Liferay portal 5.2 SP5 bundle available from [Customer Portal](https://www-nightly.liferay.com/group/customer/products/portal/5.2).
1. Deploy the license.
1. Verify that the license deployed as a valid license.