package pl.painm.taxiplatform.GUI;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.painm.taxiplatform.model.Driver;
import pl.painm.taxiplatform.service.DriverService;


@Route(value = "registerdriver")
public class RegisterDriver extends VerticalLayout {

    private TextField textName, textSurname, textCity, textLogin, textPassword;
     private Button buttonConfirm;
     private DriverService driverService;

     @Autowired
    public RegisterDriver(DriverService driverService){
         this.driverService=driverService;

        textName= new TextField("Podaj imię");
        textSurname= new TextField("Podaj Nazwisko");
        textLogin= new TextField("Podaj Login");
        textPassword= new TextField("Podaj Hasło");
        textCity= new TextField("Podaj miasto");
        buttonConfirm=new Button("Potwierdź");
        buttonConfirm.addClickListener(ClickEvent -> isConfirm());

        add(textName, textSurname,textLogin,textPassword, textCity, buttonConfirm);

    }

    private void isConfirm() {
        String name= textName.getValue();
        String surname= textSurname.getValue();
        String city= textCity.getValue();
        String login=textLogin.getValue();
        String password=textPassword.getValue();
        Driver driver = new Driver(null,name,surname,login, password,city,0,0);
        driverService.saveAs(driver);
        Notification notification;
        notification = new Notification("Kierowca został dodany", 3000);
        notification.open();
        buttonConfirm.getUI().ifPresent(ui ->
                ui.navigate("isdriver"));
    }
}
