package com.codecool.equipment.Controller;

import com.codecool.equipment.Model.Hero;
import com.codecool.equipment.Model.Item;
import com.codecool.equipment.Model.ItemPool;
import com.codecool.equipment.View.AvailableListView;

public class AvailableItemsController {

    private AvailableListView availableListView;
    private ItemPool itemPool;

    public AvailableItemsController(AvailableListView availableListView, ItemPool itemPool) {
        this.availableListView = availableListView;
        this.itemPool = itemPool;
        updateView();
    }

    public void updateView() {
        availableListView.updateView(itemPool.getItemList());
    }

    public Item takeItem(int itemId) {
        Item item = itemPool.popItemById(itemId);
        updateView();
        return item;
    }
}
