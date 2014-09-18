Customer Portal - Social Office
===============================
****
#### Prerequisites: ####
* Liferay CSE account


#### Description: ####
This test is designed to have users verify the basic functionality of customer portal. Users will verify specific links for downloading Social Office

****
#### Road Map: ####
1. [Sign In As Liferay CSE](#SignInAsLiferayCSE)
1. [Assert Benefits](#AssertBenefits)
1. [Assert Documentation](#AssertDocumentationLink)


****

#### Test Steps: ####
1. <a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE"></a>Navigate to http://www-uat.liferay.com
1. Click Customer Portal.
1. Click Social Office.
1. Assert that the welcome page displays.    
![social office welcome](../images/Social-Office/social-office-welcome.jpg)
1. Click Features
1. Assert the three tabs display: Get Organized, Stay Connected, and Work Together
1. Click the "Get Social Office Now!" button.
1. Assert that the Available Releases page displays.    
![social office available release](../images/Social-Office/social-office-available-release.jpg)
1. Click Download for either one.
1. Assert that the portal redirects to Liferay Marketplace.
1. Click Back in the browser several times until the Social Office welcome page.    
<a href="#AssertBenefits" name="AssertBenefits">Assert Benefits</a>
1. Click Benefits.
1. Assert that three tabs display: For You, For the Manager, For the Team
1. Assert the "Get Social Office" button redirects to the Available Release page.
1. Click Back in the browser several times until the Social Office welcome page.    
<a href="#AssertDocumentation" name="AssertDocumentation">Assert Documentation</a>
1. Click "Documentation"
1. Assert that the portal redirects to the Liferay Documentation Page for Social Office 3.0    
![social office available documentation](../images/Social-Office/social-office-documentation.jpg)
1. Click Back in the browser.
1. Click "Create a Ticket"
1. Assert that the portal redirects to LESA. 
