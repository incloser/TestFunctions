package baseHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class HelperAPI {

    public abstract WebDriver getWebDriver();

    void open(String url) {
        getWebDriver().get(url);
    }

    public WebElement $(By locator) {
        return getWebDriver().findElement(locator);
    }

}
