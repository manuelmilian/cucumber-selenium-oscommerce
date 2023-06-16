package stepDefinitions;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTests extends TestBase{

    @Given("Manuel is on index page")
    public void manuelIsOnIndexPage() throws Exception {
        assertTrue(indexPage.indexPageIsDisplayed());
    }

    @When("submit the search")
    public void submitTheSearch() throws Exception {
        indexPage.submitSearch();
    }

    @When("he types {string} in the text box of quick find")
    public void heTypesInTheTextBoxOfQuickFind(String string) throws Exception {
        indexPage.setQuickFind(string);
    }
    @Then("a list of keyboards {string} appear")
    public void aListOfKeyboardsAppear(String string) throws Exception {
        assertEquals(string, advancedSearchResultPage.getTextFirstItem());
    }
}
