package com.codecool.equipment.View;

import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Config;
import com.codecool.equipment.Model.Hero;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class HeroView {


    private VBox view = new VBox();

    public HeroView(){
        view.setPrefSize(DisplayConfig.HERO_IMAGE_WIDTH, DisplayConfig.HERO_IMAGE_HEIGHT);
        Text maxCapacity = new Text("Max Capacity : " +  Config.MAX_CAPACITY);
        Text currentCapacity = new Text("Current Capacity: ");
        ImageView heroImage = new ImageView(new Image("/hero.png"));
        heroImage.setFitHeight(DisplayConfig.HERO_IMAGE_HEIGHT);
        heroImage.setFitWidth(DisplayConfig.HERO_IMAGE_WIDTH);
        view.setSpacing(10);
        view.setAlignment(Pos.CENTER);
        view.getChildren().addAll(heroImage, maxCapacity,currentCapacity);
    }

    public void updateDisplay(Hero heroModel) {
    }

    public Pane getView() {
        return view;
    }
}


