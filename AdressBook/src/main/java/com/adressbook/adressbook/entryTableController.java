package com.adressbook.adressbook;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class entryTableController {
    ColectionAdressBook colectionAdressBook;

    FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
    Parent root = loader.load();
    HelloController helloController = loader.getController();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnOk;

    @FXML
    private TextField textFieldNumber;

    @FXML
    private TextField textFieldPIB;

    public entryTableController() throws IOException {
    }
    public void setAdressBook(ColectionAdressBook adressBook) {
        this.colectionAdressBook = adressBook;
    }

    @FXML
    void metOk(ActionEvent event) {
        colectionAdressBook.add(new Person(textFieldPIB.getText(),textFieldNumber.getText()));
        //helloController.initTable();
        metCancel(event);
    }
    @FXML
    void metCancel(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.hide();
    }



    @FXML
    void initialize() {
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'entryTable.fxml'.";
        assert btnOk != null : "fx:id=\"btnOk\" was not injected: check your FXML file 'entryTable.fxml'.";
        assert textFieldNumber != null : "fx:id=\"tectFieldNumber\" was not injected: check your FXML file 'entryTable.fxml'.";
        assert textFieldPIB != null : "fx:id=\"textFieldPIB\" was not injected: check your FXML file 'entryTable.fxml'.";

    }

}
