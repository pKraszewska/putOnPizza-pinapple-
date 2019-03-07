package com.codecool.equipment.Model;

import java.util.ArrayList;
import java.util.List;

public class Container extends Item {

    private double maxCapacity;
    private List<Item> containedItems = new ArrayList<>();

    public Container(Double weight, String name, double maxCapacity) {
        super(weight, name);
        this.maxCapacity = maxCapacity;
    }

    public void addItem(Item item) {
        containedItems.add(item);
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public List<Item> getContainedItems() {
        return containedItems;
    }

    @Override
    public double getWeight() {
        double currentWeight = super.getWeight();
        for (Item item : containedItems) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }

    public Container getInnerContainer(int containerId) {
        Container container = null;
        for (Item item : containedItems) {
            if (item.getId() == containerId) {
                if (item instanceof Container) {
                    container = (Container) item;
                } else {
                    break;
                }
            }
        }

        return container;
    }

    public Container getOwner() {
        return owner;
    }
}
