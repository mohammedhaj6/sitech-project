# 🧪 Sitech Selenium Test Automation Framework

This repository contains an advanced Selenium automation framework for the **Sitech** web application.  
It was built following **world-class best practices** in test automation, emphasizing maintainability, scalability, and CI/CD integration.

---

## 🚀 Project Overview

In this project, I built a complete Selenium-based test automation framework that includes the following features:

✅ **Page Object Model (POM)** – for better readability and reusability of test code.  
✅ **Builder Pattern** – to create flexible and maintainable test data models.  
✅ **Application & User State Management** – handled dynamically to improve test reliability.  
✅ **Parallel Execution** – allows multiple tests to run simultaneously, reducing test time.  
✅ **Allure Reporting** – generates beautiful visual reports with detailed test execution results.  
✅ **GitHub Actions CI** – for automated test execution on every code push to the main branch.

---

## 🧩 Tech Stack

- **Programming Language:** Java 21  
- **Build Tool:** Maven  
- **Testing Framework:** TestNG  
- **Automation Tool:** Selenium WebDriver  
- **Design Patterns:** Page Object Model, Builder Pattern  
- **Reporting:** Allure Reports  
- **CI/CD:** GitHub Actions  
- **Browser:** Google Chrome / ChromeDriver  

---

## 🗂️ Project Structure

sitech-project/
├── src/
│ ├── main/
│ │ └── java/ # Framework core classes (builders, drivers, utils)
│ └── test/
│ └── java/ # Test classes and test suites
├── pom.xml # Maven dependencies and plugins
├── allure-results/ # Allure raw results (after running tests)
├── testng.xml # TestNG suite configuration
└── README.md


---

## ⚙️ Setup & Execution

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/YOUR_USERNAME/sitech-project.git
cd sitech-project

2️⃣ Install Dependencies

mvn clean install

3️⃣ Run Tests Locally

mvn test

4️⃣ Generate Allure Report

After running the tests:

allure serve allure-results

This will open an interactive report in your browser with detailed results.

⚡ Parallel Execution

This framework supports parallel test execution through TestNG configuration.
The number of parallel threads can be adjusted in the testng.xml file to control concurrent browser sessions.

🔄 Continuous Integration (GitHub Actions)

This project includes a CI pipeline defined in .github/workflows/test.yml that performs the following steps automatically:

1.Checks out the repository

2.Sets up Java 21

3.Installs Google Chrome

4.Runs the Selenium tests using Maven

5.Uploads Allure test results

Badge Example:

![Selenium Tests](https://github.com/YOUR_USERNAME/sitech-project/actions/workflows/test.yml/badge.svg)

You can view detailed test logs and Allure results in the Actions tab on GitHub.

| Feature                             | Description                                                                               |
| ----------------------------------- | ----------------------------------------------------------------------------------------- |
| **Page Object Model (POM)**         | Separates page locators and logic, improving reusability and reducing maintenance effort. |
| **Builder Pattern**                 | Simplifies object creation with flexible test data setup.                                 |
| **Application/User State Handling** | Ensures tests maintain correct app/user state between executions.                         |
| **Parallel Execution**              | Runs multiple tests simultaneously for faster feedback.                                   |
| **Allure Reporting**                | Generates rich, detailed, and interactive test reports.                                   |
| **GitHub Actions**                  | Enables automated, cloud-based test execution on every commit.                            |


👩‍💻 Author

Developed by Mohammed AlHaj Mohammed

💼 Software Test Engineer passionate about automation, scalability, and continuous integration.



