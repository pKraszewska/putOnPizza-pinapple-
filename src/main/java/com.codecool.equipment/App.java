package com.codecool.equipment;
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
        MainView mainView = new MainView(new HeroView(), new AvailableListView(), new EquipmentListView());
        Scene mainScene = new Scene(mainView, DisplayConfig.WINDOW_WIDTH, DisplayConfig.WINDOW_HEIGHT, new Color(0.48,0.60,0.65,1));

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}