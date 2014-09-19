Customer Portal - Liferay Mobile SDK
====================================

#### Prerequisites: ####
* Liferay CSE account


#### Description: ####
This test is designed to have users verify the basic functionality of customer portal. Users will verify specific links for downloading Liferay Mobile SDK.

****
#### Road Map: ####
1. [Sign In As Liferay CSE](#SignInAsLiferayCSE)
1. [Assert Documentation](#AssertDocumentation)


****

#### Test Steps: ####
1. <a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE"></a>Navigate to http://www-uat.liferay.com
1. Click Customer Portal.
1. Click Liferay Mobile SDK.
1. Assert the Features, Support Matrix, and Create a Ticket links display.    
![mobile sdk1](../images/mobile-sdk01.jpg)
1. Click the Liferay Mobile SDK Get It Now button.
1. Assert that the site redirects to the https://github.com/liferay/liferay-mobile-sdk/releases page where users can download Android and IOS jars.
1. Click Back on the browser until the welcome page. 
1. Click the Features link.
1. Assert that the Features displays.    
<a href="#AssertDocumentation" name="AssertDocumentation">Assert Documentation Links</a>
1. Click the Documentation link
1. Assert that the Documentation page on github.com displays.
1. Click back on the browser several times until the welcome page displays.
1. Click the Support Matrix link.
1. Assert that the Liferay Mobile SDK compatibility matrix graph displays.
1. Click back on the browser.
1. Click the Create Ticket link.
1. Assert that the LESA Support page displays.
 