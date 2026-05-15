package starter.tecnicalTest5E1;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.actions.AddItemActions;
import starter.actions.NavigateActions;
import org.openqa.selenium.WebDriver;
import starter.actions.PlaceOrderActions;

@ExtendWith(SerenityJUnit5Extension.class)
class buyTwoItems {

    @Managed(driver = "chrome")
    WebDriver driver;

    NavigateActions navigate;
    AddItemActions addItems;
    PlaceOrderActions placeOrder;

    @Test
    @DisplayName("Add two items to cart, then place order")
    void addItemsAndPlaceOrder() {
        navigate.navigateToProductStore();
        addItems.addItem();
        placeOrder.placeOrder();

    }

    @BeforeEach
    void setUp() {
        driver.manage().window().fullscreen();
    }
}
