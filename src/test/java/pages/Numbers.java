
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Numbers extends BasePage {

    By zero = By.cssSelector("span[onclick=\"r(0)\"]");
    By one = By.cssSelector("span[onclick=\"r(1)\"]");
    By two = By.cssSelector("span[onclick=\"r(2)\"]");
    By three = By.cssSelector("span[onclick=\"r(3)\"]");
    By four = By.cssSelector("span[onclick=\"r(4)\"]");
    By five = By.cssSelector("span[onclick=\"r(5)\"]");
    By six = By.cssSelector("span[onclick=\"r(6)\"]");
    By seven = By.cssSelector("span[onclick=\"r(7)\"]");
    By eight = By.cssSelector("span[onclick=\"r(8)\"]");
    By nine = By.cssSelector("span[onclick=\"r(9)\"]");

    By decimal = By.cssSelector("span[onclick=\"r('.')\"]");

    public Numbers(WebDriver d) {
        super(d);
    }

    public void clickZero() {
        click(zero);
        System.out.println(getText(zero));
    }

    public void clickOne() {
        click(one);
        System.out.println(getText(one));
    }

    public void clickTwo() {
        click(two);
        System.out.println(getText(two));
    }

    public void clickThree() {
        click(three);
        
        System.out.println(getText(three));
    }

    public void clickFour() {
        click(four);
        System.out.println(getText(four));
    }

    public void clickFive() {
        click(five);
        System.out.println(getText(five));
    }

    public void clickSix() {
        click(six);
        System.out.println(getText(six));
    }

    public void clickSeven() {
        click(seven);
        System.out.println(getText(seven));
    }

    public void clickEight() {
        click(eight);
        System.out.println(getText(eight));
        
    }

    public void clickNine() {
        click(nine);
        System.out.println(getText(nine));
    }

    public void clickDecimal() {
        click(decimal);
        System.out.println(getText(decimal));
    }
    
}
