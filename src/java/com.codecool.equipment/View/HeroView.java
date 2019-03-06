package com.codecool.equipment.View;

import com.codecool.equipment.Config;
import com.codecool.equipment.Model.Hero;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class HeroView {


    private VBox view = new VBox();

    public HeroView(){
        view.setPrefSize(Config.HERO_IMAGE_WIDTH, Config.HERO_IMAGE_HEIGHT);
        Text maxCapacity = new Text("Max Capacity : " +  Config.MAX_CAPACITY);
        Text currentCapacity = new Text("Current Capacity: ");
        ImageView heroImage = new ImageView(new Image("/hero.png"));
        heroImage.setFitHeight(Config.HERO_IMAGE_HEIGHT);
        heroImage.setFitWidth(Config.HERO_IMAGE_WIDTH);
        view.setSpacing(10);
        view.getChildren().addAll(heroImage, maxCapacity,currentCapacity);
    }

    public void updateDisplay(Hero heroModel) {
    }

    public Pane getView() {
        return view;
    }
}


