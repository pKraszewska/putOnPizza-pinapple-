package com.codecool.equipment.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemDAO {

    private static ItemDAO  instance = new ItemDAO();

    public static ItemDAO getInstance() {
        return instance;
    }

    public List<Item> getAllItemsFromFile(String filePath) {
        List<Item> items = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(filePath))) {
            while (sc.hasNextLine()) {
                items.add(parseLineToItem(sc.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return items;
    }

    private static Item parseLineToItem(String itemLine) {
        String[] valuesArray = itemLine.split(",");
        String name = valuesArray[0];
        double weight = Double.parseDouble(valuesArray[1]);
        boolean isContainer = Boolean.parseBoolean(valuesArray[2]);

        if (isContainer) {
            double maxCapacity = Double.parseDouble(valuesArray[3]);
            return new Container(weight, name, maxCapacity);
        } else {
            return new Item(weight, name);
        }
    }
}
