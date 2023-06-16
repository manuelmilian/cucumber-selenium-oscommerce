package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage{
    public IndexPage(WebDriver driver) {
        super(driver);
    }

    private final By quickFindTxt = By.xpath("//*[@id='columnLeft']/div[3]/div[2]/form/input[1]");
    private final By shippingReturnsLink = By.linkText("Shipping & Returns");
    private final By privacyNoticeLink = By.linkText("Privacy Notice");
    private final By conditionsOfUseLink = By.linkText("Conditions of Use");
    private final By contactUsLink = By.linkText("Contact Us");
    private String titleIndexPage = "DemoSQAUPC";

    public boolean indexPageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleIndexPage);
    }

    public void setQuickFind(String text) throws Exception {
        this.sendKeys(quickFindTxt, text);
    }

    public void submitSearch() throws Exception {
        this.submit(quickFindTxt);
    }

    public void clickShippingReturnsLink() throws Exception {
        this.click(shippingReturnsLink);
    }

    public void clickPrivacyNoticeLink() throws Exception {
        this.click(privacyNoticeLink);
    }

    public void clickConditionsOfUseLink() throws Exception{
        this.click(conditionsOfUseLink);
    }

    public void clickContactUsLink() throws Exception{
        this.click(contactUsLink);
    }
}
