package org.example.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomepageController implements Initializable {
    public PieChart pieChartHomepage;
    private Parent parent;
    private Stage stage;
    private Scene scene;
    public void logOutOnAction(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/login.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<PieChart.Data> pieObservableList= FXCollections.observableArrayList(
                new PieChart.Data("Gents",10),
                new PieChart.Data("Ladies",40),
                new PieChart.Data("Kids",30),
                new PieChart.Data("Others",20)
        );
        pieChartHomepage.setData(pieObservableList);
    }
}
