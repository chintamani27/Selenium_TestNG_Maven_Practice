package bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SetupBase {
	
	public WebDriver d ;
	
	@BeforeMethod
	public void setup() {
		d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.calculator.net/scientific-calculator.html");
		
	}
	
	
	@AfterMethod
	public void closeDriver() {
		d.close();
	}

}
