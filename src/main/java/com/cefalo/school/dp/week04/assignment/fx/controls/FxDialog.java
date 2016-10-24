package com.cefalo.school.dp.week04.assignment.fx.controls;

import com.cefalo.school.dp.week04.assignment.validators.ValidationResponse;
import com.cefalo.school.dp.week04.assignment.validators.ValidationStatus;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.List;

/**
 * Created by satyajit on 10/24/2016.
 */
public class FxDialog {
  private static Stage dialog;
  private static VBox vbox;
  public static void show(Stage initOwner, ValidationResponse response) {
    dialog = new Stage();
    dialog.initModality(Modality.APPLICATION_MODAL);
    dialog.initOwner(initOwner);
    vbox = new VBox();
    vbox.setStyle("-fx-border-color: aliceblue;");
    vbox.setPadding(new Insets(10, 10, 10, 10));
    vbox.setSpacing(5);
    vbox.autosize();

    if(response.getStatus() == ValidationStatus.SUCCESS) {
      prepareSuccessDialog();
    } else {
      prepareErrorDialog(response.getMessages());
    }

    Scene dialogScene = new Scene(vbox, Color.ALICEBLUE);
    dialog.setScene(dialogScene);
    dialog.show();
  }

  private static void prepareSuccessDialog() {
    Text statusText = new Text(ValidationStatus.SUCCESS.getValue());
    statusText.setStyle("-fx-font-size: 30pt;"
        + "-fx-font-weight: bold;"
        + "-fx-fill: green;");
    vbox.getChildren().add(statusText);

    Text messageText = new Text("All fields are validated.");
    messageText.setStyle("-fx-font-size: 15pt;"
        + "-fx-font-weight: normal;"
        + "-fx-text-fill: black;"
        + "-fx-background-color: white;");
    vbox.getChildren().add(messageText);
  }

  private static void prepareErrorDialog(List<String> messages) {
    Text statusText = new Text(ValidationStatus.ERROR.getValue());
    statusText.setStyle("-fx-font-size: 30pt;"
        + "-fx-font-weight: bold;"
        + "-fx-fill: red;");
    vbox.getChildren().add(statusText);

    for(String message : messages) {
      Text messageText = new Text(message);
      messageText.setStyle("-fx-font-size: 15pt;"
          + "-fx-font-weight: normal;"
          + "-fx-fill: black;"
          + "-fx-background-color: white;");
      vbox.getChildren().add(messageText);
    }
  }
}
