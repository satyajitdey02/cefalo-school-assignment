package com.cefalo.school.dp.week04.assignment.fx.controls;

import com.cefalo.school.dp.week04.assignment.utils.FieldValidator;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by satyajit on 10/22/16.
 */
public class FxPasswordField extends VBox implements FxComponent {
  private HBox hBoxPassword;
  private Label labelPassword;
  private PasswordField passwordField;

  private HBox hBoxConfirmPassword = new HBox();
  private Label labelConfirmPassword;
  private PasswordField confirmPasswordField;

  public FxPasswordField() {
    this("Password*", "Confirm Password*");
  }

  public FxPasswordField(String passwordLabel, String confirmPasswordLabel) {
    this.hBoxPassword = new HBox();
    this.labelPassword = new Label(passwordLabel);
    this.passwordField = new PasswordField();
    this.hBoxPassword.getChildren().addAll(this.labelPassword, this.passwordField);

    this.hBoxConfirmPassword = new HBox();
    this.labelConfirmPassword = new Label(confirmPasswordLabel);
    this.confirmPasswordField = new PasswordField();
    this.hBoxConfirmPassword.getChildren().addAll(this.labelConfirmPassword, this.confirmPasswordField);

    getChildren().addAll(this.hBoxPassword, this.hBoxConfirmPassword);
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
    return FieldValidator.validatePassword(this.passwordField.getText(),
        this.confirmPasswordField.getText());
  }

  private void setDefaultConfigs() {
    setStyle("-fx-alignment: center-left;-fx-spacing: 5;-fx-padding: 5");
    this.hBoxPassword.setStyle("-fx-alignment: center-left;-fx-spacing: 5;-fx-padding: 5");
    this.hBoxConfirmPassword.setStyle("-fx-alignment: center-left;-fx-spacing: 5;-fx-padding: 5");


    this.passwordField.setPrefSize(250, 30);
    this.passwordField.setStyle("-fx-font-size: 15pt;");

    this.labelPassword.setStyle("-fx-font-size: 15pt;");

    this.confirmPasswordField.setPrefSize(250, 30);
    this.confirmPasswordField.setStyle("-fx-font-size: 15pt;");

    this.labelConfirmPassword.setStyle("-fx-font-size: 15pt;");
  }
}
