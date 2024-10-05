package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FacultyLoginApp extends Application {

    public void start (Stage primaryStage) {
        try {
            Parent root2 = FXMLLoader.load(getClass().getResource("/view/mk1/FacultyLogin.fxml"));
            Scene scene2 = new Scene(root2);
            // deploy the scene.

            primaryStage.setScene(scene2);
            primaryStage.setTitle("Faculty Login");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
