package com.adressbook.adressbook;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDel;

    @FXML
    private Button btnRed;

    @FXML
    private Button btnSearch;

    @FXML
    private TextField textField;
    @FXML
    private Button btnExit;

    @FXML
    private Button btnOtherLabs;

    @FXML
    void deleting(ActionEvent event) {
        new_Alert(event);
    }

    @FXML
    void openWindow(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("entryTable.fxml"));

        try {
            Stage stage = new Stage();
            Scene scene=new Scene(fxmlLoader.load(),400,100);
            stage.setScene(scene);

            stage.setTitle("Редагування");
            stage.setMinHeight(600);
            stage.setMinWidth(600);
            stage.setResizable(false);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(btnAdd.getScene().getWindow());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void redakt(ActionEvent event) {

    }

    @FXML
    void searching(ActionEvent event) {

    }
    @FXML
    void showingOtherLabs(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("showOtherLabs.fxml"));

        try {
            Stage stage = new Stage();
            Scene scene=new Scene(fxmlLoader.load(),600,600);
            stage.setScene(scene);

            stage.setTitle("інша Лаба");
            stage.setMinHeight(600);
            stage.setMinWidth(600);
            stage.setResizable(false);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(btnOtherLabs.getScene().getWindow());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void Exit(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnDel != null : "fx:id=\"btnDel\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnExit != null : "fx:id=\"btnExit\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnOtherLabs != null : "fx:id=\"btnOtherLabs\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnRed != null : "fx:id=\"btnRed\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnSearch != null : "fx:id=\"btnSearch\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert textField != null : "fx:id=\"textField\" was not injected: check your FXML file 'hello-view.fxml'.";

    }
    @FXML
    void new_Alert(ActionEvent event){
        Alert alert=new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Видалення");

        alert.setHeaderText("Results:");
        alert.setContentText("Видалення може призвести до заміни порядку осіб у адресній книзі! ");

        alert.showAndWait();
    }

//    @FXML
//    void information_Alert(ActionEvent event){
//
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("Видалення");
//
//        alert.setContentText("Ви впевнені, що хочете видаолити запис? ");
//
//        if (alert.showAndWait().get()==null){
//            this.label.set
//        }
//    }

}
