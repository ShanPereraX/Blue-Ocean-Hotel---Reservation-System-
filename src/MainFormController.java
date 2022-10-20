import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public RadioButton rBtnAdmin;
    public RadioButton rBtnRecep;
    public ToggleGroup one;
    public Button btnStart;
    public AnchorPane contest;

    public void btnStartClickOnAction(ActionEvent actionEvent) throws IOException {
        if (rBtnAdmin.isSelected()){
           //admin
           Stage stage = (Stage) contest.getScene().getWindow();

           stage.setScene(new Scene((FXMLLoader.load(getClass().getResource("AdminLogIn.fxml")))));
           stage.centerOnScreen();



        }else if (rBtnRecep.isSelected()){

            //Reception
            Stage stage = (Stage) contest.getScene().getWindow();
            stage.setScene(new Scene((FXMLLoader.load(getClass().getResource("ReceptionLogin.fxml")))));
            stage.centerOnScreen();

        }else{
           new Alert(Alert.AlertType.INFORMATION,"Select User Type").show();
        }
    }
}
