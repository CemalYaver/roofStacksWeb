package pages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Helper;

import java.util.List;

import static utils.driver.Driver.webDriver;

public class SearchPage extends Helper {

    private static Log log = LogFactory.getLog(SearchPage.class);

    public SearchPage() {
        super(webDriver);
    }

    @FindBy(name = "q")
    private WebElement textboxtInput;

    @FindBy(css = "cite[role='text']")
    private List<WebElement> buttonGoogleSearchResult;

    public void googleSearchInputText(String text) {
        log.info("Google search text");
        textboxtInput.sendKeys(text, Keys.ENTER);
    }

    public void clickGoogleSearchResultLink(String link) {
        log.info("Click google search result link");
        for (WebElement googleLink : buttonGoogleSearchResult) {
            if (googleLink.getText().equalsIgnoreCase(link)) {
                centerElement(googleLink);
                googleLink.click();
                break;
            }
        }
    }
}
