package com.codecool.equipment.View;

import com.codecool.equipment.DisplayConfig;
import com.codecool.equipment.Model.Item;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.List;

public class ItemListView extends GridPane {

    public ItemListView() {
        setPadding(new Insets(15));
        setBackground(new Background(new BackgroundFill(Color.rgb(200, 200 ,200), null, null)));
        setPrefSize(DisplayConfig.SIDE_PANE_SIZE_WIDTH, DisplayConfig.SIDE_PANE_SIZE_HEIGHT);
        setStyle(cssLayout);
    }

    /**
     * Updates the list of available items in the view.
     * Because the list is a GridPane (a 2d matrix with rows and columns) and the data comes as
     * simple 1d list we need to fill up the correct row and column with every item from the list.
     * To get correct row index we divide the item original index by fixed number of columns in the grid.
     * To get the correct column index we take modulo of the fixed column number.
     * (e.g. i = 7, fixed num = 4
     * 7 / 4 = 1(.75)
     * 7 % 4 = 3
     * so the list[7] becomes matrix[1][3].
     *
     * @see DisplayConfig#ITEM_GRID_COLUMN_NUMBER
     *
     * @param items
     */
    public void updateView(List<Item> items) {
        for (int i = 0; i < items.size(); i++) {
            int row = i / DisplayConfig.ITEM_GRID_COLUMN_NUMBER;
            int col = i % DisplayConfig.ITEM_GRID_COLUMN_NUMBER;
            add(new UnequippedItemView(items.get(i)).getVbox(), col ,row);
        }
    }

    String cssLayout = "-fx-border-color: darkblue;\n" +
            "-fx-border-insets: 0.5;\n" +
            "-fx-border-width: 3;\n" +
            "-fx-border-style: dashed;\n"+
            "-fx-border-radius: 20;\n"+
            "-fx-background-color: lightgray;\n"+
            "-fx-background-radius: 20;\n";


}
