package com.codecool.equipment.View;

import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class UnequippedItemView extends VBox {

    private int itemId;

    public UnequippedItemView(Item item) {
        super(10);
        setPadding(new Insets(DisplayConfig.PADDING));
        Text name = new Text(item.getName());
        Text weight = new Text(String.valueOf(item.getWeight()));
        itemId = item.getId();
        getChildren().addAll(name, weight);
    }
}
