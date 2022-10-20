import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReceptionAddMealController implements Initializable {
    public AnchorPane context;
    public TextField breakfastPrice;
    public TextField lunchPrice;
    public TextField dinnerPrice;
    public ChoiceBox mealPlansChoiceBox;

    String[] mealPlanChoice = new String[]{"Local Meals", "chinese Meals", "French Meals"};

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("CustomerDetails.fxml"));
        context.getChildren().clear();
        context.getChildren().add(node);
    }

    public void nextOnAction(ActionEvent actionEvent) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("PayDetails.fxml"));
        context.getChildren().clear();
        context.getChildren().add(node);
    }

    public void oknOAction(ActionEvent actionEvent) {
        this.breakfastPrice.setText("200");
        this.lunchPrice.setText("250");
        this.dinnerPrice.setText("300");
    }
    public void initialize(URL location, ResourceBundle resources) {
        mealPlansChoiceBox.getItems().addAll(this.mealPlanChoice);
    }
}
