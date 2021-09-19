package pl.painm.taxiplatform.GUI.customer;

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
        buttonLoginCustomer.addClickListener(ClickEvent -> isLoginButton());
        buttonNewCustomer = new Button("Zarejestruj");
        buttonNewCustomer.addClickListener(ClickEvent -> isNewCustomerButton());
        buttonForgetPassword = new Button("Zapomianłem hasła");


        add(welcomeLabel, buttonLoginCustomer, buttonNewCustomer, buttonForgetPassword);
    }

    public void isLoginButton() {
        buttonNewCustomer.getUI().ifPresent(ui ->
                ui.navigate("logincustomer"));
    }

    public void isNewCustomerButton(){
        buttonLoginCustomer.getUI().ifPresent(ui ->
                ui.navigate("registercustomer"));

    }
}