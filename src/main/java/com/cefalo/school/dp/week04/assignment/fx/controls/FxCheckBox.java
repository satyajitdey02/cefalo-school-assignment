package com.cefalo.school.dp.week04.assignment.fx.controls;

import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 * Created by satyajit on 10/23/16.
 */
public class FxCheckBox extends HBox implements FxComponent {
  private CheckBox checkBox;

  private FxCheckBox() {

  }

  public FxCheckBox(String labelText) {
    Label label = new Label(labelText);
    this.checkBox = new CheckBox();
    getChildren().addAll(label, this.checkBox);
    setPadding(new Insets(5,5,5,5));
  }

  public boolean isSelected() {
    return this.checkBox.isSelected();
  }

  public void add(FxComponent component) {
    throw new UnsupportedOperationException("Can not add component.");
  }

  public void remove(FxComponent component) {
    throw new UnsupportedOperationException("Nothing to remove.");
  }

  public void getChild(int index) {
    throw new UnsupportedOperationException("No child associated with leaf component.");
  }

  public boolean validate() {
    return true;
  }
}
