package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentLoginApp extends Application {

    public void start (Stage primaryStage) {
        try {
            Parent root1 = FXMLLoader.load(getClass().getResource("/view/mk1/StudentLogin.fxml"));
            Scene scene1 = new Scene(root1);
            // deploy the scene.

            primaryStage.setScene(scene1);
            primaryStage.setTitle("Student Login");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
