package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FacultyTerminalApp extends Application {

        public void start (Stage primaryStage) {
            try {
                Parent root4 = FXMLLoader.load(getClass().getResource("/view/mk1/FacultyTerminal.fxml"));
                Scene scene4 = new Scene(root4);
                // deploy the scene.

                primaryStage.setScene(scene4);
                primaryStage.setTitle("Faculty Terminal");
                primaryStage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
