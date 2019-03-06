package com.codecool.equipment.View;


import com.codecool.equipment.DisplayConfig;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    private HeroView heroView;
    private ItemListView itemListView;
    private EquipmentListView equipmentListView;

    public MainView(HeroView heroView, ItemListView itemListView, EquipmentListView equipmentListView) {
        setPadding(new Insets(DisplayConfig.PADDING));
        this.setCenter(heroView.getView());
        this.setRight(itemListView);
        this.setLeft(equipmentListView.getView());
    }


}
