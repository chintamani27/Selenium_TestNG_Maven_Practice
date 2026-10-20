package Selenium_Automation_Practice.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Multiplication extends Substraction {
	@Test
	public void mult() {
			String num1 = String.valueOf(n1);
			String num2 = String.valueOf(n2);
			
			for(char c : num1.toCharArray()) {
				WebElement number1 = wait.until(ExpectedConditions.elementToBeClickable(
						By.xpath("//span[normalize-space()='"+c+"']")));
				number1.click();
			}
			
			WebElement mult = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//*[@id=\"sciout\"]/div[3]/div[3]/span[4]")));
			mult.click();
			
			for(char c : num2.toCharArray()) {
			WebElement number2 = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//span[normalize-space()='"+c+"']")));
			number2.click();
			}
			
			WebElement res = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sciout\"]/div[3]/div[5]/span[4]")));
			res.click();
		}
	
}
