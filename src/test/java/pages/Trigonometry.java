
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Trigonometry extends BasePage {

    By sin = By.cssSelector("span[onclick=\"r('sin')\"]");
    By cos = By.cssSelector("span[onclick=\"r('cos')\"]");
    By tan = By.cssSelector("span[onclick=\"r('tan')\"]");

    By inverseSin = By.cssSelector("span[onclick=\"r('asin')\"]");
    By inverseCos = By.cssSelector("span[onclick=\"r('acos')\"]");
    By inverseTan = By.cssSelector("span[onclick=\"r('atan')\"]");

    By degree = By.id("scirdsettingd");
    By radian = By.id("scirdsettingr");

    public Trigonometry(WebDriver d) {
        super(d);
    }

    public void clickSin() {
        click(sin);
    }

    public void clickCos() {
        click(cos);
    }

    public void clickTan() {
        click(tan);
    }

    public void clickInverseSin() {
        click(inverseSin);
    }

    public void clickInverseCos() {
        click(inverseCos);
    }

    public void clickInverseTan() {
        click(inverseTan);
    }

    public void selectDegree() {
        click(degree);
    }

    public void selectRadian() {
        click(radian);
    }
}
