package utilities;

import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsManager {

    //Get Chrome Options
    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        //options.addArguments("--incognito");
        //options.addArguments("--headless");
        return options;
    }

}
