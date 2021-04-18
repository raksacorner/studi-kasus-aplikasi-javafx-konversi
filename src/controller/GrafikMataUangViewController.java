/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 *
 * @author rdh.tobing
 */
public class GrafikMataUangViewController implements Initializable {

    String mataUang;

    @FXML
    private LineChart<String, Float> lcMataUang;
    @FXML
    private CategoryAxis xAxis = new CategoryAxis();
    @FXML
    final NumberAxis yAxis = new NumberAxis();

    @FXML
    private TextField tfNilai1;
    @FXML
    private DatePicker dpTanggal1;

    @FXML
    private TextField tfNilai2;
    @FXML
    private DatePicker dpTanggal2;

    @FXML
    private TextField tfNilai3;
    @FXML
    private DatePicker dpTanggal3;

    @FXML
    private TextField tfNilai4;
    @FXML
    private DatePicker dpTanggal4;

    @FXML
    private TextField tfNilai5;
    @FXML
    private DatePicker dpTanggal5;

    @FXML
    private Button btnGenerate;

    GrafikMataUangViewController(String mataUang) {
        this.mataUang = mataUang;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnGenerate.setOnAction((event) -> {
            try {
                lcMataUang.setAnimated(false);
                
                XYChart.Series dataChart = new XYChart.Series();
                dataChart.setName("Kurs Mata Uang " + mataUang);

                String strTanggal1 = dpTanggal1.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                String strTanggal2 = dpTanggal2.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                String strTanggal3 = dpTanggal3.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                String strTanggal4 = dpTanggal4.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                String strTanggal5 = dpTanggal5.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

                dataChart.getData().add(new XYChart.Data(strTanggal1, Float.parseFloat(tfNilai1.getText())));
                dataChart.getData().add(new XYChart.Data(strTanggal2, Float.parseFloat(tfNilai2.getText())));
                dataChart.getData().add(new XYChart.Data(strTanggal3, Float.parseFloat(tfNilai3.getText())));
                dataChart.getData().add(new XYChart.Data(strTanggal4, Float.parseFloat(tfNilai4.getText())));
                dataChart.getData().add(new XYChart.Data(strTanggal5, Float.parseFloat(tfNilai5.getText())));

                lcMataUang.getData().add(dataChart);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });
    }
}
