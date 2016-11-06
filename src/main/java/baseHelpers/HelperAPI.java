package baseHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Main helper
 */

public abstract class HelperAPI {

    /**
     * Abstract driver for descendants realization
     */
    public abstract WebDriver getWebDriver();

    /**
     * @param url Web page address
     */
    void open(String url) {
        getWebDriver().get(url);
    }

    /**
     * @param locator selenium locator
     * @return Web page element
     */
    public WebElement $(By locator) {
        return getWebDriver().findElement(locator);
    }

}
