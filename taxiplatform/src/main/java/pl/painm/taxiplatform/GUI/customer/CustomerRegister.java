package pl.painm.taxiplatform.GUI.customer;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.painm.taxiplatform.model.Customer;
import pl.painm.taxiplatform.model.Driver;
import pl.painm.taxiplatform.service.CustomerService;
import pl.painm.taxiplatform.service.DriverService;


@Route(value = "registercustomer")
public class CustomerRegister extends VerticalLayout {

    private TextField textName, textSurname, textCity, textEmail, textPassword;
     private Button buttonConfirm;
     private CustomerService customerService;

     @Autowired
    public CustomerRegister(CustomerService customerService){
         this.customerService=customerService;

        textName= new TextField("Podaj imię");
        textSurname= new TextField("Podaj Nazwisko");
        textEmail= new TextField("Podaj e-mail");
        textPassword= new TextField("Podaj Hasło");
        textCity= new TextField("Podaj miasto");
        buttonConfirm=new Button("Potwierdź");
        buttonConfirm.addClickListener(ClickEvent -> isConfirm());

        add(textName, textSurname,textEmail,textPassword, textCity, buttonConfirm);

    }


    private void isConfirm() {
        String name= textName.getValue();
        String surname= textSurname.getValue();
        String city= textCity.getValue();
        String email=textEmail.getValue();
        String password=textPassword.getValue();
        Customer customer = new Customer(null, name, surname, email, password, city,0);
        customerService.saveAs(customer);
        Notification notification;
        notification = new Notification("Klient został dodany", 3000);
        notification.open();
        buttonConfirm.getUI().ifPresent(ui ->
                ui.navigate("iscustomer"));
    }
}
