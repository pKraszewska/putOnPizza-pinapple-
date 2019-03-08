package com.codecool.equipment.View;

import com.codecool.equipment.Controller.HeroController;
import com.codecool.equipment.Controller.MainController;
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
    private String currentCapacityResult = "200";
    private Text currentCapacityDisplay;
    public HeroView(){
        view.setPrefSize(DisplayConfig.HERO_IMAGE_WIDTH, DisplayConfig.HERO_IMAGE_HEIGHT);
        Text maxCapacity = new Text("Max Capacity : " +  Config.MAX_CAPACITY);
        // TODO: DO CONFIGU capacity;
        currentCapacityDisplay = new Text("Current Capacity: " + currentCapacityResult);
        ImageView heroImage = new ImageView(new Image("/hero.png"));
        heroImage.setFitHeight(DisplayConfig.HERO_IMAGE_HEIGHT);
        heroImage.setFitWidth(DisplayConfig.HERO_IMAGE_WIDTH);
        view.setSpacing(10);
        view.setAlignment(Pos.CENTER);
        view.setStyle(cssLayout);
        view.getChildren().addAll(heroImage, maxCapacity, currentCapacityDisplay);
    }

    public void updateDisplay(Hero heroModel) {
    }
    public void updateCapacityText(double currCapacity){
        view.getChildren().remove(currentCapacityDisplay);
        currentCapacityDisplay.setText(Double.toString(currCapacity));
        System.out.println(currCapacity +"<--- nowa capa");
        view.getChildren().add(currentCapacityDisplay);
    }

    public Pane getView() {
        return view;
    }

    String cssLayout = "-fx-font-size: 25;\n";
}


