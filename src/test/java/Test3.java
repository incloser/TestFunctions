import org.junit.Test;
import org.openqa.selenium.By;
import package1.GooglePage;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Test3 extends TestBase{

    @Test
    public void testWeb() {
        try {
            GooglePage page = new GooglePage(driver);
            open("https://www.google.com");
            page.getLuckyMe().click();
            wait.until(visibilityOfElementLocated(By.xpath(".//*[@id='archive-link']/a")));
            assertTrue("Страница Дудлы Google не открылась", page.getTitle().getText().equals("Дудлы Google"));
        } catch (Exception e) {
            fail();
            e.printStackTrace();
        }
    }
}
