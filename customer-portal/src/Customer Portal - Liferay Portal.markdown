LESA - Customer Portal - Liferay Portal
=======================================
****
#### Prerequisites: ####
* Liferay CSE account


#### Description: ####
This test is designed to have users verify the basic functionality of customer portal. Users will verify specific links for downloading Liferay Portal are valid. Users will download fix packs, patching tool, and security updates.

****
#### Road Map: ####
1. [Sign In As Liferay CSE](#SignInAsLiferayCSE)
1. [Assert Documentation](#AssertDocumentation)
1. [Assert Patching Tool](#AssertPatchingTool)

****

#### Test Steps: ####
1. <a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE"></a>Navigate to http://www-uat.liferay.com
1. Click the Main Menu drop down
1. Click Customer Portal
1. Assert that the Liferay Portal icon displays
1. Assert that the Social Office icon displays
1. Assert that the Liferay Sync icon displays
1. Assert that the Liferay Faces icon displays
1. Assert that the Developer Studio icon displays
1. Assert that the Mobile SDK icon displays
1. Assert that the Liferay Portal 6.2 box displays
1. Assert that the Liferay Portal 6.1 box displays
1. Assert that the Liferay Portal 6.0 box displays
1. Assert that the Liferay Portal 5.2 box displays
1. Assert that the Top Articles section displays in the bottom left
1. Assert that the Top Downloads section displays in the bottom middle
1. Assert that the Latest News section displays in the bottom right
1. Click Liferay Portal    
![screenshot01](../images/customer-portal-liferay-portal01.png)
1. Assert that the latest version of Liferay Portal displays at the top
1. Assert that the downloads drop down display
1. Assert that the Download EE (latest version) displays
1. Assert that the Archive link displays
1. Assert that the Additional Files link displays
1. Assert that the Support Matrix box displays
1. Assert that the Support Information box displays
1. Assert that the Deployment Checklist box displays
1. Assert that the License Key box displays    
![screenshot02](../images/customer-portal-liferay-portal02.png)
1. Assert that the Knowledge Base Box displays
1. Assert that the Documentation box displays
1. Assert that the Patching Tool box displays
1. Assert that the Security Patches box displays
1. Assert that the Patches box displays    
![screenshot03](../images/customer-portal-liferay-portal03.png)
1. Click Find Answer in the Knowledge Base box
1. Assert the "Welcome to the Knowledge Base" message displays
1. Assert the Search field displays   
![screenshot04](../images/customer-portal-liferay-portal04.png)
1. Click Back in the browser    
 <a href="#AssertDocumentation" name="AssertDocumentation">Assert Documentation</a>
1. Click Learn More in the Documentation box
1. Assert that the User Guide is available for download
1. Assert that the Developer Guide is available for download
1. Assert that Release Notes are available for download    
![screenshot05](../images/customer-portal-liferay-portal05.png)
1. Click Back in the browser    
 <a href="#AssertPatchingTool" name="AssertPatchingTool">Assert Patching Tool</a>
1. Click Download in the Patching Tool box
1. Assert that the latest patching tool is downloaded    
![screenshot06](../images/customer-portal-liferay-portal06.png)
1. Click Learn More in the Security Patches box
1. Assert that the latest LSV fixes are available for download
1. Click Learn More for the latest LSV    
![screenshot07](../images/customer-portal-liferay-portal07.png)
1. Click the Download button
1. Follow the additional prompts since LSVs are included in Platform fix packs    
![screenshot08](../images/customer-portal-liferay-portal08.png)
1. Click the Main Menu drop down
1. Click Customer Portal
1. Click Liferay Portal
1. Click Download all Patches in the Patches box
1. Assert that the latest fix packs are downloaded    
![screenshot09](../images/customer-portal-liferay-portal09.png)
1. Click the Administration 4 Release Notes link
1. Assert the Release Notes title displays
1. Assert that Change Log displays   
![screenshot10](../images/customer-portal-liferay-portal10.png)

