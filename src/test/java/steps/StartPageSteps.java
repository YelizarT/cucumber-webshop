package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.StartPage;

import static com.codeborne.selenide.Selenide.open;

public class StartPageSteps {

    StartPage startPage = new StartPage();

    @Given("^I open Demowebshop Start page$")
    public void iOpenDemowebshopStartPage() {
        open("https://demowebshop.tricentis.com/");
    }

    @When("^I push the apparel-shoes button on a webpage header$")
    public void iPushTheApparelShoesButtonOnAWebpageHeader() {
        startPage.apparelShoesLink.click();
    }



}
