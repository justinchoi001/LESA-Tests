Customer Portal - Liferay Faces
===============================

#### Prerequisites: ####
* Liferay CSE account


#### Description: ####
This test is designed to have users verify the basic functionality of customer portal. Users will verify specific links for downloading Liferay Faces.

****
#### Road Map: ####
1. [Sign In As Liferay CSE](#SignInAsLiferayCSE)
1. [Assert Documentation](#AssertDocumentation)


****

#### Test Steps: ####
1. <a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE"></a>Navigate to http://www-uat.liferay.com
1. Click Customer Portal.
1. Click Liferay Faces.
1. Assert the FAQ, Documentation, Matrix, Security Vulnerabilities, and Create a Ticket links display.    
![faces01](../images/faces01.jpg)
1. Click the Liferay Faces Get It Now button.
1. Assert that the Get Liferay Projects page displays.
1. Assert that the Alloy UI, Liferay FACES, and Liferay IDE tabs display.    
![faces02](../images/faces02.jpg)
1. Assert that the Maven Project Dependencies display.
1. Assert that the Ivy Project Dependencies display.
1. On the Liferay FACES tab, click the Download button.
1. Save the liferay-faces-alloy-3.2.4-ga5.jar. For older versions, click the Artifact repository link.
1. Click Back on the browser until the welcome page.
1. Click the FAQ link.
1. Assert that the FAQ page displays.
1. Click back on the browser.    
<a href="#AssertDocumentation" name="AssertDocumentation">Assert Documentation Links</a>
1. Click the Documentation link
1. Assert that the Documentation page displays.
1. Assert that users can download the Developer Guide and the Developer Wiki
![faces03](../images/faces03.jpg)
1. Click back on the browser.
1. Click the Matrix link.
1. Assert that the Liferay Faces compatibility matrix graph displays.
1. Click back on the browser.
1. Click the Security Vulnerabilities link.
1. Assert that the Liferay Faces Security Vulnerability page displays
1. Click the Learn More button for LSV-5 and then LSV-7.
1. Assert that the installation instructions display.
1. Click the Create Ticket link.
1. Assert that the LESA Support page displays.
 