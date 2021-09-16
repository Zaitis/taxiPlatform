package pl.painm.taxiplatform.GUI;

import ch.qos.logback.core.Layout;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.painm.taxiplatform.model.Car;
import pl.painm.taxiplatform.repo.CarRepo;
import pl.painm.taxiplatform.repo.ClientRepo;

@Route
public class GUI extends VerticalLayout{
    private Button isDriverButton, isCustomerButton;
    ;

    GUI(){


        isDriverButton= new Button("Jestem Kierowcą");
        isCustomerButton= new Button("Jestem Klientem");


        isDriverButton.addClickListener(ClickEvent ->isDriver());
        isCustomerButton.addClickListener(ClickEvent ->isCustomer());

        add(isCustomerButton);
        add(isDriverButton);

    }

    public void isCustomer(){

    }


    public void isDriver(){
    }
}
