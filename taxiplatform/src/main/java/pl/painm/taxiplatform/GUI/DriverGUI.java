package pl.painm.taxiplatform.GUI;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.atmosphere.interceptor.AtmosphereResourceStateRecovery;

@Route(value = "isdriver")
public class DriverGUI extends VerticalLayout {
    private Label welcomeLabel;
    private Button buttonNewDriver, buttonLoginDriver, buttonForgetPassword;


    DriverGUI(){
        welcomeLabel= new Label("Witaj kierowco");
        buttonLoginDriver= new Button("Zaloguj");
        buttonLoginDriver.addClickListener(ClickEvent -> isLoginButton());
        buttonNewDriver= new Button("Zarejestruj");
        buttonNewDriver.addClickListener(ClickEvent -> isNewDriverButton());
        buttonForgetPassword= new Button("Zapomianłem hasła");





        add(welcomeLabel, buttonLoginDriver, buttonNewDriver,buttonForgetPassword);
    }

    private void isNewDriverButton() {
        buttonNewDriver.getUI().ifPresent(ui ->
                ui.navigate("registerdriver"));
    }

    private void isLoginButton() {
        buttonLoginDriver.getUI().ifPresent(ui ->
                ui.navigate("logindriver"));
    }
}
