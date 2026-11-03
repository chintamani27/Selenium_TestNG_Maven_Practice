
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorDisplay extends BasePage {

    By display = By.id("sciOutPut");

    public CalculatorDisplay(WebDriver d) {
        super(d);
    }

    public String getDisplayValue() {
        return getText(display);
    }
}
