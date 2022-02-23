package utils.driver;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver webDriver;

    @BeforeScenario
    public void initializeDriver() {
        webDriver = DriverFactory.getDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterScenario
    public void quit() {
        webDriver.quit();
    }
}
