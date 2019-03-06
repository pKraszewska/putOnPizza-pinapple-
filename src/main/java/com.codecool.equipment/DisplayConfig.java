package com.codecool.equipment;

import java.awt.*;

public class DisplayConfig {

    public static final double SCREEN_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    public static final double SCREEN_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    public static final double PADDING = 10;
    public static final double WINDOW_WIDTH = SCREEN_WIDTH * 0.75;
    public static final double WINDOW_HEIGHT = SCREEN_HEIGHT * 0.75;
    public static final double SIDE_PANE_SIZE_WIDTH = WINDOW_WIDTH * 0.25 + PADDING;
    public static final double SIDE_PANE_SIZE_HEIGHT = WINDOW_HEIGHT;
    public static final double HERO_IMAGE_WIDTH = WINDOW_WIDTH - (2 * SIDE_PANE_SIZE_WIDTH) - PADDING*2;
    public static final double HERO_IMAGE_HEIGHT = WINDOW_HEIGHT - (WINDOW_HEIGHT/3);
    public static final int ITEM_GRID_COLUMN_NUMBER = 3;


}
