package com.codecool.equipment.View;

import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Container;
import com.codecool.equipment.Model.Hero;
import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.List;
import java.util.Observable;

public class EquipmentListView extends Observable {

    private VBox view = new VBox();
    GridPane equipmentView = new GridPane();
  
    private Text equipmentLabel = new Text();
    private Button backButton = new Button("Back");

    public EquipmentListView() {
        view.setPrefSize(DisplayConfig.SIDE_PANE_SIZE_WIDTH, DisplayConfig.SIDE_PANE_SIZE_HEIGHT);
        view.setPadding(new Insets(DisplayConfig.PADDING));
        view.setBackground(new Background(new BackgroundFill(Color.rgb(200, 200 ,200), null, null)));
        backButton.setOnAction(e -> sendGoBackRequest());
        HBox equipmentHeader = new HBox();
        equipmentHeader.getChildren().addAll(equipmentLabel, backButton);
        view.getChildren().addAll(equipmentHeader, equipmentView);
        view.setStyle(Util.listCssLayout);
    }

    private void sendGoBackRequest() {
        setChanged();
        notifyObservers("BACK");
    }

    public void updateView(Container container) {
      equipmentLabel.setText(container.getName() + " items: \n");  
      equipmentView.getChildren().clear();
      backButton.setVisible(!(container instanceof Hero));
      List<Item> items = container.getContainedItems();
      for (int i=0; i < items.size(); i++) {
          int row = i / DisplayConfig.ITEM_GRID_COLUMN_NUMBER;
          int col = i % DisplayConfig.ITEM_GRID_COLUMN_NUMBER;
          view.add(new EquippedItemView(items.get(i), this), col, row);
      }
    }

    public GridPane getView() {
        return view;
    }

    public void sendBrowsingRequest(int containerId) {
        setChanged();
        notifyObservers(containerId);
    }
}
