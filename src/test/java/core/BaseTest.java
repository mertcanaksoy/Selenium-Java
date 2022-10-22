package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.OptionsManager;
import utilities.ExtentReports.ExtentManager;
import java.time.Duration;

public class BaseTest extends ExtentManager {
    public String baseUrl = "https://www.trendyol.com/";
    public WebDriver driver;

    @BeforeTest
    public void startReport() {
        startExtentReport();
    }

    @BeforeMethod
    public void setUp () {
        //Create a Chrome driver. All test classes use this.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\banua\\projects\\java_selenium\\src\\test\\java\\utilities\\chromedriver.exe");
        driver = new ChromeDriver(OptionsManager.getChromeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception{
        driver.quit();
        getExtentReportResult(result);
    }

    @AfterTest
    public void endReport() {
        endExtentReport();
    }

}