package pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver d;

    public BasePage(WebDriver d) {
        this.d = d;
    }

    protected void click(By locator) {
        d.findElement(locator).click();
    }

    protected String getText(By locator) {
        return d.findElement(locator).getText().trim();
    }
}

