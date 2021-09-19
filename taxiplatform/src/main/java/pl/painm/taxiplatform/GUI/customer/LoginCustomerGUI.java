package pl.painm.taxiplatform.GUI.customer;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.painm.taxiplatform.model.Customer;
import pl.painm.taxiplatform.model.Driver;
import pl.painm.taxiplatform.service.CustomerService;
import pl.painm.taxiplatform.service.DriverService;

@Route(value = "logincustomer")
public class LoginCustomerGUI extends VerticalLayout {
    private PasswordField passwordLogin;
    private TextField textLogin;
    private Button buttonConfirm;
    private CustomerService customerService;

    @Autowired
    LoginCustomerGUI(CustomerService customerService){
        this.customerService=customerService;

        textLogin= new TextField("Podaj Mail");
        textLogin.setPlaceholder("Wpisz Login");
        passwordLogin = new PasswordField("Podaj Hasło");
        passwordLogin.setPlaceholder("Wpisz Hasło");
        buttonConfirm = new Button("Zaloguj");
        buttonConfirm.addClickListener(ClickEvent -> isConfirm());

        add(textLogin, passwordLogin, buttonConfirm);
    }

    private void isConfirm() {
        Customer customer=customerService.findByMail(textLogin.getValue());
        if(customer.getPassword().equals(passwordLogin.getValue())){

            buttonConfirm.getUI().ifPresent(ui -> ui.navigate("customerDashboard"));

        }else
        {
            System.out.println("Błedny login bądź hasło");

        }


    }
}
