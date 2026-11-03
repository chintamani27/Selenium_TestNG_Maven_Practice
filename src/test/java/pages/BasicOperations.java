
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicOperations extends BasePage {

    By addition = By.cssSelector("span[onclick=\"r('+')\"]");
    By subtraction = By.cssSelector("span[onclick=\"r('-')\"]");
    By multiplication = By.cssSelector("span[onclick=\"r('*')\"]");
    By division = By.cssSelector("span[onclick=\"r('/')\"]");
    By equals = By.cssSelector("span[onclick=\"r('=')\"]");

    public BasicOperations(WebDriver d) {
        super(d);
    }

    public void clickAddition() {
        click(addition);
        System.out.println(getText(addition));
    }

    public void clickSubtraction() {
        click(subtraction);
        System.out.println(getText(subtraction));
    }

    public void clickMultiplication() {
        click(multiplication);
        System.out.println(getText(multiplication));
    }

    public void clickDivision() {
        click(division);
        System.out.println(getText(division));
    }

    public void clickEquals() {
        click(equals);
        System.out.println(getText(equals));
    }
}
