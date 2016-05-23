Patcher Portal - Fix Packs
========================== 

####Prerequisites: ####

* Patcher Portal credentials

####Description: ####
This test is designed to have the user create a fix pack to be released. 


#### Road Map: ####
1. [Create A Fix](#CreateAFix)
1. [Create A Fix Component](#CreateAFixComponent)
1. [Create A Fix Pack](#CreateAFixPack)
1. [Incorporate The Fix](#IncorporateTheFix)
1. [Freeze Then Merge The Fix Pack](#FreezeThenMergeTheFixPack)
1. [Release The Fix Pack](#ReleaseTheFixPack)

****


####Test Steps: ####
1. <a href="#CreateAFix" name="CreateAFix"></a>Navigate to http://cloud-10-50-0-130/
1. Sign in as administrator.
1. Click the Patcher Portal Page.
1. Click the Fixes tab.
1. Click the Create Fix button.
1. Select *6.x* from the Product Version drop down menu.
1. Select *liferay-portal-ee 6.1.30* from Project Version.
1. Enter the following:    
	a) Patcher Fix Name: 	LPEALPHAFIX-1    
	b) Branch Name:	LPEALPHA-1    
	c) GitHub URL: git@github.com:EddieOlson/liferay-portal-ee.git
1. Click the Save button.
1. Assert that the LPEALPHAFIX-1 has been created.    
<a href="#CreateAFixComponent" name="CreateAFixComponent">Create A Fix Component</a>
1. Click the Fix Components tab.
1. Click the Create Fix Component button.
1. Enter the following: ginger.
1. Click Save.    
<a href="#CreateAFixPack" name="CreateAFixPack">Create A Fix Pack</a>
1. Click the Fix Packs tab.
1. Click the Create Fix Pack button.
1. Select *liferay-portal-ee 6.1.30* from Portal Version.
1. Select *ginger* from Component.
1. Enter 1 in the Initial Version field.
1. Click the Save button.
1. Assert that ginger-1 has been created.
1. Assert that it is Under Development in the Status.    
![image01](../images/ginger-1.png)    
<a href="#IncorporateTheFix" name="IncorporateTheFix">Incorporate The Fix</a>
1. Click the Fixes tab.
1. Click Actions > Edit Fix Packs for LPEALPHAFIX-1
1. Assert that the Fix Pack Status is "Fix Pack Ready"
1. Assert that "ginger-1" is listed as an available Fix Pack    
![image02](../images/ginger-2.png)
1. Move ginger-1 from the Available Fix Packs to the Current Fix Packs column
1. Click the Save button.    
<a href="#FreezeThenMergeTheFixPack" name="FreezeThenMergeTheFixPack">Freeze Then Merge The Fix Pack</a>
1. Click the Fix Packs tab.
1. Click Edit next to *ginger-1*.
1. Change the Status from Under Development to Frozen.    
![image03](../images/ginger-3.png)
1. Click the Save button.
1. Click Edit next to *ginger-1*.
1. Click the Merge button
1. Assert that the git revision number appears (might have to wait several minutes)    
![image04](../images/ginger-4.png)    
<a href="#ReleaseTheFixPack" name="ReleaseTheFixPack">Release The Fix Pack</a>
1. Select Released from the Status drop down.
1. Click the Save button.
1. Assert that the ginger-1 fix pack has been created.    
![image05](../images/ginger-5.png)
