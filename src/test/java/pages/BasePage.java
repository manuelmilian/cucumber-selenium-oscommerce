package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(By element) throws Exception {
        try {
            this.driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("Unable to click on element: " + element);
        }
    }

    public void sendKeys(By element, String text) throws Exception {
        try {
            this.driver.findElement(element).sendKeys(text);
        }catch (Exception e){
            throw new Exception("Unable to type on element: " + element);
        }
    }

    public void submit(By element) throws Exception {
        try {
            this.driver.findElement(element).submit();
        }catch (Exception e){
            throw new Exception("Unable to submit the element: " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try {
            return this.driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("Element not displayed: " + element);
        }
    }

    public String getText(By element) throws Exception {
        try {
            return this.driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("Do not get text, element: " + element);
        }
    }

    public String getTitle() throws Exception {
        try {
            return this.driver.getTitle();
        }catch (Exception e){
            throw new Exception("driver.getTitle is not obtained");
        }
    }

    public String getCurrentUtl() throws Exception {
        try {
            return this.driver.getCurrentUrl();
        }catch (Exception e){
            throw new Exception("driver.getCurrentUrl is not obtained");
        }
    }
}
