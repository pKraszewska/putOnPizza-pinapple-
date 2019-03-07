package com.codecool.equipment.View;

import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Item;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class UnequippedItemView extends VBox {

    private int itemId;
    private AvailableListView itemListView;


    public UnequippedItemView(Item item, AvailableListView itemListView) {
        super(10);
        setPadding(new Insets(DisplayConfig.PADDING));
        Text name = new Text(item.getName());
        Text weight = new Text(String.valueOf(item.getWeight()));
        itemId = item.getId();
        this.itemListView = itemListView;
        getChildren().addAll(name, weight);
        setOnMouseClicked(onMouseClickedHandler);
    }

    private EventHandler<MouseEvent> onMouseClickedHandler = e -> {
        if (e.getClickCount() == 2){
            itemListView.sendIdtoDelete(itemId);
        }
    };

}
