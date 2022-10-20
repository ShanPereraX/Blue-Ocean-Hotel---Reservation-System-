import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PayDetailsController {
    public AnchorPane payDetailsContext;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("ReceptionAddMeal.fxml"));
        payDetailsContext.getChildren().clear();
        payDetailsContext.getChildren().add(node);

    }

    public void payOnAction(ActionEvent actionEvent) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("Payment.fxml"));
        payDetailsContext.getChildren().clear();
        payDetailsContext.getChildren().add(node);
    }
}
