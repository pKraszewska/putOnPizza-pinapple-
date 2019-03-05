package com.codecool.equipment.View;

import com.codecool.equipment.Model.Item;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class ItemView extends HBox {

    public ItemView(Item item) {
        Text name = new Text(item.getName());
        Text weight = new Text(String.valueOf(item.getWeight()) + " kg");
        getChildren().addAll(name, weight);
    }
}
