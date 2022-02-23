package pages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Helper;

import java.util.List;

import static utils.driver.Driver.webDriver;

public class HomePage extends Helper {
    private static Log log = LogFactory.getLog(HomePage.class);

    public HomePage() {
        super(webDriver);
    }

    @FindBy(css = "[class*='drop_single']")
    private List<WebElement> buttonHeaderTitle;

    public void clickHomePageMenu(String menu) {
        log.info("Click home page menu");
        for (WebElement menuName : buttonHeaderTitle) {
            if (menuName.getText().equalsIgnoreCase(menu)) {
                menuName.click();
                break;
            }
        }
    }

    public void checkContainsUrlAndPageTitle(String url, String pageTitle) {
        log.info("Check url and page title");
        verifyUrl(url);
        verifyPageTitle(pageTitle);
    }
}
