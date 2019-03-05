package com.codecool.equipment.View;


import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    private HeroView heroView;
    private ItemListView itemListView;

    public MainView(HeroView heroView, ItemListView itemListView) {
        setPadding(new Insets(25));
        this.setCenter(heroView.getView());
        this.setRight(itemListView);
    }


}
