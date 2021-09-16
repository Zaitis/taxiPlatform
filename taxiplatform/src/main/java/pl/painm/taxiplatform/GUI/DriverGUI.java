package pl.painm.taxiplatform.GUI;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class DriverGUI extends VerticalLayout {
    private Label welcomeLabel;


    DriverGUI(){
        welcomeLabel= new Label("Witaj kierowco");

        add(welcomeLabel);
    }
}
