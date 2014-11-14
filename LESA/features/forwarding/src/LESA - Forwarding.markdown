LESA - Forwarding
=================

#### Prerequisites: ####
* Customer with Platinum Support (Americas, Asia, or Europe) 
* Liferay CSE accounts

#### Description: ####

This test covers the forwarding feature for platinum critical tickets only. Platinum Critical tickets are high priority tickets. If a Liferay CSE is unable to finish investigating the issue by end of business day, he is to pass the ticket onto the next CSE on the Platinum Critical team or the next support region. The calculations are based on the amount of business hours remaining. A likely scenario is if a platinum critical ticket is opened at 4PM; with only two hours left, the CSE will forward the ticket the next region. The algorithm will automatically assign the ticket to the CSE; no need for managers to handle the reassignment. In this test, users will simulate the creation of a platinum critical ticket then "forward" the ticket to the next CSE (regardless of region).

If a customer has partner support, it will go to the partner. If the customer does not, it will be assigned to Liferay.

####Road Map:#### 



####Test Steps: ####
1. Navigate to http://www-uat.liferay.com
1. Sign in as a customer with Platinum support.
1. Navigate to the LESA home page.
1. Click +New Ticket.
1. Select an account with associated with this customer.
1. Click Portal Production.
1. Select an existing environment.
1. Click Create Ticket.
1. Enter in the <b>Provide a summary</b> field: 	Forwarding test
1. Select a component: 	Clustering 
1. Select a system status: 	Completely Inoperable / Shutdown (must choose this one!)
1. Enter in "Please provide a description of the issue":	unable to set up a cluster; forwarding test
1. Select a primary browser (if not supplied):	Firefox 20+
1. Flag the "This portal-ext is current." checkbox.
1. Flag the "This patch level is current." checkbox.
1. Click the Submit button.
1. Assert only one ticket is created.
1. Assert that it has been assigned to a partner if the account has partner support.
1. Assert that it has been assigned to Liferay if there is no associated partner.
1. Sign out of the customer.
1. Sign in as the assigned CSE.
1. Navigate to the LESA home page.
1. Assert that the newly created Platinum Critical ticket displays.
1. Click that ticket
1. Select "Investigating" from the Status drop down.
1. Assert that the Forward button displays    
![forward-button](../images/forward-button01.jpg)
1. Click the Forward button.
1. Assert the popup window.
1. Fill in the required fields.
1. Click Forward.
1. Assert that a new assignee appears in the assigned to in "Ticket Info" section.
1. Assert that this assignee is also assigned to the Platinum Critical team of that region. (Sometimes the new CSE may not be in the same Support Region.)
1. Assert that the information from the Forwarding process display in the Liferay comments tab.
1. Sign out of the first CSE.
1. Sign in as the second CSE.
1. Navigate to the LESA home page
1. Assert that the ticket displays in the My Open Tickets list.
1. Click on that ticket
1. Assert that the information during forwarding displays in the Liferay comments tab.
1. Assert that the Forward button displays
1. Click the Forward button.
1. Fill in the required fields.
1. Click Forward.
1. Assert that a third assignee appears in the assigned to in "Ticket Info" section.
1. Assert that the information from the Forwarding process display in the Liferay comments tab.