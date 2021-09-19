package pl.painm.taxiplatform.GUI.customer;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("customerDashboard")
public class CustomerDashboard extends VerticalLayout {
    private Label label;
    public CustomerDashboard(){
        label= new Label("Witaj na Dashbordzie Klineta");

        add(label);

    }
}
