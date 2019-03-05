package com.codecool.equipment.View;


import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    private HeroView heroView;

    public MainView(HeroView heroView) {
        this.setCenter(heroView.getView());
    }


}
