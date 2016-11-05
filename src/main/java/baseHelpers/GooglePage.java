package baseHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage {

    @FindBy (css = "input[value=\"Мне повезёт!\"]")
    private WebElement luckyMe;

    @FindBy (tagName = "title")
    private WebElement title;

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void visit() {
        open("https://www.google.com");
    }

    public WebElement getLuckyMe() {
        return luckyMe;
    }

    public WebElement getTitle() {
        return title;
    }
}
