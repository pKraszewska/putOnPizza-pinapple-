package com.codecool.equipment.Model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemDAOTest {

    private ItemDAO itemDAO = new ItemDAO();

    @Test
    void getsAllProductFromFile() {
        List<Item> expectedItems = Arrays.asList(
                new Item(13.0, "Test1"),
                new Item(43.0, "Test2"),
                new Item(11.0, "Test3")
        );
        String filePath = getClass().getResource("/items.csv").getPath();
        List<Item> result = itemDAO.getAllItemsFromFile(filePath);
        assertEquals(expectedItems.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expectedItems.get(i).getName(), result.get(i).getName());
            assertEquals(expectedItems.get(i).getWeight(), result.get(i).getWeight());
        }
    }
}