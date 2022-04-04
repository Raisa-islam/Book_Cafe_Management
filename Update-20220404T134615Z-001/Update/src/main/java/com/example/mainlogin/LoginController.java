package com.example.mainlogin;
import com.example.mainlogin.database.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


import java.io.IOException;


public class LoginController {
    public Label invalid;
    public TextField usernameTextField;
    public PasswordField passwordPasswordField;
    @FXML
    private Button btnLogin;
    @FXML
    private Button btnClose;



    //click login button of login page to enter Dashboard
    public void handleBtn1(){

        if(usernameTextField.getText().isBlank() == false && passwordPasswordField.getText().isBlank() == false){
            //loginMessageLabel.setText("You try to login!");
            validateLogin();
        }
        else {
            invalid.setText("Please enter username and password.");
        }

    }


    //click close button to close the window with alert
    Stage stage1;

    public void close(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit!");
        alert.setHeaderText("You are about to exit the window!");
        alert.setContentText("Are you sure?");

        if (alert.showAndWait().get() == ButtonType.OK) {

            stage1 = (Stage) btnClose.getScene().getWindow();

            stage1.close();
        }
    }
    void logIn()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Dashboard.fxml"));
        Stage window = (Stage) btnLogin.getScene().getWindow();
        try {
            window.setScene(new Scene(fxmlLoader.load(), 1000, 700));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void validateLogin(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();
        String verifyLogin = "select count(1) from employee where Name = '" + usernameTextField.getText() +"' and Password = '" + passwordPasswordField.getText() +"'";
        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);
            while (queryResult.next()){
                if(queryResult.getInt(1) == 1){
                   logIn();
                }
                else {
                    invalid.setText("Invalid username and password!");
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }




}