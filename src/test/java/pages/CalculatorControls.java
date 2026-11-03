
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorControls extends BasePage {

    By clear = By.cssSelector("span[onclick=\"r('C')\"]");
    By signChange = By.cssSelector("span[onclick=\"r('+/-')\"]");
    By percent = By.cssSelector("span[onclick=\"r('pc')\"]");
    By random = By.cssSelector("span[onclick=\"r('RND')\"]");
    By exponent = By.cssSelector("span[onclick=\"r('EXP')\"]");

    // Verify these two locators against the live page DOM.
    By back = By.xpath("//*[normalize-space()='Back']");
    By answer = By.xpath("//*[normalize-space()='Ans']");

    public CalculatorControls(WebDriver d) {
        super(d);
    }

    public void clickClear() {
        click(clear);
    }

    public void clickSignChange() {
        click(signChange);
    }

    public void clickPercent() {
        click(percent);
    }

    public void clickRandom() {
        click(random);
    }

    public void clickExponent() {
        click(exponent);
    }

    public void clickBack() {
        click(back);
    }

    public void clickAnswer() {
        click(answer);
    }
}
