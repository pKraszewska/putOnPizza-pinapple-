package com.codecool.equipment.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemDAO {

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
        return new Item(Integer.parseInt(valuesArray[1]), valuesArray[0]);
    }
}
