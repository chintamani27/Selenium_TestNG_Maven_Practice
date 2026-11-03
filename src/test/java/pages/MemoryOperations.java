
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MemoryOperations extends BasePage {

    By memoryStore = By.cssSelector("span[onclick=\"r('MS')\"]");
    By memoryAdd = By.cssSelector("span[onclick=\"r('M+')\"]");
    By memorySubtract = By.cssSelector("span[onclick=\"r('M-')\"]");
    By memoryRecall = By.cssSelector("span[onclick=\"r('MR')\"]");
    By memoryClear = By.cssSelector("span[onclick=\"r('MC')\"]");

    public MemoryOperations(WebDriver d) {
        super(d);
    }

    public void clickMemoryStore() {
        click(memoryStore);
    }

    public void clickMemoryAdd() {
        click(memoryAdd);
    }

    public void clickMemorySubtract() {
        click(memorySubtract);
    }

    public void clickMemoryRecall() {
        click(memoryRecall);
    }

    public void clickMemoryClear() {
        click(memoryClear);
    }
}
