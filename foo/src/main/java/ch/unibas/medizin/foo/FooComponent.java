package ch.unibas.medizin.foo;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;

public class FooComponent extends CustomComponent {

    public FooComponent() {

        Label label = new Label("Fooooooo");

        // The composition root MUST be set
        setCompositionRoot(label);

    }

}
