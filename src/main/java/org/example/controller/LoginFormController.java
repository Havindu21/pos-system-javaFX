package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    private Parent parent;
    private Stage stage;
    private Scene scene;
    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/homepage.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }

    public void signBtnOnAction(MouseEvent mouseEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/registration.fxml"));
        stage= (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }

    public void forgotPWOnAction(MouseEvent mouseEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/forgotPW.fxml"));
        stage= (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }
}
