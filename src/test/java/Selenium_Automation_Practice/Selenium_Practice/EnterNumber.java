package Selenium_Automation_Practice.Selenium_Practice;

import java.util.Scanner;


import org.testng.annotations.BeforeSuite;

public class EnterNumber  {
	
	
	Scanner sc = new Scanner(System.in);
	public int n1 ;
	public int n2;
	
	
	public void enterNumber() {
		
		System.out.println("Enter number 1:");
		n1 = sc.nextInt();
		
		System.out.println("Enter number 2:");
		n2 = sc.nextInt();
		

	}
}
