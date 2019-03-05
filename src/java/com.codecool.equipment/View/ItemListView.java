package com.codecool.equipment.View;

import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.List;

public class ItemListView extends GridPane {

    public ItemListView() {
        setPadding(new Insets(15));
        setBackground(new Background(new BackgroundFill(Color.rgb(200, 200 ,200), null, null)));
    }

    public void updateView(List<Item> items) {
        for (Item item : items) {
            
        }
    }

}
