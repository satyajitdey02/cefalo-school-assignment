package com.cefalo.school.dp.week04.assignment.fx.controls;

import com.cefalo.school.dp.week04.assignment.validators.ValidationResponse;
import com.cefalo.school.dp.week04.assignment.validators.ValidationStatus;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 * Created by satyajit on 10/23/16.
 */
public class FxCheckBox extends HBox implements FxComponent {
  private Label label;
  private CheckBox checkBox;

  private FxCheckBox() {

  }

  public FxCheckBox(String labelText) {
    this.label = new Label(labelText);
    this.checkBox = new CheckBox();
    getChildren().addAll(this.label, this.checkBox);

    setDefaultConfigs();
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

  public ValidationResponse validate() {
    return new ValidationResponse(ValidationStatus.SUCCESS);
  }

  private void setDefaultConfigs() {
    setSpacing(5);
    setAlignment(Pos.CENTER_LEFT);
    setPadding(new Insets(5, 5, 5, 5));

    this.label.setStyle("-fx-font-size: 15pt;");
  }
}
