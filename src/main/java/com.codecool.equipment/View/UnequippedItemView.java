package com.codecool.equipment.View;

import com.codecool.equipment.Controller.MainController;
import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Item;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.Observable;

public class UnequippedItemView extends Observable {

    private int itemId;

    VBox vbox = new VBox();


    public UnequippedItemView(Item item) {
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(DisplayConfig.PADDING));
        Text name = new Text(item.getName());
        Text weight = new Text(String.valueOf(item.getWeight()));
        itemId = item.getId();
        vbox.getChildren().addAll(name, weight);
        vbox.setOnMouseClicked(onMouseClickedHandler);
    }

    private EventHandler<MouseEvent> onMouseClickedHandler = e -> {
        if (e.getClickCount() == 2) {
            notifyObservers(itemId);
        }
    };

    public VBox getVbox() {
        return vbox;
    }
}

