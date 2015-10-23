package ch.unibas.medizin.demo;

import ch.unibas.medizin.bar.BarComponent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringUI
public class DemoUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new BarComponent("Hello! I'm the root UI!"));
    }
}
