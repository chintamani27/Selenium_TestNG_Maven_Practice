package Selenium_Automation_Practice.Selenium_Practice;

import java.util.Scanner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class EnterNumber  {
	
	
	
	public int n1 ;
	public int n2;
	Scanner sc = new Scanner(System.in);
	
	public void enterNumber() {
		
		System.out.println("Enter number 1:");
		n1 = sc.nextInt();
		
		System.out.println("Enter number 2:");
		n2 = sc.nextInt();
	
		

	}
}
