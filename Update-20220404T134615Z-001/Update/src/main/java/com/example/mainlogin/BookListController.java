package com.example.mainlogin;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BookListController {


    @FXML
    private Button btnReturn4;



    //click << button of BookList page to enter Dashboard page
    public void handleBtn13() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Dashboard.fxml"));
        Stage window = (Stage) btnReturn4.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1000, 700));

    }

}
