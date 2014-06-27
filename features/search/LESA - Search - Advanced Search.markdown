LESA - Search - Advanced Search
===============================
****
#### Prerequisites: ####
* Liferay CSE account

#### Description: ####
This test is designed to have users test the advanced search feature. Users will search for tickets using Account, Assigned to, Severity, Escalation Level, Resolution, Status, Component, and Due Date Range.

****
#### Road Map: ####
1. [Sign In As Liferay CSE](#SignInAsLiferayCSE)
1. [Search By Account](#SearchByAccount)
1. [Search By Severity](#SearchBySeverity)
1. [Search By Escalation](#SearchByEscalation)
1. [Search By Assigned To](#SearchByAssignedTo)
1. [Search By Resolution](#SearchByResolution)
1. [Search by Status](#SearchByStatus)
1. [Search By Component](#SearchByComponent)
1. [Search By Due Date Range](#SearchByDueDateRange)

****

#### Test Steps: ####
1. <a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE"></a>Sign in as a Liferay CSE
1. Click the Advanced link (if Basic Search displays)    
<a href="#SearchByAccount" name="SearchByAccount">Search by Account</a>
1. Enter "UMass" in the Account field
1. Click the Search button
1. Assert that only UMASS tickets display in the results section
1. Click the Reset button    
<a href="#SearchBySeverity" name="SearchBySeverity">Search by Severity</a>
1. Click the Critical check box
1. Click the Search button
1. Assert that only critical tickets display (red banner)
1. Click the Reset button    
<a href="#SearchByEscalation" name="SearchByEscalation">Search by Escalation</a>
1. Click the P1 check box
1. Click the Search button
1. Assert that only P1 tickets display in the results section
1. Click the Reset button    
<a href="#SearchByAssignedTo" name="SearchByAssignedTo">Search by Assigned To</a>
1. Click the Choose button next to "Assigned to"
1. Click another Liferay CSE
1. Click the Search button
1. Assert that only tickets assigned to this CSE display
1. Click the Reset button    
<a href="#SearchByResolution" name="SearchByResolution">Search by Resolution</a>
1. Click the Duplicate check box
1. Click the Search button
1. Assert that all the tickets display "Closed" as their status
1. Click on any ticket
1. Assert that "Duplicate" display as their resolution
1. Click Back to Previous Page
1. Click the Reset button    
<a href="#SearchByStatus" name="SearchByStatus">Search by Status</a>
1. Click the On Hold check box
1. Click the Search button
1. Assert that all the tickets display "On Hold" as their status
1. Click the Reset button    
<a href="#SearchByComponent" name="SearchByComponent">Search by Component</a>
1. Click the Clustering check box
1. Click the Search button
1. Click on the first three articles
1. Assert that Component: Clustering displays in each Description box
1. Click the Reset button    
<a href="#SearchByDueDateRange" name="SearchByDueDateRange">Search by Due Date Range</a>
1. Select "May 1, 2014" in the Begin Date drop down under Due Between
1. Select May 15, 2014: in the End Date drop down under Due Between
1. Click the Search Button
1. Assert that there are no tickets with due dates beyond May 15, 2014
1. Click Last
1. Assert that there are no tickets with due dates before May 1, 2014