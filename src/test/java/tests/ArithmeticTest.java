package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bases.SetupBase;
import pages.BasicOperations;
import pages.CalculatorDisplay;
import pages.Numbers;

import listneres.MyListeners;

@Listeners(MyListeners.class)
public class ArithmeticTest extends SetupBase{

	Numbers n;
	BasicOperations o;
	CalculatorDisplay cd;
	
	@Test(invocationCount = 1)
	public void additionTest() {
		
		n= new Numbers(d);
		n.clickThree();
		n.clickFour();
		
		o = new BasicOperations(d);
		
		o.clickAddition();
		
		n.clickThree();
		n.clickFour();
		
		o.clickEquals();
		
		cd = new CalculatorDisplay(d);
		String ans = cd.getDisplayValue();
		
		Assert.assertEquals(ans, 68,"Addition result is wrong");
		
		
	}
	
	
	@Test
public void substractionTest() {
		
		n= new Numbers(d);
		n.clickThree();
		n.clickFour();
		
		o = new BasicOperations(d);
		
		o.clickSubtraction();
		
		n.clickThree();
		n.clickFour();
		
		o.clickEquals();
		
		cd = new CalculatorDisplay(d);
		String ans = cd.getDisplayValue();
		
		Assert.assertEquals(ans, "0","Substraction result is wrong");
		
		
	}

@Test
public void multiplicationTest() {
	
	n= new Numbers(d);

	n.clickFour();
	
	o = new BasicOperations(d);
	
	o.clickMultiplication();
	
	n.clickThree();
	
	
	o.clickEquals();
	
	cd = new CalculatorDisplay(d);
	String ans = cd.getDisplayValue();
	
	Assert.assertEquals(ans, 12,"Multiplication result is wrong");
	
	
}

@Test
public void divisionTest() {
	
	n= new Numbers(d);
	
	n.clickFour();
	
	o = new BasicOperations(d);
	
	o.clickDivision();
	
	n.clickThree();
	
	
	o.clickEquals();
	
	cd = new CalculatorDisplay(d);
	String ans = cd.getDisplayValue();
	
	Assert.assertEquals(ans, 1.3333,"Substraction result is wrong");
	
	
}
}
