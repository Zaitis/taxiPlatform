package pl.painm.taxiplatform.GUI;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.painm.taxiplatform.model.Driver;
import pl.painm.taxiplatform.service.DriverService;

@Route(value = "logindriver")
public class LoginDriverGUI extends VerticalLayout {
    private PasswordField passwordLogin;
    private TextField textLogin;
    private Button buttonConfirm;
    private DriverService driverService;

    @Autowired
    LoginDriverGUI(DriverService driverService){
        this.driverService=driverService;

        textLogin= new TextField("Podaj Login");
        textLogin.setPlaceholder("Wpisz Login");
        passwordLogin = new PasswordField("Podaj Hasło");
        passwordLogin.setPlaceholder("Wpisz Hasło");
        buttonConfirm = new Button("Zaloguj");
        buttonConfirm.addClickListener(ClickEvent -> isConfirm());

        add(textLogin, passwordLogin, buttonConfirm);
    }

    private void isConfirm() {
        Driver driver=driverService.findByLogin(textLogin.getValue());
        if(driver.getPassword().equals(passwordLogin.getValue())){

            buttonConfirm.getUI().ifPresent(ui -> ui.navigate("driverDashboard"));

        }else
        {
            System.out.println("Błedny login bądź hasło");

        }


    }
}
