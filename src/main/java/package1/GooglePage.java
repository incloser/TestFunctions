package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    @FindBy (css = "input[value=\"Мне повезёт!\"]")
    private WebElement luckyMe;

    @FindBy (tagName = "title")
    private WebElement title;

    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getLuckyMe() {
        return luckyMe;
    }

    public WebElement getTitle() {
        return title;
    }
}
