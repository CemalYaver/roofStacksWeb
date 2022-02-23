package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.SearchPage;

public class SearchPageStep {

    SearchPage searchPage = new SearchPage();

    @Step("Google search input text:<text>")
    public void googleSearchInputText(String text) {
        searchPage.googleSearchInputText(text);
    }

    @Step("Click google search result link:<url>")
    public void clickGoogleSearchResultLink(String url) {
        searchPage.clickGoogleSearchResultLink(url);
    }
}
