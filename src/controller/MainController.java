package controller;

import app.FacultyLoginApp;
import app.StudentLoginApp;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button studentLoginBtn, facultyLoginBtn;

    @Override
    public void initialize(URL location, ResourceBundle resource) {
            studentLoginBtn.setOnAction(event -> openStudentLogin());
            facultyLoginBtn.setOnAction(event -> openFacultyLogin());
        }

        public void openStudentLogin () {
        new StudentLoginApp().start(new Stage());
        }
        private void openFacultyLogin () {
        new FacultyLoginApp().start(new Stage());
        }
}
