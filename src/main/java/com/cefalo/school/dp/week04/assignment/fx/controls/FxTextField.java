package com.cefalo.school.dp.week04.assignment.fx.controls;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.apache.commons.lang.StringUtils;

/**
 * Created by satyajit on 10/22/16.
 */
public class FxTextField extends HBox implements FxComponent {
  private Label label;
  private TextField textField;

  private FxTextField() {

  }

  public FxTextField(String labelText) {
    this.label = new Label(labelText);
    this.textField = new TextField();
    getChildren().addAll(this.label, this.textField);

    setDefaultConfigs();
  }

  public String getText() {
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
    return StringUtils.isNotBlank(this.textField.getText());
  }

  private void setDefaultConfigs() {
    setSpacing(5);
    setAlignment(Pos.CENTER_LEFT);
    setPadding(new Insets(5, 5, 5, 5));

    this.textField.setPrefSize(250, 30);
    this.textField.setStyle("-fx-font-size: 15pt;");

    this.label.setStyle("-fx-font-size: 15pt;");
  }
}
