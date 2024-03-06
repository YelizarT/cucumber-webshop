package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.ApparelShoesPage;

public class ApparelShoesSteps {

    ApparelShoesPage apparelShoesPage = new ApparelShoesPage();


    @Then("^I click to the \"([^\"]*)\" dropdown menu$")
    public void iClickToTheDropdownMenu() {
        apparelShoesPage.displayPerPageDropdowMenu.click();


    }

}
