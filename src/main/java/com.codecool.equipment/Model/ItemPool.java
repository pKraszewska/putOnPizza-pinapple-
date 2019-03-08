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

    public Item popItemById(int itemId) {
        Item searchedItem = null;
        for (Item item : itemList) {
            if (item.getId() == itemId) {
                searchedItem = item;
                //itemList.remove(item);
                //break;
            }
        }
        return searchedItem;
    }
    public void removeItemFromAvailableList(Item searchedItem){
        itemList.remove(searchedItem);
    }
}