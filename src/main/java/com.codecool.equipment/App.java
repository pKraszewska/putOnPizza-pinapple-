package com.codecool.equipment;
import com.codecool.equipment.Controller.MainController;
import com.codecool.equipment.Model.Hero;
import com.codecool.equipment.Model.ItemDAO;
import com.codecool.equipment.Model.ItemPool;
import com.codecool.equipment.View.EquipmentListView;
import com.codecool.equipment.View.HeroView;
import com.codecool.equipment.View.AvailableListView;
import com.codecool.equipment.View.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {


    @Override
    public void start(Stage primaryStage) {
        HeroView heroView = new HeroView();
        MainController mc = new MainController(new Hero());
        ItemPool itemPool = new ItemPool(ItemDAO.getInstance());
        AvailableListView availableListView = new AvailableListView();
        availableListView.updateView(itemPool.getItemList());
        MainView mainView = new MainView(heroView, availableListView, new EquipmentListView());
        Scene mainScene = new Scene(mainView, DisplayConfig.WINDOW_WIDTH, DisplayConfig.WINDOW_HEIGHT, new Color(0.48,0.60,0.65,1));

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
