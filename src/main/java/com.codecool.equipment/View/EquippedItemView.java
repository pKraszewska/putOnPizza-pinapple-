package com.codecool.equipment.View;

import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;

import java.util.Arrays;
import java.util.List;

public class EquippedItemView extends HBox {

    private ImageView itemImage;

    public EquippedItemView(Item item, EquippedItemView root) {
        super(10);
        setPadding(new Insets(DisplayConfig.SIDE_PANE_PADDING));
        Text name = new Text(item.getName());
        Text weight = new Text(String.valueOf(item.getWeight()));
        this.itemImage = new ImageView((new Image(createResourcesFileName(item))));
        itemImage.setFitHeight(DisplayConfig.ITEM_IMAGE_SIZE);
        itemImage.setFitWidth(DisplayConfig.ITEM_IMAGE_SIZE);
        getChildren().addAll(this.itemImage, name, weight);
    }

    private String createResourcesFileName(Item item) {
        List<String> extensions = Arrays.asList(".png", ".jpg", ".gif");
        String searchedFileName = "bomb.jpg";
        for (String extension : extensions) {
            searchedFileName = item.getName() + extension;
            if (checkIfResourceExists(searchedFileName)) {
                break;
            }
        }
        return searchedFileName;
    }

    private boolean checkIfResourceExists(String fileName) {
        return getClass().getResource("/" + fileName) != null;
    }

    }
