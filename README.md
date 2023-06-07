# myTinyTodo-Test-automation

# Test Automation Framework

This is an automation framework built using Java for performing tests on the MyTinyTodo web application.

## Framework Structure

The framework is structured using the Page Object Model (POM) design pattern. It consists of the following key components:

- `pageObject` package: Contains classes representing different pages of the web application. Each page class encapsulates the web elements and actions related to that page.

- `tests` package: Contains test classes for different scenarios. Each test class interacts with the corresponding page objects to perform tests and validations.

- `BasePage` class: A base class that provides common methods and utilities for interacting with web elements, handling alerts, performing mouse actions, managing windows, etc. Other page classes extend this base class.

- `BaseTest` class: A base test class that sets up the WebDriver, manages the browser instance, and performs common setup and teardown operations for test classes.

## How to Run the Tests

To run the tests using this framework, follow these steps:

1. Set up the required WebDriver. In this framework, the ChromeDriver is used. Ensure that the ChromeDriver executable is available and the system property is set accordingly.

2. Instantiate the required page objects and interact with them to perform tests. Sample test classes are provided in the `tests` package, such as `AddSimpleTaskTest`, `AddAdvTaskTest`, `AddListTest`, and `SearchTest`.

3. Run the desired test class by executing its main method. This will launch the Chrome browser, navigate to the MyTinyTodo web application, and perform the specified tests.

4. After the tests are executed, the browser will close automatically.

**> Note:** The framework assumes that the MyTinyTodo web application is accessible at the URL "https://www.mytinytodo.net/demo/". Make sure the application is running and accessible before running the tests.

Make sure to update the ChromeDriver path according to your system configuration.

Feel free to explore the provided test classes and page objects to understand how the framework works and extend it further based on your specific requirements.
