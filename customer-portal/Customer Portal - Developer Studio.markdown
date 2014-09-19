#### Prerequisites: ####
* Liferay CSE account


#### Description: ####
This test is designed to have users verify the basic functionality of customer portal. Users will verify specific links for downloading Liferay Developer Studio.

****

#### Test Steps: ####
1. <a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE"></a>Navigate to http://www-uat.liferay.com
1. Click Customer Portal.
1. Click Developer Studio.
1. Assert that the welcome page displays.    
![developer studio01](https://github.com/liferay/liferay-qa-ee/raw/master/customer-portal/images/Developer-Studio/developer-studio01.jpg)
1. Click the Latest Version link.
1. Scroll down to the end of the End User License Agreement window to trigger the check box.
1. Click the "I Agree" check box.
1. Click the Download button.
1. Save the Zip file.
1. Click the Developer Studio link in the left navigation pane.
1. Assert that the welcome page displays.
1. Click the Matrix link.
1. Assert that the Liferay Developer Studio compatibility matrix graph displays.    
![developer studio02](https://github.com/liferay/liferay-qa-ee/raw/master/customer-portal/images/Developer-Studio/developer-studio02.jpg)
1. Click Back on the browser.
1. Click the Create Ticket link.
1. Assert that the LESA Support page displays.