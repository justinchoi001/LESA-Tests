Patcher Portal - Portal Versions
================================

####Prerequisites: ####

* Patcher Portal credentials
* VPN credentials
* CISCO VPN Client

####Description: ####
This test is designed to have the user create a new portal version but not all fixes are built on the root portal versions. Users must connect to the Patcher Staging site through a VPN.

####Test Steps: ####
1. Navigate to https://lrdcom-vm-37
1. Sign in as administrator.
1. Click the Portal Versions tab.
1. Click the Create Portal Versions button.
1. Enter the following:    
	a) **Name**: 	6.2.10 SP9    
	b) **Tag Name**:	fix-pack-base-6210-sp9    
	c) **Repository Name**:	liferay-portal-ee
1. Select 6.2.10 from the Portal Version Root drop down.
1. Click the Add button.
1. Assert that the new portal version has been created.    
![image01](../images/portal-version01.png)
1. Click the Actions > Edit button for 6.2.10 SP9
1. Enter the following:    
	a) **Name**: 	6.2.10 SP11    
	b) **Tag Name**:	fix-pack-base-6210-sp11    
	c) **Repository Name**:	liferay-portal-ee
1. Click the Save button.
1. Assert that the updated portal version displays.
