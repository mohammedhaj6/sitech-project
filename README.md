# 🧪 Sitech Selenium Test Automation Project

This repository contains automated UI tests for the **Sitech** web application using **Selenium WebDriver**, **Java**, and **Maven**.  
The project demonstrates how to build and execute automated browser tests with modern CI/CD integration through **GitHub Actions**.

---

## 🚀 Project Overview

The project automates end-to-end testing scenarios for the Sitech web application, ensuring key user flows and features function as expected.

**Tech Stack:**
- Java 21  
- Selenium WebDriver  
- Maven  
- TestNG  
- Chrome / ChromeDriver  
- GitHub Actions (CI)

---

## 🧩 Project Structure

sitech-project/
├── src/
│ ├── main/
│ │ └── java/ # Main source code (if applicable)
│ └── test/
│ └── java/ # Selenium test classes
├── pom.xml # Maven configuration file
└── README.md

yaml
Copy code

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/YOUR_USERNAME/sitech-project.git
cd sitech-project
2️⃣ Configure Environment
Ensure you have:

Java 21 or higher installed

Maven configured (mvn -v)

Chrome browser installed

3️⃣ Install Dependencies
bash
Copy code
mvn clean install
4️⃣ Run Tests
bash
Copy code
mvn test
This will automatically launch Chrome and execute all Selenium tests defined under src/test/java.

🔄 Continuous Integration (GitHub Actions)
This project includes a workflow (.github/workflows/test.yml) that automatically:

Checks out the project

Sets up Java

Installs Chrome

Runs mvn clean test on every push to the main branch

You can view the test results in the Actions tab on GitHub.

Badge Example:

markdown
Copy code
![Selenium Tests](https://github.com/YOUR_USERNAME/sitech-project/actions/workflows/test.yml/badge.svg)
🧠 Notes
If your pom.xml is not in the project root, make sure the workflow specifies the correct working-directory.

For local ChromeDriver setup issues, ensure the Chrome version matches the driver version.

👩‍💻 Author
Developed by Your Name
💼 Passionate about automation, testing, and continuous integration.

