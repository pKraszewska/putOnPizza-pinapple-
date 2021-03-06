package com.codecool.equipment.Controller;

import com.codecool.equipment.Model.*;
import com.codecool.equipment.View.AvailableListView;
import com.codecool.equipment.View.EquipmentListView;
import com.codecool.equipment.View.HeroView;
import com.codecool.equipment.View.MainView;

import java.util.Observable;
import java.util.Observer;

public class MainController implements Observer {

    private HeroController heroController;
    private MainView mainView;
    private AvailableItemsController availableItemsController;

    public MainController() {
        this.mainView = new MainView(new HeroView(), new AvailableListView(), new EquipmentListView(), this);
        this.heroController = new HeroController(new Hero(), mainView.getHeroView(), mainView.getEquipmentView());
        availableItemsController = new AvailableItemsController(mainView.getAvailableItemsView(), new ItemPool(ItemDAO.getInstance()));

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof AvailableListView) {
            int itemId = (Integer) arg;
            Item item = availableItemsController.takeItem(itemId);
            heroController.equipItem(item);
        } else if (o instanceof EquipmentListView) {
            if (arg instanceof Integer) {
                int containerId = (Integer) arg;
                heroController.changeEquipmentView(containerId);
            } else if (arg instanceof String) {
                heroController.browseBack();
            }
        }

    }

    public MainView getMainView() {
        return mainView;
    }
}
