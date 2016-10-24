package com.cefalo.school.dp.week04.assignment.fx.controls;

import com.cefalo.school.dp.week04.assignment.utils.FieldValidator;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import org.apache.commons.lang.StringUtils;

/**
 * Created by satyajit on 10/22/16.
 */
public class FxPasswordField extends HBox implements FxComponent {
  private Label label;
  private PasswordField passwordField;

  private FxPasswordField() {

  }

  public FxPasswordField(String labelText) {
    this.label = new Label(labelText);
    this.passwordField = new PasswordField();
    getChildren().addAll(this.label, this.passwordField);

    setDefaultConfigs();
  }

  public String getPassword() {
    return this.passwordField.getText();
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
    return FieldValidator.validatePassword(getPassword());
  }

  private void setDefaultConfigs() {
    setSpacing(5);
    setAlignment(Pos.CENTER_LEFT);
    setPadding(new Insets(5, 5, 5, 5));

    this.passwordField.setPrefSize(250, 30);
    this.passwordField.setStyle("-fx-font-size: 15pt;");

    this.label.setStyle("-fx-font-size: 15pt;");
  }
}
