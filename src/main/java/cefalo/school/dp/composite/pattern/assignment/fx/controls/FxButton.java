package cefalo.school.dp.composite.pattern.assignment.fx.controls;

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
    getChildren().add(this.button);

    setDefaultConfigs();
  }

  public FxButton(String label, Pos alignment) {
    this.button = new Button(label);
    getChildren().add(this.button);

    setDefaultConfigs();
  }

  public void onClickHandler(EventHandler<ActionEvent> eventHandler) {
    this.button.setOnAction(eventHandler);
  }

  private void setDefaultConfigs() {
    setAlignment(Pos.BOTTOM_LEFT);
    setPadding(new Insets(10, 10, 10, 10));
    setSpacing(50);

    this.button.setStyle("-fx-font-size: 15pt;");
  }
}
