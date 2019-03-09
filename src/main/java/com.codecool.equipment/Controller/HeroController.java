package com.codecool.equipment.Controller;

import com.codecool.equipment.Model.Container;
import com.codecool.equipment.Model.Hero;
import com.codecool.equipment.Model.Item;
import com.codecool.equipment.View.EquipmentListView;
import com.codecool.equipment.View.HeroView;

public class HeroController {

    private Hero heroModel;
    private HeroView heroView;
    private Container browsedContainer;
    private EquipmentListView equipmentListView;

    public HeroController(Hero heroModel, HeroView heroView, EquipmentListView equipmentListView) {
        this.heroModel = heroModel;
        this.heroView = heroView;
        this.equipmentListView = equipmentListView;
        this.browsedContainer = heroModel;
        updateDisplay();
    }

    public void updateDisplay() {
        heroView.updateDisplay(heroModel);
        equipmentListView.updateView(browsedContainer);
    }

    public void equipItem(Item item) {
        heroModel.equip(item);
        updateDisplay();
    }

    public void changeEquipmentView(int containerId) {
        Container container = heroModel.getInnerContainer(containerId);
        if (container != null) {
            browsedContainer = container;
            updateDisplay();
        }
    }

    public void browseBack() {
        browsedContainer = browsedContainer.getOwner();
        updateDisplay();
    }
}
