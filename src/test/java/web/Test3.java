package web;

import org.junit.Test;
import org.openqa.selenium.By;
import baseHelpers.GooglePage;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

/**
 * Test Description
 * Open google.com
 * Click imFeelingLucky
 * Check that Doodle page was opened
 */
public class Test3 extends BaseTest {

    @Test
    public void testGooglePage() {
        GooglePage page = new GooglePage(driver);
        try {
            page.visit();
            page.getLucky().click();
            //Waiting for Doodle page appears(by archive-link)
            wait.until(visibilityOfElementLocated(By.xpath(".//*[@id='archive']")));
            assertTrue("Страница Дудлы Google не открылась", page.getTitle().getText().equals("Дудлы Google"));
        } catch (Exception e) {
            fail();
            e.printStackTrace();
        }
        System.out.println(page.getWebDriver().getCurrentUrl() + " was opened.");
        page.getScreenshot();
    }
}
