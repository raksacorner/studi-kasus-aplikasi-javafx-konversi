/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import kelas.NilaiKuliah;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author rdh.tobing
 */
public class KonversiNilaiViewController implements Initializable {

    @FXML
    private ChoiceBox cbOpsiJumlah;

    @FXML
    private Button btnOK;

    @FXML
    private HBox hbIsi1;
    @FXML
    private TextField tfNilai1;
    @FXML
    private Label lblNilaiKonversi1;

    @FXML
    private HBox hbIsi2;
    @FXML
    private TextField tfNilai2;
    @FXML
    private Label lblNilaiKonversi2;

    @FXML
    private HBox hbIsi3;
    @FXML
    private TextField tfNilai3;
    @FXML
    private Label lblNilaiKonversi3;

    @FXML
    private HBox hbIsi4;
    @FXML
    private TextField tfNilai4;
    @FXML
    private Label lblNilaiKonversi4;

    @FXML
    private HBox hbIsi5;
    @FXML
    private TextField tfNilai5;
    @FXML
    private Label lblNilaiKonversi5;

    @FXML
    private HBox hbIsi6;
    @FXML
    private TextField tfNilai6;
    @FXML
    private Label lblNilaiKonversi6;

    @FXML
    private HBox hbIsi7;
    @FXML
    private TextField tfNilai7;
    @FXML
    private Label lblNilaiKonversi7;

    @FXML
    private HBox hbIsi8;
    @FXML
    private TextField tfNilai8;
    @FXML
    private Label lblNilaiKonversi8;

    @FXML
    private HBox hbIsi9;
    @FXML
    private TextField tfNilai9;
    @FXML
    private Label lblNilaiKonversi9;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        NilaiKuliah nk = new NilaiKuliah();

        cbOpsiJumlah.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9);
        cbOpsiJumlah.setValue(1);
        setForm(1);

        btnOK.setOnAction((ActionEvent event) -> {
            setForm((int) cbOpsiJumlah.getValue());
        });

        tfNilai1.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi1.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai2.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi2.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai3.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi3.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai4.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi4.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai5.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi5.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai6.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi6.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai7.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi7.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai8.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi8.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai9.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi9.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });        
    }

    private void setForm(int baris) {
        boolean blVisHB1 = (baris >= 1);
        hbIsi1.setVisible(blVisHB1);

        boolean blVisHB2 = (baris >= 2);
        hbIsi2.setVisible(blVisHB2);

        boolean blVisHB3 = (baris >= 3);
        hbIsi3.setVisible(blVisHB3);

        boolean blVisHB4 = (baris >= 4);
        hbIsi4.setVisible(blVisHB4);

        boolean blVisHB5 = (baris >= 5);
        hbIsi5.setVisible(blVisHB5);

        boolean blVisHB6 = (baris >= 6);
        hbIsi6.setVisible(blVisHB6);

        boolean blVisHB7 = (baris >= 7);
        hbIsi7.setVisible(blVisHB7);

        boolean blVisHB8 = (baris >= 8);
        hbIsi8.setVisible(blVisHB8);

        boolean blVisHB9 = (baris >= 9);
        hbIsi9.setVisible(blVisHB9);
    }
}
