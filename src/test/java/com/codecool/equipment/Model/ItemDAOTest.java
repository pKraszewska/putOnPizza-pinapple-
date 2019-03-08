package com.codecool.equipment.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemDAOTest {

    private ItemDAO itemDAO = new ItemDAO();
    private List<Item> result;

    @BeforeEach
    void init() {
        String filePath = getClass().getResource("/items.csv").getPath();
        result = itemDAO.getAllItemsFromFile(filePath);
    }

    @Test
    void getsAllProductFromFile() {
        List<Item> expectedItems = Arrays.asList(
                new Item(13.0, "Test1"),
                new Item(43.0, "Test2"),
                new Item(11.0, "Test3")
        );
        assertEquals(expectedItems.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expectedItems.get(i).getName(), result.get(i).getName());
            assertEquals(expectedItems.get(i).getWeight(), result.get(i).getWeight());
        }
    }

    @Test
    void getsContainersCorrectly() {
        List<Item> expectedItems = Arrays.asList(
                new Item(13.0, "Test1"),
                new Container(43.0, "Test2", 7.8),
                new Item(11.0, "Test3")
        );
        assertEquals(expectedItems.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expectedItems.get(i).getClass(), result.get(i).getClass());
        }
    }
}