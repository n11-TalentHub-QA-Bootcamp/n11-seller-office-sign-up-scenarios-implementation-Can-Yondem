package starter.n11SellerOffice.navigation.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11SellerOffice.navigation.user_interface.SellerOfficeHomePage;

public class NavigateTo {
    public static Performable theN11SellerOfficeHomePage() {
        return Task.where("{0} opens the n11 seller office home page",
                Open.browserOn().the(SellerOfficeHomePage.class));
}}
