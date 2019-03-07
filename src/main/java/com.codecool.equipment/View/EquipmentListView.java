package com.codecool.equipment.View;

import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.List;

public class EquipmentListView {

    private VBox view = new VBox();

    public EquipmentListView() {
        view.setPrefSize(DisplayConfig.SIDE_PANE_SIZE_WIDTH, DisplayConfig.SIDE_PANE_SIZE_HEIGHT);
        view.setPadding(new Insets(DisplayConfig.PADDING));
        view.setBackground(new Background(new BackgroundFill(Color.rgb(200, 200 ,200), null, null)));
    }

    public void updateView(List<Item> items) {
        view.getChildren().clear();
        for (Item item : items) {
            view.getChildren().add(new EquippedItemView(item));
        }
    }

    public VBox getView() {
        return view;
    }
}
