package com.codecool.equipment.View;

import com.codecool.equipment.Model.Container;
import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;

import java.util.Arrays;
import java.util.List;

public class EquippedItemView extends VBox {

    private ImageView itemImage;

    public EquippedItemView(Item item, EquipmentListView root) {
        super(10);
        setPadding(new Insets(DisplayConfig.SIDE_PANE_PADDING));
        Text name = new Text(item.getName());
        Text weight = new Text(String.valueOf(item.getWeight()));
        this.itemImage = new ImageView((new Image(Util.createResourcesFileName(item))));
        itemImage.setFitHeight(DisplayConfig.ITEM_IMAGE_SIZE);
        itemImage.setFitWidth(DisplayConfig.ITEM_IMAGE_SIZE);
        getChildren().addAll(this.itemImage, name, weight);
        if (item instanceof Container) {
            setOnMouseClicked(e -> root.sendBrowsingRequest(item.getId()));
        }
    }
}
