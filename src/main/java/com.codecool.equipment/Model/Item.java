package com.codecool.equipment.Model;

public class Item {
    private int weight;
    private String name;
    private int id;
    private static int itemCounter = 0;

    public Item() {

    }


    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Item(int weight, String name) {
        this.weight = weight;
        this.name = name;
        this.id = itemCounter++;

    }
}
