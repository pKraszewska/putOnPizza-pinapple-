package com.codecool.equipment.Model;

public class Item {
    private int weight;
    private String name;
    private int id;
    private static int itemCounter = 0;





    public Item(int weight, String name, int id) {
        this.weight = weight;
        this.name = name;
        this.id = itemCounter++;

    }
}
