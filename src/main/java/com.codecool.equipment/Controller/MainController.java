package com.codecool.equipment.Controller;

import com.codecool.equipment.Model.Hero;
import com.codecool.equipment.Model.Item;
import com.codecool.equipment.View.EquipmentListView;
import com.codecool.equipment.View.HeroView;
import com.codecool.equipment.View.ItemListView;
import com.codecool.equipment.View.MainView;
import javafx.scene.Parent;

import java.util.Observable;
import java.util.Observer;

public class MainController implements Observer {

    private HeroController heroController;
    private MainView mainView;
    private AvailableItemsController availableItemsController;

    public MainController() {
        this.mainView = new MainView(new HeroView(), new ItemListView(), new EquipmentListView(), this);
        this.heroController = new HeroController(new Hero(), mainView.getHeroView(), mainView.getEquipmentView());
        availableItemsController = new AvailableItemsController();

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ItemListView) {
            int itemId = (Integer) arg;
            Item item = availableItemsController.takeItem(itemId);
            heroController.equipItem(item);
        }

    }

    public MainView getMainView() {
        return mainView;
    }
}
