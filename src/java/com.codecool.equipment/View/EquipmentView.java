package com.codecool.equipment.View;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class EquipmentView {



    private VBox view = new VBox();

    public EquipmentView() {
        view.setPadding(new Insets(15));
        view.setBackground(new Background(new BackgroundFill(Color.rgb(200, 200 ,200), null, null)));
    }


    public VBox getView() {
        return view;
    }
}
