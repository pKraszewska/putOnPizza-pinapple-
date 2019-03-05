package com.codecool.equipment.View;


import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    private HeroView heroView;
    private EquipmentView equipmentView;

    public MainView(HeroView heroView, EquipmentView equipmentView) {
        this.setCenter(heroView.getView());
        this.setLeft(equipmentView.getView());
    }


}
