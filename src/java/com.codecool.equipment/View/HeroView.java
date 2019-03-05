package com.codecool.equipment.View;

import com.codecool.equipment.Model.Hero;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.awt.*;

public class HeroView {


    private VBox view = new VBox();

    public HeroView(){
        Text maxCapacity = new Text("Max Capacity : 200");
        Text currentCapacity = new Text("Current Capacity: ");
        ImageView heroImage = new ImageView(new Image("/hero.png"));
        view.setSpacing(10);
        view.getChildren().addAll(heroImage, maxCapacity,currentCapacity);
    }

    public void updateDisplay(Hero heroModel) {
    }

    public Pane getView() {
        return view;
    }
}


