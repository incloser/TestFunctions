package basehelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Main page helper
 */
class BasePage extends HelperAPI {

    /**
     * Driver
     */
    private WebDriver driver;

    /**
     * Tag <title>
     */
    @FindBy(tagName = "title")
    private WebElement title;

    /**
     * Constructor
     * @param driver main driver incoming
     */
    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Web driver getter
     * @return driver
     */
    public WebDriver getWebDriver() {
        return driver;
    }

    /**
     * @return title
     */
    public WebElement getTitle() {
        return title;
    }
}
