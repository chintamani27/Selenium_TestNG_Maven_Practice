
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScientificFunctions extends BasePage {

    By pi = By.cssSelector("span[onclick=\"r('pi')\"]");
    By e = By.cssSelector("span[onclick=\"r('e')\"]");

    By power = By.cssSelector("span[onclick=\"r('pow')\"]");
    By square = By.cssSelector("span[onclick=\"r('x2')\"]");
    By cube = By.cssSelector("span[onclick=\"r('x3')\"]");

    By exponential = By.cssSelector("span[onclick=\"r('ex')\"]");
    By tenPower = By.cssSelector("span[onclick=\"r('10x')\"]");

    By squareRoot = By.cssSelector("span[onclick=\"r('sqrt')\"]");
    By cubeRoot = By.cssSelector("span[onclick=\"r('3x')\"]");
    By yRoot = By.cssSelector("span[onclick=\"r('apow')\"]");

    By naturalLog = By.cssSelector("span[onclick=\"r('ln')\"]");
    By log = By.cssSelector("span[onclick=\"r('log')\"]");

    By factorial = By.cssSelector("span[onclick=\"r('n!')\"]");
    By reciprocal = By.cssSelector("span[onclick=\"r('1/x')\"]");

    By openBracket = By.cssSelector("span[onclick=\"r('(')\"]");
    By closeBracket = By.cssSelector("span[onclick=\"r(')')\"]");

    public ScientificFunctions(WebDriver d) {
        super(d);
    }

    public void clickPi() {
        click(pi);
    }

    public void clickE() {
        click(e);
    }

    public void clickPower() {
        click(power);
    }

    public void clickSquare() {
        click(square);
    }

    public void clickCube() {
        click(cube);
    }

    public void clickExponential() {
        click(exponential);
    }

    public void clickTenPower() {
        click(tenPower);
    }

    public void clickSquareRoot() {
        click(squareRoot);
    }

    public void clickCubeRoot() {
        click(cubeRoot);
    }

    public void clickYRoot() {
        click(yRoot);
    }

    public void clickNaturalLog() {
        click(naturalLog);
    }

    public void clickLog() {
        click(log);
    }

    public void clickFactorial() {
        click(factorial);
    }

    public void clickReciprocal() {
        click(reciprocal);
    }

    public void clickOpenBracket() {
        click(openBracket);
    }

    public void clickCloseBracket() {
        click(closeBracket);
    }
}
