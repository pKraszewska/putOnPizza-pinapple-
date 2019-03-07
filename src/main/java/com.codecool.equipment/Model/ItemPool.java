package com.codecool.equipment.Model;

import java.util.List;

public class ItemPool {
    private List<Item> itemList;
    public List<Item> getItemList() {
        return itemList;
    }



    public ItemPool(ItemDAO itemDAO) {
        this.itemList = itemDAO.getAllItemsFromFile(getClass().getResource("/items.csv").getPath());
    }
    }