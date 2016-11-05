import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

 class TestBase {

    static WebDriver driver;
    static WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "F:\\Distr\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
    }

    void open(String url) {
        driver.get(url);
    }

    @After
    public void end() {
        driver.quit();
    }
}
