package com.codecool.equipment.View;

import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.List;

public class EquipmentListView {

    private VBox view = new VBox();


    public EquipmentListView() {
        view.setPrefSize(DisplayConfig.SIDE_PANE_SIZE_WIDTH, DisplayConfig.SIDE_PANE_SIZE_HEIGHT);
        view.setPadding(new Insets(DisplayConfig.PADDING));
        view.setStyle(cssLayout);
    }

    public void updateView(List<Item> items) {
        for (Item item : items) {
            view.getChildren().add(new EquippedItemView(item));
        }
    }

    public VBox getView() {
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
