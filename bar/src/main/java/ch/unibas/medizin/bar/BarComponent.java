package ch.unibas.medizin.bar;

import com.vaadin.ui.*;

public class BarComponent extends CustomComponent {

    public BarComponent(String message) {
        // A layout structure used for composition
        Panel panel = new Panel("My Custom Component");
        VerticalLayout panelContent = new VerticalLayout();
        panelContent.setMargin(true); // Very useful
        panel.setContent(panelContent);

        // Compose from multiple components
        Label label = new Label(message);
        label.setSizeUndefined(); // Shrink
        panelContent.addComponent(label);
        panelContent.addComponent(new Button("Ok"));

        // Set the size as undefined at all levels
        panelContent.setSizeUndefined();
        panel.setSizeUndefined();
        setSizeUndefined();

        // The composition root MUST be set
        setCompositionRoot(panel);
    }

}
