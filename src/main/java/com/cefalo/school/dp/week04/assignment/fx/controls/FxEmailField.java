package com.cefalo.school.dp.week04.assignment.fx.controls;

import com.cefalo.school.dp.week04.assignment.utils.FieldValidator;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import org.apache.commons.lang.StringUtils;

/**
 * Created by satyajit on 10/23/16.
 */
public class FxEmailField extends HBox implements FxComponent {
  private TextField textField;

  private FxEmailField() {

  }

  public FxEmailField(String labelText) {
    Label label = new Label(labelText);
    this.textField = new TextField();
    getChildren().addAll(label, this.textField);
    setPadding(new Insets(5, 5, 5, 5));
  }

  public String getEmail() {
    return this.textField.getText();
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
    return FieldValidator.validateEmail(getEmail());
  }
}