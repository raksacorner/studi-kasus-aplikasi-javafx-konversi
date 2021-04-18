/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import kelas.MataUang;

/**
 *
 * @author rdh.tobing
 */
public class KonversiMataUangViewController implements Initializable {
    public static final String GRAFIK_MATA_UANG_VIEW_FXML = "/view/GrafikMataUangView.fxml";

    ScrollPane spIsi = new ScrollPane();
    private MataUang mu = new MataUang();

    @FXML
    private TextField txtJumlahUSD;
    @FXML
    private Label lblIDRDariUSD;
    @FXML
    private Button btnUSDIDR;

    @FXML
    private TextField txtJumlahKRW;
    @FXML
    private Label lblIDRDariKRW;
    @FXML
    private Button btnKRWIDR;

    KonversiMataUangViewController(ScrollPane spIsi) {
        this.spIsi = spIsi;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtJumlahUSD.textProperty().addListener((observable, oldValue, newValue) -> {
            lblIDRDariUSD.setText(mu.konversiNilai(Float.parseFloat(newValue), "USD/IDR"));
        });

        txtJumlahKRW.textProperty().addListener((observable, oldValue, newValue) -> {
            lblIDRDariKRW.setText(mu.konversiNilai(Float.parseFloat(newValue), "KRW/IDR"));
        });

        btnUSDIDR.setOnAction((event) -> {
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource(GRAFIK_MATA_UANG_VIEW_FXML));
                loader.setController(new GrafikMataUangViewController("USD/IDR"));
            
                spIsi.setContent(loader.load());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });
        
        btnKRWIDR.setOnAction((event) -> {
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource(GRAFIK_MATA_UANG_VIEW_FXML));
                loader.setController(new GrafikMataUangViewController("KRW/IDR"));
            
                spIsi.setContent(loader.load());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });        
    }
}
