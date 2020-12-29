package net.moewes;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.vaadin.Notification;
import net.moewes.cloud.ui.vaadin.TextField;
import net.moewes.cloud.ui.vaadin.Button;
import net.moewes.cloud.ui.vaadin.VerticalLayout;

@CloudUiView("/vaadinserverless")
public class MyVaadinView extends VerticalLayout {

  public MyVaadinView() {

    TextField nameField = new TextField();
    nameField.setLabel("Your Name:");
    nameField.setRequired(true);

    add(nameField);

    Button button = new Button("Say Hello");
    add(button);

    button.addEventListener("click", event -> {
      String name = nameField.getValue() == null ? "unknown" : nameField.getValue();
      Notification notification = new Notification("Hello " + name, 2000);
      add(notification);
      notification.open();
    });
  }
}