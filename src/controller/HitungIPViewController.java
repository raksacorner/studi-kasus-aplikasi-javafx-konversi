/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import kelas.NilaiKuliah;

/**
 *
 * @author rdh.tobing
 */
public class HitungIPViewController implements Initializable {

    private int baris = 1;
    NilaiKuliah nk = new NilaiKuliah();

    @FXML
    private ChoiceBox cbOpsiJumlah;

    @FXML
    private Button btnOK;

    @FXML
    private TextField tfNIM;

    @FXML
    private TextField tfNama;

    @FXML
    private HBox hbIsi1, hbIsi2, hbIsi3, hbIsi4,
            hbIsi5, hbIsi6, hbIsi7, hbIsi8, hbIsi9,
            hbIsi10, hbIsi11, hbIsi12, hbIsi13, hbIsi14, hbIsi15;
    @FXML
    private TextField tfMataKuliah1, tfMataKuliah2, tfMataKuliah3, tfMataKuliah4, tfMataKuliah5, tfMataKuliah6, tfMataKuliah7, tfMataKuliah8, tfMataKuliah9, tfMataKuliah10, tfMataKuliah11, tfMataKuliah12, tfMataKuliah13, tfMataKuliah14, tfMataKuliah15;
    @FXML
    private TextField tfSKS1, tfSKS2, tfSKS3, tfSKS4, tfSKS5, tfSKS6, tfSKS7, tfSKS8, tfSKS9, tfSKS10, tfSKS11, tfSKS12, tfSKS13, tfSKS14, tfSKS15;
    @FXML
    private TextField tfNilai1, tfNilai2, tfNilai3, tfNilai4, tfNilai5, tfNilai6, tfNilai7, tfNilai8, tfNilai9, tfNilai10, tfNilai11, tfNilai12, tfNilai13, tfNilai14, tfNilai15;
    @FXML
    private Label lblNilaiKonversi1, lblNilaiKonversi2, lblNilaiKonversi3, lblNilaiKonversi4, lblNilaiKonversi5, lblNilaiKonversi6, lblNilaiKonversi7, lblNilaiKonversi8, lblNilaiKonversi9, lblNilaiKonversi10, lblNilaiKonversi11, lblNilaiKonversi12, lblNilaiKonversi13, lblNilaiKonversi14, lblNilaiKonversi15;

    @FXML
    private Button btnHitung;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbOpsiJumlah.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        cbOpsiJumlah.setValue(1);
        setForm();

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
        tfNilai10.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi10.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai11.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi11.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai12.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi12.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai13.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi13.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai14.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi14.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });
        tfNilai15.textProperty().addListener((observable, oldValue, newValue) -> {
            lblNilaiKonversi15.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
        });

        btnOK.setOnAction((ActionEvent event) -> {
            baris = (int) cbOpsiJumlah.getValue();
            setForm();
        });

        btnHitung.setOnAction((ActionEvent event) -> {
            hitungIP();
        });
    }

    private void hitungIP() {
        float nilaiMK = 0f;
        int totalSKS = 0;

        if (baris >= 1) {
            int sks1 = Integer.parseInt(tfSKS1.getText());
            nilaiMK += sks1 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai1.getText()), ""));
            totalSKS += sks1;
        }
        if (baris >= 2) {
            int sks2 = Integer.parseInt(tfSKS2.getText());
            nilaiMK += sks2 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai2.getText()), ""));
            totalSKS += sks2;
        }
        if (baris >= 3) {
            int sks3 = Integer.parseInt(tfSKS3.getText());
            nilaiMK += sks3 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai3.getText()), ""));
            totalSKS += sks3;
        }

        if (baris >= 4) {
            int sks4 = Integer.parseInt(tfSKS4.getText());
            nilaiMK += sks4 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai4.getText()), ""));
            totalSKS += sks4;
        }

        if (baris >= 5) {
            int sks5 = Integer.parseInt(tfSKS5.getText());
            nilaiMK += sks5 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai5.getText()), ""));
            totalSKS += sks5;
        }

        if (baris >= 6) {
            int sks6 = Integer.parseInt(tfSKS6.getText());
            nilaiMK += sks6 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai6.getText()), ""));
            totalSKS += sks6;
        }

        if (baris >= 7) {
            int sks7 = Integer.parseInt(tfSKS7.getText());
            nilaiMK += sks7 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai7.getText()), ""));
            totalSKS += sks7;
        }

        if (baris >= 8) {
            int sks8 = Integer.parseInt(tfSKS8.getText());
            nilaiMK += sks8 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai8.getText()), ""));
            totalSKS += sks8;
        }

        if (baris >= 9) {
            int sks9 = Integer.parseInt(tfSKS9.getText());
            nilaiMK += sks9 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai9.getText()), ""));
            totalSKS += sks9;
        }

        if (baris >= 10) {
            int sks10 = Integer.parseInt(tfSKS10.getText());
            nilaiMK += sks10 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai10.getText()), ""));
            totalSKS += sks10;
        }

        if (baris >= 11) {
            int sks11 = Integer.parseInt(tfSKS11.getText());
            nilaiMK += sks11 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai11.getText()), ""));
            totalSKS += sks11;
        }

        if (baris >= 12) {
            int sks12 = Integer.parseInt(tfSKS12.getText());
            nilaiMK += sks12 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai12.getText()), ""));
            totalSKS += sks12;
        }

        if (baris >= 13) {
            int sks13 = Integer.parseInt(tfSKS13.getText());
            nilaiMK += sks13 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai13.getText()), ""));
            totalSKS += sks13;
        }

        if (baris >= 14) {
            int sks14 = Integer.parseInt(tfSKS14.getText());
            nilaiMK += sks14 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai14.getText()), ""));
            totalSKS += sks14;
        }

        if (baris >= 15) {
            int sks15 = Integer.parseInt(tfSKS15.getText());
            nilaiMK += sks15 * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(tfNilai15.getText()), ""));
            totalSKS += sks15;
        }

        float ipMahasiswa = nilaiMK / totalSKS;
        nk.cetakPesan("IP Mahasiswa", "NIM: " + tfNIM.getText() + "\nNama: " + tfNama.getText(), "IP: " + ipMahasiswa);
    }

    private void setForm() {
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

        boolean blVisHB10 = (baris >= 10);
        hbIsi10.setVisible(blVisHB10);

        boolean blVisHB11 = (baris >= 11);
        hbIsi11.setVisible(blVisHB11);

        boolean blVisHB12 = (baris >= 12);
        hbIsi12.setVisible(blVisHB12);

        boolean blVisHB13 = (baris >= 13);
        hbIsi13.setVisible(blVisHB13);

        boolean blVisHB14 = (baris >= 14);
        hbIsi14.setVisible(blVisHB14);

        boolean blVisHB15 = (baris >= 15);
        hbIsi15.setVisible(blVisHB15);
    }
}
