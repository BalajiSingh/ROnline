Feature: Validating the Links, focus and Images on the Home page of the application


  #Scenario: Verifying the focus on the element
    #Given User opened the website
    #When user clicks on Tab button again and again
    #And while focusing user is identifying whether it is a link or Image or both
    #Then if it is link it should have 'aria-label', 'alt' in case of Image

  @ADA
  Scenario: Verifying Focus Element All Over the Website 
    Given User opened the website
    When User navigates to Sitemap link
    And from list of Website Links user navigates all
    Then verifies whether Links & Images on every page should have 'aria-label', 'alt' respectively
    
    
