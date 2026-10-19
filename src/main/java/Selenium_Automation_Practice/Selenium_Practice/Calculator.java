package Selenium_Automation_Practice.Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



//public class Calculator {
//
//	public static void main(String[] args) {
//		ChromeDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.get("https://www.calculator.net/");
//		
//		Actions act = new Actions(d);
//		
//		
//		//operators
//		WebElement add = d.findElement(By.xpath("//span[text()='+']"));
//		WebElement sub = d.findElement(By.xpath("//span[text()='-']"));
//		WebElement mult = d.findElement(By.xpath("//span[text()='×']"));
//		WebElement div = d.findElement(By.xpath("//span[text()='/']"));
//		WebElement res = d.findElement(By.xpath("//span[text()='=']"));
//		
//		
//		
//		//numbers 
//		WebElement zero = d.findElement(By.xpath("//span[text()='0']"));
//		WebElement one = d.findElement(By.xpath("//span[text()='1']"));
//		WebElement two = d.findElement(By.xpath("//span[text()='2']"));
//		WebElement three = d.findElement(By.xpath("//span[text()='3']"));
//		WebElement four = d.findElement(By.xpath("//span[text()='4']"));
//		WebElement five= d.findElement(By.xpath("//span[text()='5']"));
//		WebElement six = d.findElement(By.xpath("//span[text()='6']"));
//		WebElement seven = d.findElement(By.xpath("//span[text()='7']"));
//		WebElement eight = d.findElement(By.xpath("//span[text()='8']"));
//		WebElement nine = d.findElement(By.xpath("//span[text()='9']"));
//		
//		//operations
////		act.click(five).perform();
////		act.click(add).perform();
////		act.click(six).perform();
////		act.click(res).perform();
//		
//	
//		
////		
//		
//		
//
//	}
//
//}

public class Calculator {

	public static void main(String[] args) throws InterruptedException {

        ChromeDriver d = new ChromeDriver();
        d.manage().window().maximize();

        WebDriverWait wait =
                new WebDriverWait(d, Duration.ofSeconds(10));

        Actions act = new Actions(d);

        d.get("https://www.calculator.net/scientific-calculator.html");

        // Operators
        WebElement add = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='+']")));

        WebElement sub = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='−' or normalize-space()='–']")));

        WebElement mult = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='×']")));

        WebElement div = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='÷']")));

        WebElement res = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='=']")));

        // Numbers
        WebElement zero = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='0']")));

        WebElement one = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='1']")));

        WebElement two = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='2']")));

        WebElement three = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='3']")));

        WebElement four = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='4']")));

        WebElement five = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='5']")));

        WebElement six = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='6']")));

        WebElement seven = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='7']")));

        WebElement eight = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='8']")));

        WebElement nine = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='9']")));

        
        //additon
        act.click(five)
           .click(add)
           .click(six)
           .click(res)
           .perform();
        
        
        
        //multiplication
        act.doubleClick(six)
        		.click(mult).doubleClick(seven).click(res).perform();
        
        
        
        //division
        act.doubleClick(six)
		.click(div).doubleClick(seven).click(res).perform();
        
       
        
        //substraction
        act.doubleClick(six)
		.click(sub).doubleClick(seven).click(res).perform();

        
        
        //convert to testNG
        //run using annotations 
       
    }
}
