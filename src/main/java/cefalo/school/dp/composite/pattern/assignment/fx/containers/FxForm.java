package cefalo.school.dp.composite.pattern.assignment.fx.containers;

import cefalo.school.dp.composite.pattern.assignment.validators.ValidationResponse;
import cefalo.school.dp.composite.pattern.assignment.validators.ValidationStatus;
import cefalo.school.dp.composite.pattern.assignment.fx.controls.FxComponent;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/22/16.
 */
public class FxForm extends VBox implements FxComponent {
  List<FxComponent> components = new ArrayList<FxComponent>();

  private FxForm() {

  }

  public FxForm(String title) {
    setDefaultConfigs(title);
  }

  public void add(FxComponent component) {
    this.components.add(component);
    getChildren().add((Node) component);
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

  private void setDefaultConfigs(String formTitle) {
    setStyle("-fx-background-color: ghostwhite; -fx-padding: 5; -fx-spacing: 10;-fx-alignment: center");
    Text txtTitle = new Text(formTitle);
    txtTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
  }
}
