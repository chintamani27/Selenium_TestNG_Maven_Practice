# Selenium Calculator Automation using Java

## 📌 Project Overview

This project automates arithmetic operations on the [Calculator.net Scientific Calculator](https://www.calculator.net/scientific-calculator.html) using Selenium WebDriver with Java and TestNG.

The project demonstrates web UI automation, dynamic XPath locators, explicit waits, reusable methods, Java inheritance, and sequential test execution using TestNG annotations.

## 🎯 Objectives

- Automate basic arithmetic operations using Selenium WebDriver.
- Accept numbers dynamically from the user through the console.
- Handle multi-digit numbers by clicking individual keypad digits.
- Use explicit waits to improve element interaction reliability.
- Implement code reusability through Java inheritance.
- Organize and execute test methods using TestNG.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Testing Framework:** TestNG
- **Build Tool:** Maven 
- **Browser:** Google Chrome
- **IDE:** Eclipse
- **Website Under Test:** [Calculator.net Scientific Calculator
](https://www.calculator.net/scientific-calculator.html)
## ✨ Features

- Addition
- Subtraction
- Multiplication
- Division
- Console-based input for two numbers
- Digit-by-digit keypad interaction for multi-digit numbers
- Explicit waits using `WebDriverWait`
- XPath-based element identification
- Reusable methods for entering numbers
- TestNG annotations for test execution and browser setup

## 📂 Project Structure

```text

Selenium_Practice/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Selenium_Automation_Practice/
│   │           ├── App.java
│   │           └── Calculator.java
│   │
│   └── test/
│       └── java/
│           └── Selenium_Automation_Practice/
│               ├── Addition.java
│               ├── AppTest.java
│               ├── Division.java
│               ├── EnterNumber.java
│               ├── Launch.java
│               ├── Multiplication.java
│               └── Substraction.java
│
├── pom.xml
├── testng.xml
├── README.md
├── target/
└── test-output/

```


## ⚙️ Prerequisites

Before running the project, ensure that you have:

1. Java JDK installed and configured.
2. Eclipse IDE or another Java IDE.
3. Selenium WebDriver dependencies configured.
4. TestNG installed and configured.
5. Google Chrome installed.
6. A working internet connection to access Calculator.net.

If the project uses Maven, verify that the Selenium and TestNG dependencies are present in `pom.xml`.

## 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/chintamani27/Selenium-Maven-Automation-Practice.git
   ```

2. Open the project in Eclipse.

3. Configure the Java, Selenium, and TestNG dependencies.

4. Open the required arithmetic operation test class.

5. Run the class using **Run As → TestNG Test**.

6. Enter the two numbers in the console when prompted.

7. Selenium opens the calculator webpage and clicks the corresponding keypad buttons to perform the operation.

## 🔄 Test Execution Flow

1. Read the two numbers from the console.
2. Launch the calculator webpage.
3. Convert each number into a string.
4. Click individual digits on the calculator keypad.
5. Click the required arithmetic operator.
6. Enter the second number.
7. Click the equals button.
8. Observe the displayed result.

## 🧪 Selenium Concepts Practiced

- `ChromeDriver` initialization
- `@BeforeMethod` and `@Test` annotations
- `WebDriverWait`
- `ExpectedConditions.elementToBeClickable()`
- `By.xpath()` locators
- `WebElement` interactions
- Java `String.valueOf()`
- `toCharArray()` and enhanced `for` loops
- Java inheritance and reusable methods
- TestNG test priorities for sequential execution

## 📈 Future Enhancements

- Add assertions to validate the calculator results automatically.
- Add reporting using TestNG reports or ExtentReports.
- Implement a Page Object Model (POM) framework.
- Add data-driven testing using TestNG `@DataProvider`.
- Improve XPath locators and centralize reusable locators.
- Add negative-number and decimal-number support.
- Integrate the project with Jenkins for CI/CD execution.

## 👨‍💻 Author

**Chintamani Adak**

GitHub: [chintamani27](https://github.com/chintamani27)

---

*This project was developed for learning and practicing Java-based web UI automation using Selenium WebDriver and TestNG.*

