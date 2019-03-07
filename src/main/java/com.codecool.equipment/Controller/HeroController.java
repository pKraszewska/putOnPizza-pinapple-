package com.codecool.equipment.Controller;

import com.codecool.equipment.Model.Hero;
import com.codecool.equipment.Model.Item;
import com.codecool.equipment.View.EquipmentListView;
import com.codecool.equipment.View.HeroView;

public class HeroController {

    private Hero heroModel;
    private HeroView heroView;
    private EquipmentListView equipmentListView;

    public HeroController(Hero heroModel, HeroView heroView, EquipmentListView equipmentListView) {
        this.heroModel = heroModel;
        this.heroView = heroView;
        this.equipmentListView = equipmentListView;
    }

    public void updateDisplay() {
        heroView.updateDisplay(heroModel);
        equipmentListView.updateView(heroModel.getItemList());
    }

    public void equipItem(Item item) {
        System.out.println("ZAŁOŻONED");
        heroModel.equip(item);
        updateDisplay();
    }
}
