package controller;

import app.FacultyLoginApp;
import controller.exception.UserNotFoundException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.bl.FacultyBl;
import model.entity.Faculty;
import view.dto.FormState;

import java.net.URL;
import java.util.ResourceBundle;

public class FacultyLoginController implements Initializable {

    @FXML
    private TextField profileIdentifierTxt;

    @FXML
    private PasswordField passwordTxt;

    @FXML
    private Button studentLoginBtn, signInBtn, passRecoveryBtn;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        signInBtn.setOnAction(e -> {
            try {
                Faculty faculty = FacultyBl.findByIdentifierAndPassword(profileIdentifierTxt.getText(), passwordTxt.getText());
                FormState.currentPerson = faculty;
//                openFacultyTerminalApp();

                Stage stage2 = new Stage();
                Scene scene2 = new Scene (FXMLLoader.load(getClass().getResource("/view/mk1/FacultyTerminal.fxml")));

                stage2.setScene(scene2);
                stage2.setTitle("Faculty Terminal");
                stage2.show();

                signInBtn.getScene().getWindow().hide();

            } catch (Exception ex) {
                ex.printStackTrace();
                Alert alert = new Alert(Alert.AlertType.ERROR, ex.getMessage());
                alert.show();
            }
        });


    }

//    public void openFacultyTerminalApp () {new FacultyLoginApp().start(new Stage());
//    }
}

