package com.codecool.equipment.Model;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private final static int CAPACITY = Config.MAX_CAPACITY;
    private List<Item> itemList = new ArrayList<>();

    public int getCAPACITY() {
        return CAPACITY;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    private void removeItem(Item item){

    }


    public void equip(Item item) {
        itemList.add(item);
    }
}


