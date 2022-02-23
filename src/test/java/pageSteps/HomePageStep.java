package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.HomePage;

public class HomePageStep {

    HomePage homePage = new HomePage();

    @Step("Click home page menu:<menu>")
    public void clickHomePageMenu(String menu) {
        homePage.clickHomePageMenu(menu);
    }

    @Step("Check contains url:<url> and page title:<pageTitle>")
    public void checkContainsUrlAndPageTitle(String url, String pageTitle) {
        homePage.checkContainsUrlAndPageTitle(url, pageTitle);
    }
}
