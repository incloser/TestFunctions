package baseHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

class BasePage extends HelperAPI {

    private WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getWebDriver() {
        return driver;
    }
}
