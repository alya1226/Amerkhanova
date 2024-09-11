package com.example.kalkulator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class info {

    @FXML
    private Button nazad;

    @FXML
    void onNazad(ActionEvent event) throws IOException {
        Stage stage = (Stage) nazad.getScene().getWindow();
        stage.close();

    }

}