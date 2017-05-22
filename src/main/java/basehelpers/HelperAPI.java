package basehelpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

/**
 * Main helper
 */

public abstract class HelperAPI {

    /**
     * Abstract driver for descendants realization
     */
    public abstract WebDriver getWebDriver();

    /**
     * @param url Web page opening by URL
     */
    void open(String url) {
        getWebDriver().get(url);
    }

    /**
     * Taking screenshot method
     */
    public void getScreenshot() {
        File screenshot = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("D:\\screenshots\\1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param locator selenium locator
     * @return Web page element
     */
    public WebElement $(By locator) {
        return getWebDriver().findElement(locator);
    }

}
