package com.cefalo.school.dp.week04.assignment.fx.containers;

import com.cefalo.school.dp.week04.assignment.fx.controls.FxComponent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
    configForm(title);
  }

  public void add(FxComponent component) {
    this.components.add(component);
    getChildren().add((Node) component);
    setPadding(new Insets(10, 10, 10, 10));
  }

  public void remove(FxComponent component) {
    this.components.remove(component);
  }

  public void getChild(int index) {
    this.components.get(index);
  }

  public boolean validate() {
    boolean result = true;
    for(FxComponent component : components) {
      result = result && component.validate();
    }

    return result;
  }

  private void configForm(String formTitle) {
    setAlignment(Pos.CENTER);
    setPadding(new Insets(25));
    Text txtTitle = new Text(formTitle);
    txtTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
  }
}
