package com.codecool.equipment.Controller;

import com.codecool.equipment.Model.Item;

public class AvailableItemsController {


    public Item takeItem(int itemId) {
        System.out.println("WYJEBAŁO");
        return new Item(14, "kupka");
    }
}
