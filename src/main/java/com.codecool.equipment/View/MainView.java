package com.codecool.equipment.View;


import com.codecool.equipment.DisplayConfig;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

import java.util.Observer;

public class MainView extends BorderPane {

    private HeroView heroView;
    private ItemListView itemListView;
    private EquipmentListView equipmentListView;

    public MainView(HeroView heroView, ItemListView itemListView, EquipmentListView equipmentListView, Observer mainObserver) {
        setPadding(new Insets(DisplayConfig.PADDING));
        this.heroView = heroView;
        this.itemListView = itemListView;
        this.equipmentListView = equipmentListView;
        itemListView.addObserver(mainObserver);
        this.setCenter(heroView.getView());
        this.setRight(itemListView.getGridPane());
        this.setLeft(equipmentListView.getView());
    }


    public HeroView getHeroView() {
        return heroView;
    }

    public EquipmentListView getEquipmentView() {
        return equipmentListView;
    }
}
