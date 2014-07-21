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
1. Click the Menu drop down
1. Click Sign In
1. Enter the following:    
	(a) **Email Address:**	engineer@spaceprogram.com.broken    
	(b) **Password:**	test
1. Click Sign In
1. Click Menu > User Profile
1. Click Support    
<a href="#ExecuteSearchAsCustomer" name="ExecuteSearchAsCustomer">Execute Search as Customer</a>
1. Click the first ticket (e.g. THESPACEPRO-335)    
![screenshot01](../images/LESA-Search-Basic-Search/screenshot01.jpg)
1. Remember the following criteria:   
	(a) **Title:**	(e.g. Unique Title - Alpha Bravo Charlie)    
	(b) **Ticket Number:**	(e.g. THESPACEPRO-335)    
	(c) **3 word phrase:**	(e.g. Mars Rover Opportunity)    
	(d) **Attachment name:**	(e.g. idp-metadata.xml)
1. Click Back to Previous Page
1. Click <<Basic to reset as Basic Search    
![screenshot02](../images/LESA-Search-Basic-Search/screenshot02.jpg)
1. Enter "Bravo" in the Search field
1. Click Search
1. Assert that "THESPACEPRO-335" is the first result
1. Click Need Response
1. Enter "THESPACEPRO-335" in the Search field
1. Click Search
1. Assert that the page is redirected to the ticket information page
1. Click Back to Previous Page
1. Enter the 3 word phrase (e.g. Mars Rover Opportunity) in the Search field
1. Click Search
1. Assert that "THESPACEPRO-335" displays
1. Click Need Response
1. Enter the full Attachment name (e.g. idp-metadata.xml) in the Search field
1. Click Search
1. Assert that "THESPACEPRO-335" displays
1. Click Menu > Sign Out    
<a href="#SignInAsWatcher" name="SignInAsWatcher">Sign In As Watcher</a>
1. Click the Menu drop down
1. Click Sign In
1. Enter the following:    
	(a) **Email Address:**	sdelprete@sogei.it.broken    
	(b) **Password:**	test
1. Click Sign In
1. Click Menu > User Profile
1. Click Support    
<a href="#ExecuteSearchAsWatcher" name="ExecuteSearchAsWatcher">Execute Search as Watcher</a>
1. Click the first ticket (e.g. SOGEISPA-22)    
![screenshot03](../images/LESA-Search-Basic-Search/screenshot03.jpg)
1. Remember the following criteria:   
	(a) **Title:**	(e.g. ClassCastException installing ehcache-cluster-web)    
	(b) **Ticket Number:**	(e.g. SOGEISPA-22)    
	(c) **3 word phrase:**	(e.g. upgrading)    
	(d) **Attachment name:**	(e.g.jboss-classloading.xml)
1. Click Back to Previous Page
1. Click <<Basic to reset as Basic Search    
![screenshot02](../images/LESA-Search-Basic-Search/screenshot02.jpg)
1. Enter ClassCastException in the Search field
1. Click Search
1. Assert that "SOGEISPA-22" displays
1. Click Need Response
1. Enter "SOGEISPA-22" in the Search field
1. Assert that system redirects to "SOGEISPA-22" and ticket information displays
1. Click Back to Previous Page
1. Enter "upgrading in the Search field
1. Click Search
1. Assert that "SOGEISPA-22" displays
1. Enter "jboss-classloading.xml" in the Search field
1. Click Search
1. Assert that "SOGEISPA-22" displays
1. Click Menu > Sign Out    
<a href="#SignInAsLiferayCSE" name="SignInAsLiferayCSE">Sign In As Liferay CSE</a>
1. Click the Menu drop down
1. Click Sign In
1. Enter the following:    
	(a) **Email Address:**	${liferay engineer email address}.broken    
	(b) **Password:**	${password}
1. Click Sign In
1. Click Menu > User Profile
1. Click Support    
<a href="#ExecuteSearchAsLiferayCSE" name="ExecuteSearchAsLiferayCSE">Execute Search as Liferay CSE</a>
1. Click "My Open Tickets"
1. Click the first ticket    
![screenshot04](../images/LESA-Search-Basic-Search/screenshot04.jpg)
1. Remember the following criteria:    
	(a) **Title:**	(e.g. Ehcache ERROR [Multicast Heartbeat Receiver Thread])    
	(b) **Ticket Number:**	(e.g. VANTIV-14)    
	(c) **3 word phrase:**	(e.g. Ehcache Documentation)    
	(d) **Attachment name:**	(e.g. MulticastAddressList.xls)
1. Click Back to Previous Page
1. Enter "Ehcache ERROR [Multicast Heartbeat Receiver Thread]" in the Search field
1. Click Search
1. Assert that VANTIV-14 displays in the Search results
1. Enter "VANTIV-14" in the Search field
1. Assert that system redirects to VANTIV-14's information page
1. Click Back to Previous Page
1. Enter "Ehcache Documentation" in the Search field
1. Click Search
1. Assert that VANTIV-14 displays in the Search results
1. Enter "MulticastAddressList.xls" in the Search field
1. Assert that VANTIV-14 displays in the Search results
1. Click Menu > Sign Out    
<a href="#SignInAsPartner" name="SignInAsPartner">Sign In As Partner</a>
1. Click the Menu drop down
1. Click Sign In
1. Enter the following:    
	(a) **Email Address:**	mauro.mariuzzo@smc.it.broken    
	(b) **Password:**	test
1. Click Sign In
1. Click Menu > User Profile
1. Click Support    
<a href="#ExecuteSearchAsPartner" name="ExecuteSearchAsPartner">Execute Search as Partner</a>
1. Enter ClassCastException in the Search field
1. Click Search
1. Assert that "SOGEISPA-22" displays
1. Click Need Response
1. Enter "SOGEISPA-22" in the Search field
1. Assert that system redirects to "SOGEISPA-22" and ticket information displays
1. Click Back to Previous Page
1. Enter "upgrading in the Search field
1. Click Search
1. Assert that "SOGEISPA-22" displays
1. Enter "jboss-classloading.xml" in the Search field
1. Click Search
1. Assert that "SOGEISPA-22" displays