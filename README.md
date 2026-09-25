# OrangeHRM Automation

## Project Overview

This project is a Selenium-based automation framework developed to
automate and validate key functionalities of the OrangeHRM application.

The framework follows the Page Object Model (POM) design pattern
to maintain reusable and organized automation code.

## Objectives

- Automate important OrangeHRM workflows
- Validate application functionality through automated test cases
- Reduce repetitive manual testing
- Create reusable and maintainable automation scripts
- Execute regression test scenarios efficiently

## Modules Automated

- Login
- Dashboard
- Employee Management (PIM)
- Recruitment
- Candidate Management

## Test Cases

The project includes automated test cases for:

- Login validation
- Dashboard verification
- PIM functionality
- Adding candidates
- Recruitment workflows

## Technologies and Tools

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Git
- GitHub
- Eclipse / IntelliJ IDEA

## Project Structure

```text
src/
├── main/
│   └── java/
│       └── com/qa/orangehrm/
│           ├── configreader/
│           ├── constants/
│           ├── driverfactory/
│           ├── pageobjects/
│           ├── utilities/
│           └── frameworkException/
│
└── test/
    ├── java/
    │   └── com/qa/orangehrm/
    │       ├── basetest/
    │       └── testcases/
    │
    └── resources/
