package pl.painm.taxiplatform.GUI.driver;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("driverDashboard")
public class DriverDashboard extends VerticalLayout {
    private Label label;
    public DriverDashboard(){
        label= new Label("Witaj na Dashbordzie kierowcy");

        add(label);

    }
}
