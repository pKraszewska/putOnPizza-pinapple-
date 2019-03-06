package com.codecool.equipment.Controller;

import com.codecool.equipment.Model.Hero;
import com.codecool.equipment.View.HeroView;

import java.util.Observable;
import java.util.Observer;

public class MainController implements Observer {

    private Hero heroModel;
    private HeroView heroView;

    public MainController(Hero heroModel, HeroView heroView) {
        this.heroModel = heroModel;
        this.heroView = heroView;
    }

    public void updateDisplay() {
        heroView.updateDisplay(heroModel);
    }



    @Override
    public void update(Observable o, Object arg) {

    }
}
