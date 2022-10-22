package pages;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private static final By CLOSE_MODAL = By.className("modal-close");
    private static final By SEARCH_INPUT = By.cssSelector("input[data-testid='suggestion']");
    private static final By CLICK_SEARCH_BUTTON = By.cssSelector("i[data-testid='search-icon']");
    private static final By ASSERT_SEARCHED_ITEM = By.cssSelector(".dscrptn > h1");

    public void close_modal(){
        click(CLOSE_MODAL);
    }

    public void search_item(String search_item){
        writeText(SEARCH_INPUT, search_item);
        click(CLICK_SEARCH_BUTTON);
        Assert.assertEquals(readText(ASSERT_SEARCHED_ITEM), search_item);
    }
}
