package com.codecool.equipment.View;

import com.codecool.equipment.Model.Item;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class EquippedItemView extends HBox {

    public EquippedItemView(Item item) {
        Text t1 = new Text(item.getName());
        Text t2 = new Text(String.valueOf(item.getWeight()));
        getChildren().addAll(t1, t2);
    }
}
