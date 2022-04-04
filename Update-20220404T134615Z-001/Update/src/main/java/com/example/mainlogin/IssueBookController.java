package com.example.mainlogin;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class IssueBookController {

    @FXML
    private Button btnReturn6;

    //click << button of IssueBook page to enter Dashboard page
    public void handleBtn4() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Dashboard.fxml"));
        Stage window = (Stage) btnReturn6.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1000, 700));

    }


}
