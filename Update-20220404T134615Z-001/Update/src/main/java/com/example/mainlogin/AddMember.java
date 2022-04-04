package com.example.mainlogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddMember {

    public Button btnReturn3;
    public TextField member_name;
    public TextField phn_no;
    public TextField address;
    public Label saved;
    public Button save_button;
    public Button cancel_button;
    @FXML
    private Button btnReturn2;


    //click << button of AddMember page to enter Dashboard page
    public void handleBtn11() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Dashboard.fxml"));
        Stage window = (Stage) btnReturn2.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1000, 700));

    }

    public void save(ActionEvent event) {
    }

    public void cancel(ActionEvent event) {
    }
}
