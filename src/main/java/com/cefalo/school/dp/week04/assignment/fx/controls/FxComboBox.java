package com.cefalo.school.dp.week04.assignment.fx.controls;

import com.cefalo.school.dp.week04.assignment.fx.models.FxComboItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 * Created by satyajit on 10/22/16.
 */
public class FxComboBox extends HBox implements FxComponent {
  private ComboBox<FxComboItem> comboBox;

  private FxComboBox() {

  }

  public FxComboBox(String labelText) {
    Label label = new Label(labelText);
    this.comboBox = new ComboBox<FxComboItem>();
    getChildren().addAll(label, this.comboBox);
  }

  public FxComboBox(String labelText, ObservableList<FxComboItem> data) {
    Label label = new Label(labelText);
    this.comboBox = new ComboBox<FxComboItem>(data);
    getChildren().addAll(label, this.comboBox);
    setPadding(new Insets(5, 5, 5, 5));
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

  public boolean validate() {
    return getSelectedItem().getKey() != -1;
  }
}
