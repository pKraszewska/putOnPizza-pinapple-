package com.codecool.equipment.Model;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Container {

    public Hero() {
        super(95.0, "Drizzt Do'Urden", Config.MAX_CAPACITY);
    }

    public List<Item> getItemList() {
        return getContainedItems();
    }

    private void removeItem(Item item){

    }


    public void equip(Item item) {
        addItem(item);
    }
}


