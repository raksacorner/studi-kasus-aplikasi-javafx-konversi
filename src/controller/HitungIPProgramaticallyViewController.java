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
public class HitungIPProgramaticallyViewController implements Initializable {
    NilaiKuliah nk = new NilaiKuliah();
    List<Integer> daftarSKS = new ArrayList();
    List<Float> daftarNilai = new ArrayList();

    @FXML
    private ChoiceBox cbOpsiJumlah;

    @FXML
    private Button btnOK;

    @FXML
    private TextField tfNIM;

    @FXML
    private TextField tfNama;

    @FXML
    private VBox vbHitung;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbOpsiJumlah.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        cbOpsiJumlah.setValue(1);

        for (int i = 0; i < 15; i++) {
            daftarSKS.add(i, 0);
            daftarNilai.add(i, 0f);
        }

        btnOK.setOnAction((ActionEvent event) -> {
            vbHitung.getChildren().add(setForm((int) cbOpsiJumlah.getValue()));
        });
    }

    private VBox setForm(int baris) {
        VBox isi = new VBox();

        vbHitung.getChildren().clear();

        HBox hbJudul = new HBox();
        hbJudul.setPrefHeight(50);

        Label lblJudulNo = new Label("No.");
        lblJudulNo.setPrefWidth(50);
        lblJudulNo.setPrefHeight(50);
        lblJudulNo.setAlignment(Pos.CENTER);

        Label lblJudulMataKuliah = new Label("Mata Kuliah");
        lblJudulMataKuliah.setPrefWidth(150);
        lblJudulMataKuliah.setPrefHeight(50);
        lblJudulMataKuliah.setAlignment(Pos.CENTER);

        Label lblJudulSKS = new Label("SKS");
        lblJudulSKS.setPrefWidth(50);
        lblJudulSKS.setPrefHeight(50);
        lblJudulSKS.setAlignment(Pos.CENTER);

        Label lblJudulNilai = new Label("Nilai");
        lblJudulNilai.setPrefWidth(50);
        lblJudulNilai.setPrefHeight(50);
        lblJudulNilai.setAlignment(Pos.CENTER);

        Label lblJudulGrade = new Label("Grade");
        lblJudulGrade.setPrefWidth(50);
        lblJudulGrade.setPrefHeight(50);
        lblJudulGrade.setAlignment(Pos.CENTER);

        hbJudul.getChildren().addAll(lblJudulNo, lblJudulMataKuliah, lblJudulSKS, lblJudulNilai, lblJudulGrade);
        hbJudul.setAlignment(Pos.CENTER);

        isi.getChildren().add(hbJudul);

        for (int i = 0; i < baris; i++) {
            HBox hbIsi = new HBox();
            hbIsi.setPrefHeight(50);

            Label lblNo = new Label((i + 1) + "");
            lblNo.setPrefWidth(50);
            lblNo.setPrefHeight(50);
            lblNo.setAlignment(Pos.CENTER);

            TextField tfMataKuliah = new TextField("-");
            tfMataKuliah.setPrefWidth(150);
            tfMataKuliah.setPadding(new Insets(0, 10, 0, 10));
            tfMataKuliah.setPrefHeight(27);
            tfMataKuliah.setAlignment(Pos.CENTER);

            TextField tfSKS = new TextField("0");
            tfSKS.setPrefWidth(50);
            tfSKS.setPadding(new Insets(0, 10, 0, 10));
            tfSKS.setPrefHeight(27);
            tfSKS.setAlignment(Pos.CENTER);

            TextField tfNilai = new TextField("0");
            tfNilai.setPrefWidth(50);
            tfNilai.setPrefHeight(27);
            tfNilai.setAlignment(Pos.CENTER);

            Label lblGrade = new Label("-");
            lblGrade.setPrefWidth(50);
            lblGrade.setPadding(new Insets(0, 10, 0, 10));
            lblGrade.setPrefHeight(Control.USE_COMPUTED_SIZE);
            lblGrade.setAlignment(Pos.CENTER);

            tfSKS.textProperty().addListener((observable, oldValue, newValue) -> {
                hitungNilaiPerBaris((Integer.parseInt(lblNo.getText()) - 1), newValue, tfNilai.getText());                
            });

            tfNilai.textProperty().addListener((observable, oldValue, newValue) -> {
                lblGrade.setText(nk.konversiNilai(Float.parseFloat(newValue), ""));
                hitungNilaiPerBaris((Integer.parseInt(lblNo.getText()) - 1), tfSKS.getText(), newValue);                
            });

            hbIsi.getChildren().addAll(lblNo, tfMataKuliah, tfSKS, tfNilai, lblGrade);
            hbIsi.setAlignment(Pos.CENTER);

            isi.getChildren().add(hbIsi);
        }

        HBox hbHitung = new HBox();
        hbHitung.setPrefHeight(50);

        Button btnHitung = new Button("Hitung IP");
        btnHitung.setPrefWidth(100);
        btnHitung.setPrefHeight(50);
        btnHitung.setAlignment(Pos.CENTER);
        btnHitung.setOnAction((event) -> {
            int totalSKS = 0;
            float totalNilai = 0;
            
            for (Integer intSKS : daftarSKS) {
                totalSKS += intSKS;
            }

            for (Float flNilai : daftarNilai) {
                totalNilai += flNilai;
            }

            float ipMahasiswa = totalNilai / totalSKS;
            //nk.cetakPesan("", "", totalNilai + " / " + totalSKS + " = " + ipMahasiswa);
            nk.cetakPesan("IP Mahasiswa", "NIM: "+tfNIM.getText() + "\nNama: " + tfNama.getText(), "IP: " + ipMahasiswa);
        });

        hbHitung.getChildren().add(btnHitung);
        hbHitung.setAlignment(Pos.CENTER);

        isi.getChildren().add(hbHitung);

        return isi;
    }

    private void hitungNilaiPerBaris(int indeks, String sks, String nilai) {
        float nilaiBaris = Integer.parseInt(sks) * nk.konversiGrade(nk.konversiNilai(Float.parseFloat(nilai), ""));
        daftarSKS.set(indeks, Integer.parseInt(sks));
        daftarNilai.set(indeks, nilaiBaris);
    }
}
