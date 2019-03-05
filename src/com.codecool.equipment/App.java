package com.codecool.equipment;
import com.codecool.equipment.View.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {



    @Override
    public void start(Stage primaryStage) {
        MainView mainView = new MainView();
        Scene mainScene = new Scene(mainView, 640,480);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
