package com.adressbook.adressbook;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class entryTableController {

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

    @FXML
    void metCancel(ActionEvent event) {

    }

    @FXML
    void metOk(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'entryTable.fxml'.";
        assert btnOk != null : "fx:id=\"btnOk\" was not injected: check your FXML file 'entryTable.fxml'.";
        assert textFieldNumber != null : "fx:id=\"tectFieldNumber\" was not injected: check your FXML file 'entryTable.fxml'.";
        assert textFieldPIB != null : "fx:id=\"textFieldPIB\" was not injected: check your FXML file 'entryTable.fxml'.";

    }

}
