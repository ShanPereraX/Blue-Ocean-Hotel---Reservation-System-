import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PaymentController {
    public AnchorPane paymentContext;

    public void addBookingOnAction(ActionEvent actionEvent) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("Bookings.fxml"));
        paymentContext.getChildren().clear();
        paymentContext.getChildren().add(node);
    }
}
