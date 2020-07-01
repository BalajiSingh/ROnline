Feature: Validating the Functionality on the Home page of the application



  @UI
  Scenario: Validating the Certified Vehicle Types
    Given user on the Used Vehicles website
    When user navigates to the Certified vehicles section component
    Then user can see RYDER DOT VERIFIED Vehicle Section header
    And user can see "Tried and true trucks you can trust. With Ryder Verified, build your fleet with the road-ready, fully compliant trucks you need:" content for Ryder Dot verified vehicles
    And User can see RYDER CERTIFIED Vehicles Header
    And user can see "For guaranteed reliability at an affordable price, choose our highest-quality pre-owned vehicles-Ryder Certified- bringing you unparalleled benefits" content for Ryder Certified vehicles
    And user can see AS-IS vehicles header
    And user can see "As-is vehicles and parts that need a little attention. Ryder Reclassified is your go-to marketplace for damaged or scrap vehicles offering valuable spare parts & fixer uppers." content for AsIs Vehilces
    When User click on the VERIFIED VEHICLES link
    Then User should be redirected to "about:blank#blocked" url
    When User click on the CERTIFIED VEHICLES link
    Then User should be redirected to "about:blank#blocked" url
    When User click on the AS-IS VEHICLES link
    Then User should be redirected to "about:blank#blocked" url

  @UI
  Scenario: Header - Promo Banner Is Visible
    Given user on the Used Vehicles website
    Then user should see the "NO PAYMENTS FOR 60 DAYS! No payments for 60 days on principal and interest. Learn More" promo banner is visible at the top of the page
    When user clicks or pressed enter anywhere on the promo banner
    Then user the should be taken to a corresponding promotion page "https://st-usedtrucks.ryder.com/"

  @UI
  Scenario: Footer- Validating the Policy fields
    Given user on the Used Vehicles website
    When user navigates to the footer component
    Then User can see the "Ryder and Ryder Logo are registered trademarks of Ryder System, Inc. Ever Better is a trademark of Ryder System, Inc. Copyright 1996-2018 Ryder System, Inc." rich text field
    When User click on the "Privacy Policy" hyperlink field
    Then User should redirect to the "https://ryder.com/privacy-policy" page in a new tab
    When User clicks on the "Terms of Use" hyperlink field
    Then User should redirect to the "https://ryder.com/terms-of-use" page in a new tab
    And User can see the "Sitemap" field

  @UI
  Scenario: Footer- Validating the Resource Links
    Given user on the Used Vehicles website
    When user navigates to the footer component
    Then User can see the "RESOURCES" rich text field all the way on the left of the footer
    When User click on the Suppliers hyperlink field
    Then User should redirect to the "https://ryder.com/suppliers" In a new window
    When User click on the Careers hyperlink field
    Then User should redirect to the "https://ryder.com/careers" In a new window
    When User click on the Truck Rentals hyperlink field
    Then User should redirect to the "https://reservations.ryder.com/en" In a new window
    When User click on the Ryder Truck Parts" hyperlink field
    Then User should redirect to the "https://www.ryderfleetproducts.com/ryder/" In a new window
    When User click on the Ryder.com hyperlink field
    Then User should redirect to the "https://ryder.com/" In a new window
    When User click on the Investors hyperlink field
    Then User should redirect to the "https://investors.ryder.com/investors/ir-home/default.aspx" In a new window

  @UI
  Scenario: Footer- Validating the Social Networks Links
    Given user on the Used Vehicles website
    When user navigates to the footer component
    When User click on the Facebook icon
    Then User should redirect to the "https://www.facebook.com/RyderSystemInc" In a new window
    When User click on the twitter icon
    Then User should redirect to the "https://twitter.com/RyderSystemInc" In a new window
    When User click on the youtube icon
    Then User should redirect to the "https://www.youtube.com/user/Rydersysteminc" In a new window
    When User click on the linkedin icon
    Then User should redirect to the "https://www.linkedin.com/company/ryder-system-inc" In a new window

  @UI
  Scenario: Shop Our Trucks Module
    Given user on the Used Vehicles website
    When user navigates to the Shop Our Trucks component
    Then User can See "SHOP OUR TRUCKS" Rich Text Field
    And User can see the SEMI TRUCK Icon and Link
    And User can see the TRUCKS Icon and Link
    And User can see the TRAILERS Icon and Link
    And User can see the VANS & CARS Icon and Link

  @UI
  Scenario: Featured Brands Module
    Given user on the Used Vehicles website
    When User navigates to the FEATURED BRANDS component
    Then User can See "FEATURED BRANDS" Rich Text Field Under the Shop Our Tucks Module
    And User can see the FREIGHLINER Icon Link
    And User can see the ISUZU Icon Link
    And User can see the PETERBILT Icon Link
    And User can see the HINO Icon Link
    And User can see the MERCEDESBENZ Icon Link
    And User can see the INTERNATIONAL Icon Link
    
    
    
  @UI100
    Scenario: Featured Vehicles Image Carousel
    Given user on the Used Vehicles website
    When User navigates to the FEATURED VEHICLES Image Carousel component
   #And User should see the left and right Navigation arrow buttons
    And User clicks on the Image should navigate to product details page

  @UI
  Scenario: Header Banner
    Given user on the Used Vehicles website
    Then User can see the "RYDER.COM" link on left side of the header
    And User can see the "1-855-785-4200" phone number to call
    And User can see the "LOCATIONS" link on right side of the header
    When User clicks on the RYDER.COM link
    Then User should be redirected to "https://ryder.com/"

  @UI
  Scenario: Header Menu
    Given user on the Used Vehicles website
    When User Click on the Used Vehicles link from the header Menu
    Then User should be redirected to "https://st-usedtrucks.ryder.com/"
    When User Click on the Brands link from the header Menu
    Then User should be redirected to "https://st-usedtrucks.ryder.com/"
    When User Click on the Ryder Benefits link from the header Menu
    Then User should be redirected to "https://st-usedtrucks.ryder.com/"
    When User Click on the Promotions link from the header Menu
    Then User should be redirected to "https://st-usedtrucks.ryder.com/"
    When User Click on the RYDER LOGO link on left side of the header Menu
    Then User should be redirected to "https://st-usedtrucks.ryder.com/"

  @UI1
  Scenario: Contact Us Form
    Given user on the Used Vehicles website
    And user reach the contact us form on the screen to submit a request
    When User pass the "Automation" in the First Name field
    And User pass the "User" in the Last Name field
    And User pass the "Truckers" in the Business Name field
    And User pass the "Automation_" in the Email Address field
    And User pass the "9764513280" in the Phone field
    And User pass the "33178" in the Zip Code field
    And User choosen Random value from the dropdown of How soon are you looking to buy?
    And User pass the "I am just submitting Test Request" in the Comment section field
    And User click on the submit button with all required fields
    Then User should see the "Thanks for providing your contact info" message.
    Given I should have the base url for Salesforce Token generation
    When I pass the username, password and other required values as body parameters
    And I pass "/services/oauth2/token" as endpoint
    Then I should get the access bearer token for Sales Force Services
    Given I should be having the token and the base url for SalesForce
    When I pass the "Email" and name "Automation" of the contact person
    And I pass the GET request with endpoint "/services/data/v43.0/query" to SalesForce
    Then I should get the "200" as Status Code
    And I should get the recently added contact in the response

  @UI
  Scenario: Error Message for not entering required fields in the Lead form
    Given user on the Used Vehicles website
    And user reach the contact us form on the screen to submit a request
    When User click on the submit button with all required fields
    Then User should see the "First Name is required." message under FirstName field
    And User should see the "Last Name is required." message under LastName field
    And User should see the "Email Address is required." message under EmailAddress field