package com.example.mainlogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddBookController {

    public TextField book_author;
    public TextField book_name;
    public TextField book_genre;
    public TextField book_price;
    public TextField available_buying;
    public TextField available_reading;
    @FXML
    private Button btnReturn3;

    //click << button of AddBook page to enter Dashboard page
    public void handleBtn12() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Dashboard.fxml"));
        Stage window = (Stage) btnReturn3.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1000, 700));

    }

    public void save(ActionEvent event) {
    }

    public void cancel(ActionEvent event) {
    }
}
