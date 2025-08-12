# 🥒 BDD Cucumber Automation Framework (Java + TestNG + Maven)

## 📌 Overview
This is a **Behavior Driven Development (BDD)** test automation framework built using:
- **Java** (programming language)
- **Cucumber** (BDD)
- **TestNG** (test runner)
- **Extent Reports + Screenshots** (customized HTML reports)
- **Page Object Model** (POM) with separated Page classes
- **Hooks** and **Base Class** for reusability
- **Wrapped methods** for cleaner and reusable actions
- **CI/CD Pipeline** (GitHub Actions) for continuous integration testing

The framework is designed to be **scalable, maintainable, and easily integrated** into any web testing project.

---

## 🛠 Tech Stack
| Tool/Library        | Purpose |
|--------------------|---------|
| **Java 11+**       | Language |
| **Cucumber**       | BDD feature file support |
| **TestNG**         | Test runner and parallel execution |
| **Maven**          | Dependency management & build tool |
| **Extent Reports** | Rich HTML reports with screenshots |
| **Selenium WebDriver** | Browser automation |
| **GitHub Actions** | CI/CD pipeline for continuous testing |

---

## 📂 Project Structure
```

src
├── main
│   └── java
│       ├── base        # BaseTest / BasePage classes
│       ├── pages       # Page Object Model classes
│       ├── utils       # Utility & wrapper methods
│
├── test
│   └── java
│       ├── stepDefinitions  # Step definitions for Cucumber
│       ├── runners          # Runner classes
│       ├── hooks            # Hooks for @Before & @After scenarios
│
├── test
│   └── resources
│       ├── features         # Feature files
│       ├── config           # Properties/config files
│
├── pom.xml                  # Maven dependencies

````

---

## ✨ Features
- **BDD with Cucumber**: Write test scenarios in Gherkin syntax for better readability.
- **Page Object Model (POM)**: Maintainable and reusable page classes.
- **Custom Wrapper Methods**: Simplified WebDriver actions with logging.
- **Hooks**: Automatic setup & teardown with screenshot capture on failure.
- **Reports**:
  - **Extent Reports**: Rich HTML reports with embedded screenshots.
  - **Cucumber HTML Report**.
- **CI/CD Integration**: Automated test execution on every push/PR using GitHub Actions.
- **Cross-browser Support**: Easily configurable for Chrome, Firefox, etc.
- **Data-driven Testing**: Using external data sources for parameterized tests.

---

## 📸 Sample Report
### Extent Report
![Extent Report Screenshot](reports/extent-report-sample.png)

### HTML Cucumber Report
![HTML Report Screenshot](reports/html-report-sample.png)

---

## 🚀 Getting Started

### Prerequisites
- **Java 11+**
- **Maven 3+**
- IDE (Eclipse/IntelliJ)
- Git

### Clone the repository
```bash
git clone https://github.com/YOUR-USERNAME/YOUR-REPO-NAME.git
cd YOUR-REPO-NAME
````

### Install dependencies

```bash
mvn clean install
```

### Run tests

#### Run all tests:

```bash
mvn clean test
```

#### Run with TestNG suite:

```bash
mvn clean test -DsuiteXmlFile=testng.xml
```

#### Run specific Cucumber tag:

```bash
mvn clean test -Dcucumber.filter.tags="@Smoke"
```

---

## ⚙️ Configuration

* **`config.properties`** → Application URL, browser type, credentials, etc.
* **`testng.xml`** → Parallel execution and test suite setup.
* **`pom.xml`** → Maven dependencies.

---

## 🔄 CI/CD Pipeline

This project includes a **GitHub Actions workflow**:

* Runs on every push & pull request.
* Executes the full automation suite.
* Uploads **Extent HTML Reports** as build artifacts.

Example Workflow File:

```yaml
name: CI - BDD Cucumber Tests

on: [push, pull_request]

jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - uses: actions/setup-java@v4
        with:
          distribution: temurin
          java-version: '11'
      - name: Run tests
        run: mvn clean test
      - name: Upload Report
        uses: actions/upload-artifact@v4
        with:
          name: extent-report
          path: reports/
```

---

## 📜 Gherkin Example

```gherkin
Feature: Login Functionality

  Scenario: Login with valid credentials
    Given User is on the login page
    When User enters valid username and password
    And Clicks on login button
    Then User should be redirected to the dashboard
```

---

## 🧑‍💻 Author

**Your Name**
📧 [your.email@example.com](mailto:your.email@example.com)
💼 [LinkedIn](https://www.linkedin.com/in/yourprofile)
📂 [GitHub](https://github.com/YOUR-USERNAME)

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

```

---

If you want, I can also create **a matching GitHub Actions YAML file** and **sample screenshots folder** so when someone visits your repo, they immediately see working reports and proof your framework runs end-to-end.  

Do you want me to prepare **that CI/CD + screenshots setup** for you so it’s 100% resume-ready?
```
