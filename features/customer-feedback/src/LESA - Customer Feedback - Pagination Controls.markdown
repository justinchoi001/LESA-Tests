LESA - Customer Feedback - P1 Escalation
========================================
****
#### Prerequisites: ####
* Customer account
* Liferay CSE account
* Partner (non manager) account


#### Description: ####
This test is designed to have users test the feedback feature's pagination controls. Liferay CSE can view customer feedback which number in the hundreds and thousands. Pagination can be lost by advancing to the next page. Sign in as a CSE and assert that the pagination control preferences are not lost.

****
#### Road Map: ####
1. [Sign In as a CSE](#SignInAsACSE)
1. [View Waiting Feedback](#ViewWaitingFeedback)
1. [Change Waiting Pagination Delta](#ChangeWaitingPaginationDelta)
1. [View All Feedback](#ViewAllFeedback)
1. [Change All Feedback Pagination Delta](#ChangeAllFeedbackPaginationDelta)

****

#### Test Steps: ####
1. <a href="#SignInAsACSE" name="SignInAsACSE"></a>Navigate to http://www-uat.liferay.com
1. Click Menu > Sign In
1. Enter the following:    
	(a) **Email Address:**	brian.suh@liferay.com.broken    
	(b) **Password:**	test
1. Click Sign In
1. Click Menu > User Profile
1. Click Support
1. Click the Feedback tab    
<a href="#ViewWaitingFeedback" name="ViewWaitingFeedback">View Waiting Feedback</a>
1. Click Waiting 
1. Assert the default number of Items is 20    
<a href="#ChangeWaitingPaginationDelta" name="ChangeWaitingPaginationDelta">Change Waiting Pagination Delta</a>
1. Select 50 from the Item drop down
1. Assert that 50 results display in the results area
1. Click Next
1. Assert that 50 results display in the results area
1. Click Last
1. Assert the number of Items is 50
1. Click Previous
1. Assert that 50 results display in the results area
1. Click First
1. Assert that 50 results display in the results area    
<a href="#ViewAllFeedback" name="ViewAllFeedback">View All Feedback</a>
1. Click All Feedback
1. Assert the default number of Items is 20    
<a href="#ChangeAllFeedbackPaginationDelta" name="ChangeAllFeedbackPaginationDelta">Change All Pagination Delta</a>
1. Select 50 from the Item drop down
1. Assert that 50 results display in the results area
1. Click Next
1. Assert that 50 results display in the results area
1. Click Last
1. Assert the number of Items is 50
1. Click Previous
1. Assert that 50 results display in the results area
1. Click First
1. Assert that 50 results display in the results area