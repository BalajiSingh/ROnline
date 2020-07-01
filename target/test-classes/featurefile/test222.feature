Feature: Validating the Functionality of Locations Default page of the application

  @UITest
  Scenario Outline: Verify the page components of Locations Default page
    Given user on the Used Vehicles website

    Examples: 
      | StateName      | CityName                          |
      | Alabama        | Birmingham                        |
      | Arkansas       | North Little Rock                 |
      | Colorado       | Commerce City                     |
      | California     | Pomona;Montebello;West Sacramento |
      | Florida        | Tampa;Davie;Miami;Jacksonville    |
      | Georgia        | Atlanta                           |
      | Hawaii         | Honolulu                          |
      | Illinois       | Bolingbrook                       |
      | Indiana        | Clarksville                       |
      | Indiana        | Indianapolis                      |
      | Iowa           | Altoona                           |
      | Kansas         | Kansas City                       |
      | Louisiana      | Saint Rose                        |
      | Maryland       | Laurel                            |
      | Massachusetts  | Springfield;Salisbury             |
      | Michigan       | Taylor;Wayland                    |
      | Minnesota      | Minneapolis                       |
      | Missouri       | Ofallon                           |
      | Nevada         | Las Vegas                         |
      | New Jersey     | Kearny                            |
      | New York       | Farmingdale                       |
      | New York       | Liverpool                         |
      | North Carolina | Charlotte;Greensboro              |
      | Ohio           | Hilliard                          |
      | Oklahoma       | Oklahoma City                     |
      | Pennsylvania   | Pittsburgh;Bensalem               |
      | Puerto Rico    | Toa Baja                          |
      | Rhode Island   | Warwick                           |
      | South Carolina | Greenville                        |
      | Tennessee      | Knoxville                         |
      | Tennessee      | Nashville;Memphis                 |
      | Texas          | Houston;San Antonio               |
      | Texas          | Dallas                            |
      | Washington     | Des Moines                        |
      | Wisconsin      | Oak Creek                         |
      | Alberta        | Calgary                           |
      | Nova Scotia    | Dartmouth                         |
      | Ontario        | London                            |
      | Ontario        | Oakville                          |
      | Quebec         | Vaudreuil-Dorion                  |
