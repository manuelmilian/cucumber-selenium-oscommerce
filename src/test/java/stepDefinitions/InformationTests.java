package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InformationTests extends TestBase{

    @When("he clicks on Shipping and Returns link")
    public void heClicksOnShippingAndReturnsLink() throws Exception {
        indexPage.clickShippingReturnsLink();
    }

    @Then("Shipping and Returns information is displayed")
    public void shippingAndReturnsInformationIsDisplayed() throws Exception {
        assertEquals("Shipping & Returns", shippingPage.getH1Text());
    }

    @When("he clicks on Privacy Notice link")
    public void heClicksOnPrivacyNoticeLink() throws Exception {
        indexPage.clickPrivacyNoticeLink();
    }
    @Then("Privacy Notice information is displayed")
    public void privacyNoticeInformationIsDisplayed() throws Exception {
        assertEquals("Privacy Notice", privacyPage.getH1Text());
    }

    @When("he clicks on Conditions of Use link")
    public void heClicksOnConditionsOfUseLink() throws Exception {
        indexPage.clickConditionsOfUseLink();
    }
    @Then("Conditions of Use information is displayed")
    public void conditionsOfUseInformationIsDisplayed() throws Exception {
        assertEquals("Conditions of Use", conditionsOfUsePage.getH1Text());
    }

    @When("he clicks on Contact Us link")
    public void heClicksOnContactUsLink() throws Exception {
        indexPage.clickContactUsLink();
    }
    @Then("Contact Us information is displayed")
    public void contactUsInformationIsDisplayed() throws Exception {
        assertEquals("Contact Us", contactUsPage.getH1Text());
    }
}
