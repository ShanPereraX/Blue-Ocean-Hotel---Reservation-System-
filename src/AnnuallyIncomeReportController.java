import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;

public class AnnuallyIncomeReportController implements Initializable {
    public AnchorPane AnnuallyIncomeContext;
    public BarChart annualIncomeChart;
    public NumberAxis y;
    public CategoryAxis x;
    public ChoiceBox<String> yearChoiceBox;
    String[] year = new String[]{"2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};

    public AnnuallyIncomeReportController() {
    }

    public void initialize(URL location, ResourceBundle resources) {
        this.yearChoiceBox.getItems().addAll(this.year);
    }

    public void enterOnAction(ActionEvent actionEvent) {
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("JAN", 275000));
        series.getData().add(new XYChart.Data("FEB", 375500));
        series.getData().add(new XYChart.Data("MAR", 205000));
        series.getData().add(new XYChart.Data("APR", 545000));
        series.getData().add(new XYChart.Data("MAY", 367500));
        series.getData().add(new XYChart.Data("JUN", 271000));
        series.getData().add(new XYChart.Data("JUL", 423000));
        series.getData().add(new XYChart.Data("AUG", 221500));
        series.getData().add(new XYChart.Data("SEP", 314000));
        series.getData().add(new XYChart.Data("OCT", 220500));
        series.getData().add(new XYChart.Data("NOV", 453000));
        series.getData().add(new XYChart.Data("DEC", 495000));
        this.annualIncomeChart.getData().addAll(new Object[]{series});
    }
}