package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.SearchPage;


public class TestSearch extends BaseTest {

    @Test
    public void testSearchProduct() {
        logger = extent.createTest("Search iPhone in Trendyol.com");
        SearchPage searchPage = new SearchPage(driver);
        logger.createNode("Search page is opened");
        searchPage.close_modal();
        logger.createNode("Popup is closed");
        searchPage.search_item("iPhone");
        logger.createNode("iPhone results shown successfully");
    }

    @Test
    public void testSearchProductFailed() {
        logger = extent.createTest("Search Special Characters in Trendyol.com");
        SearchPage searchPage = new SearchPage(driver);
        logger.createNode("Search page is opened");
        searchPage.close_modal();
        logger.createNode("Popup is closed");
        searchPage.search_item("^+%&++/(^)(");
        logger.createNode("iPhone results shown successfully");
    }

}
