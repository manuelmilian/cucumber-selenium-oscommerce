package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BasePage{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    private final By h1 = By.xpath("//*[@id='bodyContent']/h1");

    public String getH1Text() throws Exception {
        return this.getText(h1);
    }
}
