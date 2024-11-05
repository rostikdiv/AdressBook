package com.adressbook.adressbook;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.ResourceBundle;

import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelloController {

    private ColectionAdressBook adressBookImpl =new ColectionAdressBook();
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
    private Label totalAmount;

    @FXML
    private TableColumn<Person, String > tableColumnPIP;

    @FXML
    private TableColumn<Person, String> tableColumnPhone;
    @FXML
    private TableView<Person> tableAdressBook;

    @FXML
    void deleting(ActionEvent event) {
        new_Alert(event);
    }


    @FXML
    void openWindow(ActionEvent event) throws IOException, URISyntaxException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("entryTable.fxml"));



        try {
            Stage stage = new Stage();
            Scene scene=new Scene(fxmlLoader.load(),400,100);
            stage.setScene(scene);

            stage.setTitle("вікно редагування");
            stage.setMinHeight(400);
            stage.setMinWidth(100);
            stage.setResizable(false);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(btnOtherLabs.getScene().getWindow());
            stage.show();

            entryTableController controller = fxmlLoader.getController();
            controller.setAdressBook(adressBookImpl);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void addData(ActionEvent event) throws IOException, URISyntaxException {
        openWindow(event);
    }

    @FXML
    void redakt(ActionEvent event) throws IOException, URISyntaxException {
        openWindow(event);
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

        initTable();

    }

    public void initTable(){
        tableColumnPIP.setCellValueFactory(new PropertyValueFactory<>("pip"));
        tableColumnPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        adressBookImpl.getPersonList().addListener(new ListChangeListener<Person>() {
            @Override
            public void onChanged(Change<? extends Person> change) {
                updateCountLabel();
            }
        });
        tableAdressBook.setItems(adressBookImpl.getPersonList());
    }
    private void updateCountLabel(){
        totalAmount.setText("кількість записів: "+ adressBookImpl.getPersonList().size());
    }
    @FXML
    void new_Alert(ActionEvent event){
        Alert alert=new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Видалення");

        alert.setHeaderText("Results:");
        alert.setContentText("Видалення може призвести до заміни порядку осіб у адресній книзі! ");

        alert.showAndWait();
    }

}
