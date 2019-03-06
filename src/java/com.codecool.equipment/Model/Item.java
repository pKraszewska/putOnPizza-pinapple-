package com.codecool.equipment.Model;

public class Item {
    private double weight;
    private String name;
    private int id;
    private static int itemCounter = 0;


    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Item(int weight, String name, int id) {
        this.weight = weight;
        this.name = name;
        this.id = itemCounter++;

    }
}
