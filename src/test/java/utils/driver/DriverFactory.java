package utils.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver getDriver() {
        String browser = System.getenv("BROWSER");
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
        }
        return null;
    }
}
