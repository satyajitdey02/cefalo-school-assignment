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
import javafx.geometry.Pos;
import javafx.scene.Group;
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
    VBox root = new VBox();
    root.autosize();
    Scene scene = new Scene(root, Color.LINEN);
    stage.setScene(scene);

    final FxComponent form = new FxForm("Form");
    FxComponent loginFieldGroup = new FxFieldGroup();
    FxComponent email = new FxTextField("Email");
    loginFieldGroup.add(email);

    FxComponent password = new FxPasswordField("Password");
    loginFieldGroup.add(password);

    FxComponent confirmPassword = new FxPasswordField("Confirm Password");
    loginFieldGroup.add(confirmPassword);
    form.add(loginFieldGroup);

    FxComponent basicInfoFieldGroup = new FxFieldGroup();
    final FxComponent firstName = new FxTextField("First Name");

    basicInfoFieldGroup.add(firstName);

    FxComponent lastName = new FxTextField("last Name");
    basicInfoFieldGroup.add(lastName);

    ObservableList<FxComboItem> data =
        FXCollections.observableArrayList(
            new FxComboItem(-1, "Select gendre"),
            new FxComboItem(0, "Male"),
            new FxComboItem(1, "Female"),
            new FxComboItem(2, "Other"));
    FxComponent gender = new FxComboBox("Gender", data);
    basicInfoFieldGroup.add(gender);

    FxComponent maritalStatus = new FxCheckBox("Married");
    basicInfoFieldGroup.add(maritalStatus);

    form.add(basicInfoFieldGroup);

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

    FxComponent contactFieldGroup = new FxFieldGroup();
    FxComponent dayPhone = new FxPhoneNumberField("Day Phone");
    contactFieldGroup.add(dayPhone);

    FxComponent eveningPhone = new FxPhoneNumberField("Evening Phone");
    contactFieldGroup.add(eveningPhone);

    FxComponent mobilePhone = new FxPhoneNumberField("Mobile Phone");
    contactFieldGroup.add(mobilePhone);

    FxComponent fax = new FxPhoneNumberField("FAX");
    contactFieldGroup.add(fax);
    form.add(contactFieldGroup);

    root.getChildren().add((Node) form);

    FxButton button = new FxButton("Validate", Pos.BOTTOM_RIGHT);
    button.onClickHandler(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        if (form.validate()) {
          System.out.println("All fields are validated.");
          return;
        }

        System.out.println("Invalid fields");
      }
    });

    root.getChildren().add(button);
    stage.show();
  }
}
