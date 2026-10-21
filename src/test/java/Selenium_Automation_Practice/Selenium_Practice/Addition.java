package Selenium_Automation_Practice.Selenium_Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Addition extends Launch {
	
		@Test
		public void add() {
			
			//if number is more than 1 digit then we have to convert in into single digit separately
			//so we cinverted it in string then iterating each string char and clicking it separately 
			
			String num1 = String.valueOf(n1);
			for (char c : num1.toCharArray()) {
				WebElement number1= wait.until(ExpectedConditions.elementToBeClickable(
						By.xpath("//span[normalize-space()='"+c+"']")));
				number1.click();
			}
			
			WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='+']")));
			add.click();
			

			String num2 = String.valueOf(n2);
			for(char c : num2.toCharArray()) {
				WebElement number2= wait.until(ExpectedConditions.elementToBeClickable(
						 By.xpath("//span[normalize-space()='"+c+"']")));
				number2.click();
			}
			
			
			WebElement res = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sciout\"]/div[3]/div[5]/span[4]")));
			res.click();
			
			
		}
	
}
