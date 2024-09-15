package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class FacultyLogin implements Initializable {

    @FXML
    private TextField userNameTxt, passWordTxt;

    @FXML
    private Button switchLoginBtn, submitBtn, pasRecoBtn;
    @Override
    public void initialize (URL location, ResourceBundle resources) {

    }
    /* resetForm();


    private void resetForm () {
        userNameTxt.clear();
        passWordTxt.clear();
        try {
        } catch (Exception e) {
            Alert alert = new Alert (Alert.AlertType.ERROR, "Couldn't Sign In \n" + e.getMessage());
        }

    }
*/

}

