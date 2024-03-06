package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class ApparelShoesPage {
    public SelenideElement displayPerPageDropdowMenu = $(byId("Display per page"));
    public SelenideElement ViewAsDropdowMenu = $(byId("products-viewmode"));
    public SelenideElement gridViewMenu = $(By.xpath("//option[contains(text(value=\"https://demowebshop.tricentis.com/apparel-shoes?pagesize=4&viewmode=grid\"))]"));

}
