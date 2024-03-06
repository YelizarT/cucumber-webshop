package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class StartPage {

    public SelenideElement apparelShoesLink = $(byClassName("active"));
}
