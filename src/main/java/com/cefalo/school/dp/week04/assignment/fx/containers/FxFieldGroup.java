package com.cefalo.school.dp.week04.assignment.fx.containers;

import com.cefalo.school.dp.week04.assignment.fx.controls.FxComponent;
import com.cefalo.school.dp.week04.assignment.validators.ValidationResponse;
import com.cefalo.school.dp.week04.assignment.validators.ValidationStatus;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/22/16.
 */
public class FxFieldGroup extends VBox implements FxComponent {
  List<FxComponent> components = new ArrayList<FxComponent>();

  public void add(FxComponent component) {
    this.components.add(component);
    getChildren().add((Node) component);

    setDefaultConfigs();
  }

  public void remove(FxComponent component) {
    this.components.remove(component);
  }

  public void getChild(int index) {
    this.components.get(index);
  }

  public ValidationResponse validate() {
    ValidationResponse response = new ValidationResponse(ValidationStatus.SUCCESS);
    for (FxComponent component : components) {
      ValidationStatus status = component.validate().getStatus();
      List<String> messages = component.validate().getMessages();
      if (status == ValidationStatus.ERROR) {
        response.setStatus(status);//Overriding same value inside iteration. Need to find a better solution
        response.getMessages().addAll(messages);
      }
    }

    return response;
  }

  private void setDefaultConfigs() {
    setStyle("-fx-border-color: black;");
    setPadding(new Insets(10, 10, 10, 10));
    setSpacing(5);
  }
}
