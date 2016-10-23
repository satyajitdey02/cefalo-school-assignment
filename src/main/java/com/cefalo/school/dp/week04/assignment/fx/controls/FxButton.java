package com.cefalo.school.dp.week04.assignment.fx.controls;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 * Created by satyajit on 10/24/16.
 */
public class FxButton extends HBox {
  private Button button;

  private FxButton() {

  }

  public FxButton(String label) {
    this.button = new Button(label);
    setAlignment(Pos.BOTTOM_LEFT);
    getChildren().add(this.button);
    setPadding(new Insets(10, 10, 10, 10));
  }

  public FxButton(String label, Pos alignment) {
    this.button = new Button(label);
    setAlignment(alignment);
    getChildren().add(this.button);
  }

  public void onClickHandler(EventHandler<ActionEvent> eventHandler) {
    this.button.setOnAction(eventHandler);
  }
}
