package kelas;


import javafx.scene.control.Alert;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rdh.tobing
 */
public abstract class Konversi {
    //abstract method yang harus diimplementasikan oleh semua sub classnya
    public abstract String konversiNilai(float nilai, String syarat);

    public void cetakPesan(String judul, String header, String pesan) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(judul);
        alert.setHeaderText(header);
        alert.setContentText(pesan);

        alert.showAndWait();
    }
}
