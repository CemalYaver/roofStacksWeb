package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static utils.driver.Driver.webDriver;

public class Helper {

    WebDriverWait wait = new WebDriverWait(webDriver, 5);

    public Helper(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void waitUntilElementIsVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
    }

    public WebElement centerElement(WebElement element) {
        String scrollScript = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) webDriver).executeScript(scrollScript, element);
        return element;
    }

    public void verifyUrl(String url) {
        Assert.assertTrue(webDriver.getCurrentUrl().contains(url));
    }

    public void verifyPageTitle(String pageTitle) {
        Assert.assertTrue(webDriver.getTitle().contains(pageTitle));
    }
}
