package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    public void start (Stage primaryStage) {
    try {
        Parent root = FXMLLoader.load(getClass().getResource("/view/mk1/MainPage.fxml"));
        Scene scene = new Scene(root);
        // deploy the scene.

        primaryStage.setScene(scene);
        primaryStage.setTitle("MainApp Application");
        primaryStage.show();
    } catch (Exception e) {
e.printStackTrace();
    }
    }

}
