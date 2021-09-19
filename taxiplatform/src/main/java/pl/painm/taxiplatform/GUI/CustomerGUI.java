package pl.painm.taxiplatform.GUI;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "iscustomer")
public class CustomerGUI extends VerticalLayout {
    private Label welcomeLabel;
    private Button buttonNewCustomer, buttonLoginCustomer, buttonForgetPassword;

    CustomerGUI() {
        welcomeLabel = new Label("Witaj Użytkowniku");
        buttonLoginCustomer = new Button("Zaloguj");
        buttonNewCustomer = new Button("Zarejestruj");
        buttonForgetPassword = new Button("Zapomianłem hasła");


        add(welcomeLabel, buttonLoginCustomer, buttonNewCustomer, buttonForgetPassword);
    }
}