package com.codecool.equipment.View;

import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;



public class ItemView {
    private BorderPane bp = new BorderPane();

    public ItemView(Item item) throws  IllegalArgumentException{
        bp.setPrefSize(DisplayConfig.ITEM_IMAGE_WIDTH, DisplayConfig.ITEM_IMAGE_HEIGHT);
        Text name = new Text(item.getName());
        Text weight = new Text(Double.toString(item.getWeight()));
        try{
            ImageView itemImage = new ImageView((new Image(createResourcesFileName(item))));
            itemImage.setFitHeight(DisplayConfig.ITEM_IMAGE_HEIGHT); // zmienic w configu;
            itemImage.setFitWidth(DisplayConfig.ITEM_IMAGE_WIDTH); //zmienic w configu;
            bp.getChildren().addAll(name,weight, itemImage);
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        //pozniej zmienie na stale w configu;
        bp.setPadding(new Insets(2,2,2,2));



    }

    public BorderPane getBp() {
        return bp;
    }

    private static String createResourcesFileName(Item item){
        return (new StringBuilder()).append(item.getName()).append(".png").toString();
    }

}
