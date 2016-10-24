package com.cefalo.school.dp.week04.assignment;

import com.cefalo.school.dp.week04.assignment.fx.containers.FxFieldGroup;
import com.cefalo.school.dp.week04.assignment.fx.containers.FxForm;
import com.cefalo.school.dp.week04.assignment.fx.controls.*;
import com.cefalo.school.dp.week04.assignment.fx.models.FxComboItem;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by satyajit on 10/23/16.
 */
public class App extends Application {

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    stage.setTitle("Form Validation");

    VBox layout = new VBox();
    layout.autosize();
    layout.setStyle("-fx-background-color: ghostwhite; -fx-padding: 5; -fx-spacing: 5;-fx-alignment: center;");

    Scene scene = new Scene(layout, Color.LINEN);
    stage.setScene(scene);

    /*Custom Form Component*/
    final FxComponent form = new FxForm("Form");

    /*Custom Login Field Group Component*/
    FxComponent loginFieldGroup = new FxFieldGroup();
    FxComponent email = new FxTextField("Email");
    loginFieldGroup.add(email);

    FxComponent password = new FxPasswordField("Password");
    loginFieldGroup.add(password);

    FxComponent confirmPassword = new FxPasswordField("Confirm Password");
    loginFieldGroup.add(confirmPassword);
    form.add(loginFieldGroup);

    /*Custom Basic Info Field Group Component*/
    FxComponent basicInfoFieldGroup = new FxFieldGroup();
    final FxComponent firstName = new FxTextField("First Name");
    basicInfoFieldGroup.add(firstName);

    FxComponent lastName = new FxTextField("last Name");
    basicInfoFieldGroup.add(lastName);

    ObservableList<FxComboItem> data =
        FXCollections.observableArrayList(
            new FxComboItem(-1, "Select Gender"),
            new FxComboItem(0, "Male"),
            new FxComboItem(1, "Female"),
            new FxComboItem(2, "Other"));
    FxComponent gender = new FxComboBox("Gender", data);
    basicInfoFieldGroup.add(gender);

    FxComponent maritalStatus = new FxCheckBox("Married");
    basicInfoFieldGroup.add(maritalStatus);

    form.add(basicInfoFieldGroup);

    /*Custom Address Field Group Component*/
    FxComponent addressFieldGroup = new FxFieldGroup();
    FxComponent address = new FxTextField("Address");
    addressFieldGroup.add(address);

    FxComponent city = new FxTextField("City");
    addressFieldGroup.add(city);

    FxComponent state = new FxTextField("State");
    addressFieldGroup.add(state);

    FxComponent zipCode = new FxTextField("ZIP Code");
    addressFieldGroup.add(zipCode);
    form.add(addressFieldGroup);

    /*Custom Contacts Field Group Component*/
    FxComponent contactFieldGroup = new FxFieldGroup();
    FxComponent phone = new FxPhoneNumberField("Phone");
    contactFieldGroup.add(phone);

    FxComponent mobilePhone = new FxPhoneNumberField("Mobile Phone");
    contactFieldGroup.add(mobilePhone);

    form.add(contactFieldGroup);
    layout.getChildren().add((Node) form);

    FxButton button = new FxButton("Save", Pos.BOTTOM_LEFT);
    button.onClickHandler(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        if (form.validate()) {
          System.out.println("All fields are validated.");
          return;
        }

        System.out.println("Invalid fields");
      }
    });

    layout.getChildren().add(button);
    stage.show();
  }
}
