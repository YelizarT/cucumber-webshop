package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.ApparelShoesPage;

public class GridListModesSteps {
    ApparelShoesPage apparelShoesPage = new ApparelShoesPage();

    @Given("^I click to the \"([^\"]*)\" dropdown menu to select display mode$")
    public void iClickToTheDropdownMenuToSelectDisplayMode()  {
        apparelShoesPage.ViewAsDropdowMenu.click();

    }

    @When("^I selects Grid display mode$")
    public void iSelectsGridDisplayMode() {
        apparelShoesPage.gridViewMenu.click();
    }
}
