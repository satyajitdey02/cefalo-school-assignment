package com.cefalo.school.dp.composite.pattern.assignment.fx.controls;

import com.cefalo.school.dp.composite.pattern.assignment.validators.ValidationResponse;
import com.cefalo.school.dp.composite.pattern.assignment.fx.domain.FxComboItem;
import com.cefalo.school.dp.composite.pattern.assignment.validators.FieldValidator;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 * Created by satyajit on 10/22/16.
 */
public class FxComboBox extends HBox implements FxComponent {
  private Label label;
  private ComboBox<FxComboItem> comboBox;

  private FxComboBox() {

  }

  public FxComboBox(String labelText) {
    this.label = new Label(labelText);
    this.comboBox = new ComboBox<FxComboItem>();
    getChildren().addAll(label, this.comboBox);

    setDefaultConfigs();
  }

  public FxComboBox(String labelText, ObservableList<FxComboItem> data) {
    this.label = new Label(labelText);
    this.comboBox = new ComboBox<FxComboItem>(data);
    getChildren().addAll(this.label, this.comboBox);

    setDefaultConfigs();
  }

  public FxComboItem getSelectedItem() {
    return this.comboBox.getSelectionModel().getSelectedItem();
  }

  public void addItem(FxComboItem item) {
    this.comboBox.getItems().add(item);
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

  public ValidationResponse validate() {
   return FieldValidator.validateComboEntry(this.label.getText(), getSelectedItem().getKey());
  }

  private void setDefaultConfigs() {
    setSpacing(5);
    setAlignment(Pos.CENTER_LEFT);
    setPadding(new Insets(5, 5, 5, 5));

    this.label.setStyle("-fx-font-size: 15pt;");

    this.comboBox.setPrefSize(250, 30);
    this.comboBox.getSelectionModel().selectFirst();
  }
}
