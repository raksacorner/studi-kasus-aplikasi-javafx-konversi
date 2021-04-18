/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author rdh.tobing
 */
public class DashboardViewController implements Initializable {
    private Stage stage = new Stage();

    public static final String DASHBOARD_VIEW_FXML = "/view/DashboardView.fxml";
    public static final String LOGIN_VIEW_FXML = "/view/LoginView.fxml";

    public static final String KONVERSI_NILAI_VIEW_FXML = "/view/KonversiNilaiView.fxml";
    public static final String HITUNG_IP_VIEW_FXML = "/view/HitungIPView.fxml";
    public static final String HITUNG_IP_PROGRAMATICALLY_VIEW_FXML = "/view/HitungIPProgramaticallyView.fxml";
    public static final String KONVERSI_MATA_UANG_VIEW_FXML = "/view/KonversiMataUangView.fxml";
    public static final String BIODATA_VIEW_FXML = "/view/BiodataView.fxml";

    @FXML
    private ScrollPane spIsi;

    @FXML
    private MenuItem mnuAbout;
    @FXML
    private MenuItem mnuLogout;

    @FXML
    private MenuItem mnuKonversiNilai;
    @FXML
    private MenuItem mnuHitungIP;
    @FXML
    private MenuItem mnuHitungIPProgramatically;
    @FXML
    private MenuItem mnuKonversiMataUang;

    @FXML
    private Label mnuBiodata;

    public DashboardViewController(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mnuAbout.setOnAction((ActionEvent event) -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Tentang Aplikasi Konversi");
            alert.setHeaderText("Informasi Singkat");
            alert.setContentText("Aplikasi ini dikembangkan oleh Roy Deddy Tobing untuk keperluan UTS Praktikum semester Genap 2020/2021 mata kuliah PBO prodi D4 TRPL Institut Teknologi Del ");

            alert.showAndWait();
        });

        mnuLogout.setOnAction((ActionEvent event) -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(LOGIN_VIEW_FXML));
            loader.setController(new LoginViewController(stage));

            Parent root;
            try {
                root = loader.load();

                Scene scene = new Scene(root);

                stage.setTitle("Login");

                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(DashboardViewController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

        mnuKonversiNilai.setOnAction((ActionEvent event) -> {
            loadLayar(KONVERSI_NILAI_VIEW_FXML);
        });

        mnuHitungIP.setOnAction((ActionEvent event) -> {
            loadLayar(HITUNG_IP_VIEW_FXML);
        });
        
        mnuHitungIPProgramatically.setOnAction((ActionEvent event) -> {
            loadLayar(HITUNG_IP_PROGRAMATICALLY_VIEW_FXML);
        });

        mnuKonversiMataUang.setOnAction((ActionEvent event) -> {
            loadLayar(KONVERSI_MATA_UANG_VIEW_FXML);
        });

        mnuBiodata.setOnMouseClicked((MouseEvent event) -> {
            loadLayar(BIODATA_VIEW_FXML);
        });
    }

    private void loadLayar(String opsi) {
        FXMLLoader loader = null;
        switch (opsi) {
            case KONVERSI_NILAI_VIEW_FXML: {
                loader = new FXMLLoader(getClass().getResource(KONVERSI_NILAI_VIEW_FXML));
                loader.setController(new KonversiNilaiViewController());

                break;
            }
            case HITUNG_IP_VIEW_FXML: {
                loader = new FXMLLoader(getClass().getResource(HITUNG_IP_VIEW_FXML));
                loader.setController(new HitungIPViewController());

                break;
            }
            case HITUNG_IP_PROGRAMATICALLY_VIEW_FXML: {
                loader = new FXMLLoader(getClass().getResource(HITUNG_IP_VIEW_FXML));
                loader.setController(new HitungIPViewController());

                break;
            }
            case KONVERSI_MATA_UANG_VIEW_FXML: {
                loader = new FXMLLoader(getClass().getResource(KONVERSI_MATA_UANG_VIEW_FXML));
                loader.setController(new KonversiMataUangViewController(spIsi));

                break;
            }
            case BIODATA_VIEW_FXML: {
                loader = new FXMLLoader(getClass().getResource(BIODATA_VIEW_FXML));
                loader.setController(new BiodataViewController());

                break;
            }
        }

        try {
            spIsi.setContent(loader.load());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
