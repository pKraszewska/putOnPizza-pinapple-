package com.codecool.equipment.View;

import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.List;

public class EquipmentListView {

    GridPane view = new GridPane();

    public EquipmentListView() {
        view.setPrefSize(DisplayConfig.SIDE_PANE_SIZE_WIDTH, DisplayConfig.SIDE_PANE_SIZE_HEIGHT);
        view.setPadding(new Insets(DisplayConfig.PADDING));
        view.setBackground(new Background(new BackgroundFill(Color.rgb(200, 200 ,200), null, null)));
        view.setStyle(cssLayout);
    }

    public void updateView(List<Item> items) {
        view.getChildren().clear();
        for (int i=0; i < items.size(); i++) {
            int row = i / DisplayConfig.ITEM_GRID_COLUMN_NUMBER;
            int col = i % DisplayConfig.ITEM_GRID_COLUMN_NUMBER;
            view.add(new EquippedItemView(items.get(i), this), col, row);
        }
    }

    public GridPane getView() {
        return view;
    }

    String cssLayout = "-fx-border-color: darkblue;\n" +
            "-fx-border-insets: 0.5;\n" +
            "-fx-border-width: 3;\n" +
            "-fx-border-style: dashed;\n"+
            "-fx-border-radius: 20;\n"+
            "-fx-background-color: lightgray;\n"+
            "-fx-background-radius: 20;\n";
}
