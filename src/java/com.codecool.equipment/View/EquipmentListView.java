package com.codecool.equipment.View;

import com.codecool.equipment.Config;
import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.List;

public class EquipmentListView {

    private VBox view = new VBox();

    public EquipmentListView() {
        view.setPrefSize(Config.SIDE_PANE_SIZE_WIDTH, Config.SIDE_PANE_SIZE_HEIGHT);
        view.setPadding(new Insets(25));
        view.setBackground(new Background(new BackgroundFill(Color.rgb(200, 200 ,200), null, null)));
    }

    public void updateView(List<Item> items) {
        for (Item item : items) {
            view.getChildren().add(new EquippedItemView(item));
        }
    }

    public VBox getView() {
        return view;
    }
}
