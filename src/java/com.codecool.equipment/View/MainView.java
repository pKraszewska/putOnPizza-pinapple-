package com.codecool.equipment.View;


import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    private HeroView heroView;
    private ItemListView itemListView;
    private EquipmentListView equipmentListView;

    public MainView(HeroView heroView, ItemListView itemListView, EquipmentListView equipmentListView) {
        setPadding(new Insets(25));
        this.setCenter(heroView.getView());
        this.setRight(itemListView);
        this.setLeft(equipmentListView.getView());
    }


}
