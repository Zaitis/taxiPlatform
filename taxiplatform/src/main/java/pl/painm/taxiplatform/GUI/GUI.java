package pl.painm.taxiplatform.GUI;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route
public class GUI extends VerticalLayout{
    private Button isDriverButton, isCustomerButton;
    GUI(){


        isDriverButton= new Button("Jestem Kierowcą");
        isCustomerButton= new Button("Jestem Klientem");


        isDriverButton.addClickListener(ClickEvent ->isDriver());
        isCustomerButton.addClickListener(ClickEvent ->isCustomer());

        add(isCustomerButton);
        add(isDriverButton);

    }

    public void isCustomer(){
        isCustomerButton.getUI().ifPresent(ui ->
                ui.navigate("iscustomer"));

    }


    public void isDriver(){
        isDriverButton.getUI().ifPresent(ui ->
                ui.navigate("isdriver"));
    }

}
