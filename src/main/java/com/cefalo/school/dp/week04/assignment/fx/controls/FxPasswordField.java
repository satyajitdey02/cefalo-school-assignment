package com.cefalo.school.dp.week04.assignment.fx.controls;

import com.cefalo.school.dp.week04.assignment.utils.FieldValidator;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import org.apache.commons.lang.StringUtils;

/**
 * Created by satyajit on 10/22/16.
 */
public class FxPasswordField extends HBox implements FxComponent {
  private PasswordField passwordField;

  private FxPasswordField() {

  }

  public FxPasswordField(String labelText) {
    Label label = new Label(labelText);
    this.passwordField = new PasswordField();
    getChildren().addAll(label, this.passwordField);
    setPadding(new Insets(5, 5, 5, 5));
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
}
