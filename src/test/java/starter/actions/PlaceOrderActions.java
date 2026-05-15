package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.ItemPage;
import starter.pageobjects.CartPage;

public class PlaceOrderActions extends UIInteractionSteps {

    ItemPage itemPage;
    CartPage cartPage;

    @Step("User opens the home page")
    public void placeOrder(){
        $(itemPage.goToCart()).click();
        $(cartPage.PlaceOrder()).click();
        $(cartPage.NameInput()).typeAndTab("Test name");
        $(cartPage.CountryInput()).typeAndTab("Test country");
        $(cartPage.CityInput()).typeAndTab("Test city");
        $(cartPage.CardInput()).typeAndTab("Test card");
        $(cartPage.MonthInput()).typeAndTab("Test month");
        $(cartPage.YearInput()).typeAndTab("Test year");
        $(cartPage.Purchase()).click();
        $(cartPage.OkButton()).click();
    }
}