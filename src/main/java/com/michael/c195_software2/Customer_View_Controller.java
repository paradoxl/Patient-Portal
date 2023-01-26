package com.michael.c195_software2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class Customer_View_Controller {
    Alert exitAlert = new Alert(Alert.AlertType.CONFIRMATION,"Are you sure you want to exit?", ButtonType.YES, ButtonType.NO);


    public void addRecord(ActionEvent actionEvent) {
    }

    public void updateRecord(ActionEvent actionEvent) {
    }

    public void deleteRecord(ActionEvent actionEvent) {
    }

    public void cancel(ActionEvent actionEvent) throws IOException {
        exitAlert.showAndWait();
        if(exitAlert.getResult() == ButtonType.YES) {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("log-in-view.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Log In");
            stage.setScene(scene);
            stage.show();
        }
        else{
            System.out.println("You keep pressing exit and dont mean it.... Do we need to make changes?");
        }
    }
}