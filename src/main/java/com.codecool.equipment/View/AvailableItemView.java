package com.codecool.equipment.View;

import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.*;

public class AvailableItemView extends VBox {

    private int itemId;
    private ImageView itemImage;

    public AvailableItemView(Item item, AvailableListView root){
      super(10);
      setPadding(new Insets(DisplayConfig.SIDE_PANE_PADDING));
      Text name = new Text(item.getName());
      Text weight = new Text(String.valueOf(item.getWeight()));
      this.itemImage = new ImageView((new Image(createResourcesFileName(item))));
      itemImage.setFitHeight(DisplayConfig.ITEM_IMAGE_SIZE);
      itemImage.setFitWidth(DisplayConfig.ITEM_IMAGE_SIZE);
      itemId = item.getId();
      getChildren().addAll(this.itemImage, name, weight);
      setOnMouseClicked((e) -> {
          if (e.getClickCount() == 2) root.sendIdtoDelete(itemId);
      });
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
