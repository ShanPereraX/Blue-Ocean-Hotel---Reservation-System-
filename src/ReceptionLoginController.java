import db.AdminDataBase;
import db.ReceptionDataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Admin;
import model.Reception;

import java.io.IOException;

public class ReceptionLoginController {

    public TextField txtUserName;
    public Button btnLogin;
    public TextField txtPassword;
    public AnchorPane contest;

    public void btnLoginClickOnAction(ActionEvent actionEvent) throws IOException {
        if(isExists(txtUserName.getText())){
            if(checkPassWord(txtPassword.getText())){
                Stage stage = (Stage) contest.getScene().getWindow();
                stage.setScene(new Scene((FXMLLoader.load(getClass().getResource("ReceptionHomePage.fxml")))));
                stage.centerOnScreen();
            }else{
                new Alert(Alert.AlertType.ERROR,"Error: Wrong Password! try again").show();
                txtPassword.clear();
            }
        }else{
            new Alert(Alert.AlertType.ERROR,"Error: Invalid username or password. try again").show();
            txtPassword.clear();
            txtUserName.clear();
        }
    }
    private boolean checkPassWord(String text) {
        for (Reception ele: ReceptionDataBase.receptionArrayList) {
            if(text.equals(ele.getPassWord())){
                return true;
            }
        }
        return false;
    }

    private boolean isExists(String text) {
        for (Reception ele: ReceptionDataBase.receptionArrayList ) {
            if(text.equals(ele.getUserName())){
                return true;
            }
        }
        return false;
    }

    public void lblForgetPasswordClickOnAction(MouseEvent mouseEvent) {
        if(isExists(txtUserName.getText())){
            for (Admin ele: AdminDataBase.adminArrayList) {
                if(ele.getUserName().equals(txtUserName)){
                    new Alert(Alert.AlertType.INFORMATION, "Hint: "+ele.getPassWordHint()).show();
                    return;
                }
            }
        }
    }

    public void btnBacktoMenuClickOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) contest.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm.fxml"))));
        stage.centerOnScreen();
    }
}
