@ROL_LoginPage
Feature: BHI regression flow in Ryder Entry Online
  I want to use this template for my feature file
@Test
  @ROL_LoginPage
  Scenario Outline: Login to Ryder Online Website with Valid Username and Password positive test
    Given   User is on login page of ROL website
    When 	User Enters User ID,Password in ROL as "<username>","<password>" and clicks on the Login button
    Then 	User is on Ryder online Home page after successfull logon
  
   Examples:
   |username | password |
   |qs_auto1 | qs_auto1 |
   
  