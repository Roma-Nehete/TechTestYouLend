Project YouLend Tech Test 
 - 
**Tech used in the project are -**
- Java 8 
- Maven 
- TestNG and Junit
- Cucumber and Gherkin
- IDE used IntelliJ

TechTestYouLend
├── src
|     |__main
|     |  |__ java
|     |    |__ YouLendProject
|     |      |__Pages
|     |      |__BasePage
|     |      |__BrowserSetup
|     |      |__LoadProp
|     |      |__Utils
|     |__test
|       |__java
|       |  |__ YouLendProject
|       |    |__Hook
|       |    |__StepDefinitions
|       |    |__TestRunner
|       |__Resources
|         |__BrowserDrivers
|         |__Screenshots
|         |__TestFata
|         |__YouLendProject
|           |__Feature files
├── test-output
├── pom.xml
├── testng.xml
│  
└── ReadMe.md


I have used the Page Object Model framework for setup of the project.
 
The **Resources folder** includes, The _feature file_ which has the test cases documented in Cucumber Gherkin format.

The **Test Data folder** includes the _Config file_ which has the Test Data stored in it - It can be used to add in more or make changes to the test data.

The **Screenshot folder** includes the screenshots captured when the test fails.

The **BrowserDriver folder** includes the _exe files_ required to run the automation on required browser - at the moment I have only included Chrome driver, Firefox Driver and Edge Driver.

In **Hooks** ( located in Test section of the project ) - contains the methods to use before and after the tests.

I have created classes for each page visited and the locators corresponding to that particular page are stored under the class but outside the method - which makes them reusable and also easy to modify incase of change.

The **Utils class** has the reusable methods that can be used where-ever required.

Being a **Maven** Project the dependencies will be imported automatically.

The test can be run in 3 ways using the the Runner Configurations
- Junit
- TestNG
- Cucumber Feature

The test can also br run through the command line using the following commands

_mvn clean test_

The reports generated are stored in the Test-Output folder and Target folder which would be generated after the test run.

**Improvements**
A this is a very basic framework it is quiet simple - and hence could be improved more.
- With a few more tweaks around the framework and the pom file we could integrate allure reporting in the framework.
- We could also make use of more Testng annotations depending upon the complexity of the project.
- Integrate it with Jenkins for regression runs as well as integrate with Browserstack or Saucelabs for cross browser or device testing  
