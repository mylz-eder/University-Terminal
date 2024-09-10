package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class FcltyLoginController implements Initializable {

    @FXML
    private TextField userNameTxt, passWordTxt;

    @FXML
    private Button switchLoginBtn, submitBtn, pasRecoBtn;
    @Override
    public void initialize (URL location, ResourceBundle resources) {

    }
    resetForm();

    private void resetForm () {
        userNameTxt.clear();
        passWordTxt.clear();
        try () {
            resetForm();
        } catch (Exception e) {
            Alert alert = new Alert (Alert.AlertType.ERROR, "Couldn't Sign In \n" + e.getMessage());
        }

    }


}

