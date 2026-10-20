
package Selenium_Automation_Practice.Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launch  extends EnterNumber {

    ChromeDriver d;
    WebDriverWait wait;
    
    @BeforeClass
    public void getNumbers() {
    				enterNumber();
    }
    
    @BeforeMethod
    public void launch() {
        d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.calculator.net/scientific-calculator.html");

        wait = new WebDriverWait(d, Duration.ofSeconds(20));
    }
    
    @AfterMethod
    public void close() {
    		d.close();
    }

    
    
}
