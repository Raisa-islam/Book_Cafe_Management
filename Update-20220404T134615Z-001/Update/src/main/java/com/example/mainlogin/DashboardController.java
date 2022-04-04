package com.example.mainlogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class DashboardController {


    @FXML
    private Button logoutButton;
    @FXML
    private Button btnFood;
    @FXML
    private Button btnAddMember;
    @FXML
    private Button btnAddBook;
    @FXML
    private Button btnBookList;
    @FXML
    private Button btnMemberList;
    @FXML
    private Button btnIssueBook;




    //click logout button of Dashboard to log out with alert
    Stage stage;

    public void logout(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("LogOut!");
        alert.setHeaderText("You are about to logout!");
        alert.setContentText("Do you want to save before logout?");

        if (alert.showAndWait().get() == ButtonType.OK) {

            stage = (Stage) logoutButton.getScene().getWindow();

            stage.close();
        }
    }



    //click Food button of Dashboard page to enter Food page
    public void handleBtn3() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Food.fxml"));
        Stage window = (Stage) btnFood.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1000, 700));

    }




    //click AddMember button of Dashboard page to enter AddMember page
    public void handleBtn4() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AddMember.fxml"));
        Stage window = (Stage) btnAddMember.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1000, 700));

    }





    //click AddBook button of Dashboard page to enter AddBook page
    public void handleBtn5() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AddBook.fxml"));
        Stage window = (Stage) btnAddBook.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1000, 700));

    }






    //click BookList button of Dashboard page to enter BookList page
    public void handleBtn6() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("BookList.fxml"));
        Stage window = (Stage) btnBookList.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1000, 700));

    }






    //click MemberList button of Dashboard page to enter MemberList page
    public void handleBtn7() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MemberList.fxml"));
        Stage window = (Stage) btnMemberList.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1000, 700));

    }


    //click IssueBook button of Dashboard page to enter IssueBook page
    public void handleBtn8() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("IssueBook.fxml"));
        Stage window = (Stage) btnIssueBook.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 1000, 700));

    }






}
