package com.example.mainlogin;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FoodController {

    @FXML
    private Button btnReturn1;


    //click << button of Food page to enter Dashboard page
    public void handleBtn10() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Dashboard.fxml"));
        Stage window = (Stage) btnReturn1.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1000, 700));

    }
}
