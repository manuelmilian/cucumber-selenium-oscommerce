package stepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;

public class TestBase {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static IndexPage indexPage;
    protected static AdvancedSearchResultPage advancedSearchResultPage;
    protected static ShippingPage shippingPage;
    protected static PrivacyPage privacyPage;
    protected static ConditionsOfUsePage conditionsOfUsePage;
    protected static ContactUsPage contactUsPage;

    public static void initializeAndSetUpChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); //

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        indexPage = new IndexPage(driver);
        advancedSearchResultPage = new AdvancedSearchResultPage(driver);
        shippingPage = new ShippingPage(driver);
        privacyPage = new PrivacyPage(driver);
        conditionsOfUsePage = new ConditionsOfUsePage(driver);
        contactUsPage = new ContactUsPage(driver);

        driver.get("http://sqademosatp.net/catalog/index.php");
    }
}
