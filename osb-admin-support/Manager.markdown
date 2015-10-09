OSB Admin Support - Manager
===========================
****
#### Prerequisites: ####
* Liferay Support Manager or Team Lead Role

#### Description: ####
This test is designed to verify that support managers and team leads not assigned to a team cannot modify that team's members' PTO statuses.


****


#### Test Steps: ####
1. Navigate to http://www-uat.liferay.com
1. Click Control Panel> OSB Admin.
1. Click the Support tab.
1. Click the Support Worker Statutes.
1. Click the In toggle for any engineer for any team in which the user is a manager.
1. Assert that the toggle changes to On PTO.
1. Click the In toggle for any engineer for any team in which the user is not a manager.
1. Assert that the toggle does not change to On PTO.