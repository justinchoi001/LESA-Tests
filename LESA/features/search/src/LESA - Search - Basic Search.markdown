LESA - Search - Basic Search
============================
****
#### Prerequisites: ####
* Developer-Customer account
* Watcher-Customer account
* Liferay CSE account
* Partner (non manager) account


#### Description: ####
This test is designed to have users test the basic search feature. Users will search for: ticket title, ticket number, a three-word phrase in the comments, and by attachment name. Users will execute the search with the follow credentials: customer, watcher, Liferay CSE, and partner.

****
#### Road Map: ####
1. [Sign In As Customer](#SignInAsCustomer)
1. [Execute Search As Customer](#ExecuteSearchAsCustomer)
1. [Sign In As Watcher](#SignInAsWatcher)
1. [Execute Search As Watcher](#ExecuteSearchAsWatcher)
1. [Sign In As Liferay CSE](#SignInAsLiferayCSE)
1. [Execute Search As Liferay CSE](#ExecuteSearchAsLiferayCSE)
1. [Sign In As Partner](#SignInAsPartner)
1. [Execute Search As Partner](#ExecuteSearchAsPartner)

****

#### Test Steps: ####
1. <a href="#SignInAsCustomer" name="SignInAsCustomer"></a>Navigate to http://www-uat.liferay.com
1. Click Menu > Sign In
1. Sign in as a customer.
1. Click Menu > Customer Portal
1. Click the LESA button.
<a href="#ExecuteSearchAsCustomer" name="ExecuteSearchAsCustomer">Execute Search as Customer</a>
1. Click New Ticket
1. Select the account associated with this customer
1. Click Portal Production
1. Click the Continue Without Adding button
1. Click Create Ticket
1. Enter in the <b>Provide a summary</b> field: Alpha Bravo Charlie
1. Select Document Library from the Component drop down
1. Select <b>System Status</b>: Completely Inoperable / Shutdown    
![customer-creation01](../images/LESA-Search-Basic-Search/customer-creation01.png)
1. Select the following:    
	(a) **Liferay Version**:	 6.2 EE    
	(b) **Application Server**:	Weblogic 12c    
	(c) **Database:**			Oracle 11.2    
	(d) **Operating System**:	Ubuntu 13    
	(e) **Java Virtual Machine:**	Java 7    
	(f) **Primary Browser:**		Firefox 20+
1. Click Upload New in the Portal-ext section
1. Upload a .txt file
1. Flag the "This portal-ext is current" check box if it is not already flagged
1. Click Upload New in the Patch Level section
1. Upload a .txt file
1. Flag the "This patch level is current" check box if it is not already flagged
1. Click the Submit button
1. Assert that the system redirects to the newly created ticket.
1. Upload an attachment: idp-metadata.xml
1. Click Back to Previous Page
1. Change back to Basic Search if necessary    
![screenshot02](../images/LESA-Search-Basic-Search/screenshot02.jpg)
1. Enter "Bravo" in the Search field
1. Click Search
1. Assert that newly created ticket is the first result
1. Click Need Response
1. Enter alphanumeric ticket (e.g. ABCDEF-123) in the Search field
1. Click Search
1. Assert that the page is redirected to the ticket information page
1. Click Back to Previous Page
1. Enter the 3 word phrase (e.g. Alpha Bravo Charlie) in the Search field
1. Click Search
1. Assert that newly created ticket is the first result
1. Click Need Response
1. Enter the full Attachment name (e.g. idp-metadata.xml) in the Search field
1. Click Search
1. Assert that newly created ticket is the first result
1. Click Menu > Sign Out    
<a href="#SignInAsWatcher" name="SignInAsWatcher">Sign In As Watcher</a>
1. Click the Menu drop down
1. Click Sign In
1. Sign in as a Watcher
1. Click Menu > Customer Portal
1. Click the LESA button    
<a href="#ExecuteSearchAsWatcher" name="ExecuteSearchAsWatcher">Execute Search as Watcher</a>
1. Click the first ticket (e.g. XYZ-22)    
![screenshot03](../images/LESA-Search-Basic-Search/screenshot03.jpg)
1. Remember the following criteria:   
	(a) **Title:**	(e.g. ClassCastException installing ehcache-cluster-web)    
	(b) **Ticket Number:**	(e.g. XYZ-22)    
	(c) **3 word phrase:**	(e.g. upgrading)    
	(d) **Attachment name:**	(e.g.jboss-classloading.xml)
1. Click Back to Previous Page
1. Click <<Basic to reset as Basic Search    
![screenshot02](../images/LESA-Search-Basic-Search/screenshot02.jpg)
1. Enter ClassCastException in the Search field
1. Click Search
1. Assert that "XYZ-22" displays
1. Click Need Response
1. Enter "XYZ-22" in the Search field
1. Assert that system redirects to "XYZ-22" and ticket information displays
1. Click Back to Previous Page
1. Enter "upgrading in the Search field
1. Click Search
1. Assert that "XYZ-22" displays
1. Enter "jboss-classloading.xml" in the Search field
1. Click Search
1. Assert that "XYZ-22" displays
1. Click Menu > Sign Out    
<a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE">Sign In As Liferay CSE</a>
1. Click the Menu drop down
1. Click Sign In
1. Sign in as a Liferay Support Engineer
1. Click Menu > Customer Portal
1. Click the LESA Button    
<a href="#ExecuteSearchAsLiferayCSE" name="ExecuteSearchAsLiferayCSE">Execute Search as Liferay CSE</a>
1. Click "My Open Tickets"
1. Click the first ticket    
![screenshot04](../images/LESA-Search-Basic-Search/screenshot04.jpg)
1. Remember the following criteria:    
	(a) **Title:**	(e.g. Ehcache ERROR [Multicast Heartbeat Receiver Thread])    
	(b) **Ticket Number:**	(e.g. DEFG-14)    
	(c) **3 word phrase:**	(e.g. Ehcache Documentation)    
	(d) **Attachment name:**	(e.g. MulticastAddressList.xls)
1. Click Back to Previous Page
1. Enter "Ehcache ERROR [Multicast Heartbeat Receiver Thread]" in the Search field
1. Click Search
1. Assert that DEFG-14 displays in the Search results
1. Enter "DEFG-14" in the Search field
1. Assert that system redirects to DEFG-14's information page
1. Click Back to Previous Page
1. Enter "Ehcache Documentation" in the Search field
1. Click Search
1. Assert that DEFG-14 displays in the Search results
1. Enter "MulticastAddressList.xls" in the Search field
1. Assert that DEFG-14 displays in the Search results
1. Click Menu > Sign Out    
<a href="#SignInAsPartner" name="SignInAsPartner">Sign In As Partner</a>
1. Click the Menu drop down
1. Click Sign In
1. Sign in as a partner (same account as the Watcher)
1. Click Menu > Customer Portal
1. Click the LESA button    
<a href="#ExecuteSearchAsPartner" name="ExecuteSearchAsPartner">Execute Search as Partner</a>
1. Enter ClassCastException in the Search field
1. Click Search
1. Assert that "XYZ-22" displays
1. Click Need Response
1. Enter "XYZ-22" in the Search field
1. Assert that system redirects to "XYZ-22" and ticket information displays
1. Click Back to Previous Page
1. Enter "upgrading in the Search field
1. Click Search
1. Assert that "XYZ-22" displays
1. Enter "jboss-classloading.xml" in the Search field
1. Click Search
1. Assert that "XYZ-22" displays