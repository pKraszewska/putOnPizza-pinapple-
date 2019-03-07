package com.codecool.equipment;
import com.codecool.equipment.Controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {


    @Override
    public void start(Stage primaryStage) {
        MainController mainController = new MainController();
        Scene mainScene = new Scene(mainController.getMainView(), DisplayConfig.WINDOW_WIDTH, DisplayConfig.WINDOW_HEIGHT, new Color(0.48,0.60,0.65,1));
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
