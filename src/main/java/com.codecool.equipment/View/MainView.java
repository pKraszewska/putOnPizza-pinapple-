package com.codecool.equipment.View;


import com.codecool.equipment.DisplayConfig;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

import java.util.Observer;

public class MainView extends BorderPane {

    private HeroView heroView;
    private AvailableListView availableListView;
    private EquipmentListView equipmentListView;

    public MainView(HeroView heroView, AvailableListView availableListView, EquipmentListView equipmentListView, Observer mainObserver) {
        setPadding(new Insets(DisplayConfig.PADDING));
        this.heroView = heroView;
        this.availableListView = availableListView;
        this.equipmentListView = equipmentListView;
        this.availableListView.addObserver(mainObserver);
        this.setCenter(heroView.getView());
        this.setRight(availableListView.getGridPane());
        this.setLeft(equipmentListView.getView());
    }


    public HeroView getHeroView() {
        return heroView;
    }

    public EquipmentListView getEquipmentView() {
        return equipmentListView;
    }

    public AvailableListView getAvailableItemsView() {
        return availableListView;
    }
}
