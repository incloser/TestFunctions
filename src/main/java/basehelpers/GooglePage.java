package basehelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Google page
 */
public class GooglePage extends BasePage {

    /**
     * Button "Мне повезёт!"
     */
    @FindBy (css = "input[value=\"Мне повезёт!\"]")
    private WebElement imFeelingLucky;

    /**
     * Constructor
     * @param driver Base driver
     */
    public GooglePage(WebDriver driver) {
        super(driver);
    }


    /**
     * Visiting Google page method
     */
    public void visit() {
        open("https://www.google.com");
    }

    /**
     * imFeelingLucky getter
     * @return imFeelingLucky
     */
    public WebElement getLucky() {
        return imFeelingLucky;
    }
}
