import org.junit.Test;
import org.openqa.selenium.By;
import baseHelpers.GooglePage;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Test3 extends BaseTest {

    @Test
    public void testWeb() {
        try {
            GooglePage page = new GooglePage(driver);
            page.visit();
            page.getLuckyMe().click();
            wait.until(visibilityOfElementLocated(By.xpath(".//*[@id='archive-link']/a")));
            assertTrue("Страница Дудлы Google не открылась", page.getTitle().getText().equals("Дудлы Google"));
        } catch (Exception e) {
            fail();
            e.printStackTrace();
        }
    }
}
