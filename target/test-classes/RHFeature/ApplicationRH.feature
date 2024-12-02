#Author: Ines Joudi
Feature: ApplicationRHConnexion

  Background: 
    Given Admin is on login page

  Scenario: Login with valid credential
    When Admin Enter correct username "rayen.kharbech@csi-corporation.com" and correct password "Csi@2019"
    Then Admin is directed to the home page "Dashboard"

  Scenario: Login with invalid credential
    When Admin enter correct username "rayen.kharbech@csi-corporation.com" and incorrect password "admin123"
    Then admin is still on loginpage "Oops! 😓"
