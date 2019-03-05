package com.codecool.equipment.View;


import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    private HeroView heroView;
    private EquipmentListView equipmentListView;

    public MainView(HeroView heroView, EquipmentListView equipmentListView) {
        this.setCenter(heroView.getView());
        this.setLeft(equipmentListView.getView());
    }


}
