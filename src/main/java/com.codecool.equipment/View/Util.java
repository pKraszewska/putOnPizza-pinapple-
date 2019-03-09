package com.codecool.equipment.View;

import com.codecool.equipment.Model.Item;

import java.util.Arrays;
import java.util.List;

public final class Util {

    static String listCssLayout = "-fx-border-color: darkblue;\n" +
            "-fx-border-insets: 0.5;\n" +
            "-fx-border-width: 3;\n" +
            "-fx-border-style: dashed;\n"+
            "-fx-border-radius: 20;\n"+
            "-fx-background-color: lightgray;\n"+
            "-fx-background-radius: 20;\n";

    static String createResourcesFileName(Item item) {
        List<String> extensions = Arrays.asList(".png", ".jpg", ".gif");
        String searchedFileName = "";
        boolean resourceFound = false;
        for (String extension : extensions) {
            searchedFileName = item.getName() + extension;
            if (checkIfResourceExists(searchedFileName)) {
                resourceFound = true;
                break;
            }
        }
        searchedFileName = resourceFound ? searchedFileName : "bomb.jpg";
        return searchedFileName;
    }

    private static boolean checkIfResourceExists(String fileName) {
        return Util.class.getResource("/" + fileName) != null;
    }

}
