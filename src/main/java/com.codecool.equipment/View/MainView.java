package com.codecool.equipment.View;


import com.codecool.equipment.DisplayConfig;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    private HeroView heroView;
    private AvailableListView availableListView;
    private EquipmentListView equipmentListView;

    public MainView(HeroView heroView, AvailableListView availableListView, EquipmentListView equipmentListView) {
        setPadding(new Insets(DisplayConfig.PADDING));
        this.setCenter(heroView.getView());
        this.setRight(availableListView);
        this.setLeft(equipmentListView.getView());
    }


}
