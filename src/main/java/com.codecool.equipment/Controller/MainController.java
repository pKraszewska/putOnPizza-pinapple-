package com.codecool.equipment.Controller;

import com.codecool.equipment.Model.Hero;
import com.codecool.equipment.Model.ItemDAO;
import com.codecool.equipment.Model.ItemPool;
import com.codecool.equipment.View.AvailableListView;
import com.codecool.equipment.View.HeroView;

public class MainController {

    private Hero heroModel;
    private HeroView heroView;
    private ItemPool itemPool;
    private AvailableListView availableListView;


    public MainController(Hero heroModel) {
        this.heroModel = heroModel;
        this.heroView = heroView;
        this.itemPool = new ItemPool(ItemDAO.getInstance());
        this.availableListView = new AvailableListView();
        availableListView.updateView(itemPool.getItemList());
    }


    public void updateDisplay() {
        heroView.updateDisplay(heroModel);
    }
}
