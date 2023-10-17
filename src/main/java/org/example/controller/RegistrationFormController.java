package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationFormController {
    private Parent parent;
    private Stage stage;
    private Scene scene;
    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/login.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }

    public void btnVerifyOnAction(ActionEvent actionEvent) {
    }

    public void btnSendOTPOnAction(ActionEvent actionEvent) {
    }

    public void btnRegisterOnAction(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/login.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }
}
