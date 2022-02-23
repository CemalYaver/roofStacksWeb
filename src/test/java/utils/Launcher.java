package utils;

import com.thoughtworks.gauge.Step;
import utils.driver.Driver;

public class Launcher {
    public static String URL = System.getenv("URL");
    public static String GOOGLE_URL = System.getenv("GOOGLE_URL");

    @Step("Go to the roof stacks home page")
    public void launchTheWebsite() {
        Driver.webDriver.get(URL);
    }

    @Step("Go to the google home page")
    public void launchTheGoogleWebsite() {
        Driver.webDriver.get(GOOGLE_URL);
    }
}
