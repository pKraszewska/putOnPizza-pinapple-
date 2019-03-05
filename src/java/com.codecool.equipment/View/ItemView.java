package com.codecool.equipment.View;

import com.codecool.equipment.Model.Item;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ItemView extends VBox {

    public ItemView(Item item) {
        super(10);
        Text name = new Text(item.getName());
        Text weight = new Text(String.valueOf(item.getWeight()) + " kg");
        getChildren().addAll(name, weight);
    }
}
