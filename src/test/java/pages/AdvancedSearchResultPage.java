package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvancedSearchResultPage extends BasePage{
    public AdvancedSearchResultPage(WebDriver driver) {
        super(driver);
    }

    private final By bodyContent = By.xpath("//*[@id='bodyContent']/div/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/a");

    public String getTextFirstItem() throws Exception {
        return this.getText(bodyContent);
    }
}
