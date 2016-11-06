package web;

import baseHelpers.HelperAPI;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Main test helper
 */
class BaseTest extends HelperAPI {

    /**
     * Base driver
     */
    static WebDriver driver;

    /**
     *  Driver waiting
     */
    static WebDriverWait wait;

    /**
     * Driver getter
     * @return driver
     */
    public WebDriver getWebDriver() {
        return driver;
    }

    /**
     * Open browser & timeouts initialization
     */
    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "F:\\Distr\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
    }

    /**
     * Close browser
     */
    @After
    public void end() {
        driver.quit();
    }
}
