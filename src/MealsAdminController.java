import db.MealDataBase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Meals;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

public class MealsAdminController implements Initializable {

    public AnchorPane mealPackagesAdminContext;
    public TextField insertMealPrice;
    public ChoiceBox<String> mealChoiceBox;
    public ChoiceBox<String> mealTypeChoiceBox;
    public TableView<Meals> mealTableAdmin;
    public TableColumn<MealsTM, String> colMealType;
    public TableColumn<MealsTM, String> colMeal;
    public TableColumn<MealsTM, Double> colMealPrice;
    String[] typeChoice = new String[]{"Local Meals", "Chinese Meals", "French Meals"};
    String[] mealChoice = new String[]{"Breakfast", "Lunch", "Dinner"};


    public void initialize(URL location, ResourceBundle resources) {
        this.mealChoiceBox.getItems().addAll(this.mealChoice);
        this.mealTypeChoiceBox.getItems().addAll(this.typeChoice);
        this.colMealType.setCellValueFactory(new PropertyValueFactory("mealType"));
        this.colMeal.setCellValueFactory(new PropertyValueFactory("meal"));
        this.colMealPrice.setCellValueFactory(new PropertyValueFactory("mealPrice"));
        this.loadMeals();
    }

    private void loadMeals() {
        ObservableList<Meals> mObList = FXCollections.observableArrayList();

        for (Meals c : MealDataBase.mealsArrayList) {
            Meals tm = new Meals(c.getMealType(), c.getMeal(), c.getMealPrice());
            mObList.add(tm);
        }

        this.mealTableAdmin.setItems(mObList);
    }

    public void addMealOnAction() {
        Meals m1 = new Meals(mealTypeChoiceBox.getValue(),mealChoiceBox.getValue(), Double.parseDouble(this.insertMealPrice.getText()));
        MealDataBase.mealsArrayList.add(m1);
        this.loadMeals();
    }
    public void deleteMealOnAction(ActionEvent actionEvent) {
        int selectedID = this.mealTableAdmin.getSelectionModel().getSelectedIndex();
        this.mealTableAdmin.getItems().remove(selectedID);
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)this.mealPackagesAdminContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation system");
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("AdminHomePage.fxml"))));
        stage.centerOnScreen();
    }

    public void modifyMealOnAction(ActionEvent actionEvent) {
    }
}
