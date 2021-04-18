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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author rdh.tobing
 */
public class LoginViewController implements Initializable {

    private static final String DASHBOARD_VIEW_FXML = "/view/DashboardView.fxml";
    private Stage stage = new Stage();

    @FXML
    private TextField tfUsername;
    @FXML
    private PasswordField pfPassword;

    @FXML
    private Button btnReset;
    @FXML
    private Button btnLogin;

    public LoginViewController(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnReset.setOnAction((event) -> {
            tfUsername.setText("");
            pfPassword.setText("");
        });

        btnLogin.setOnAction((event) -> {
            boolean statusLogin = true;

            if (tfUsername.getText().equals("")) {
                statusLogin = false;
            }
            if (pfPassword.getText().equals("")) {
                statusLogin = false;
            }

            if (statusLogin == false) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Isian Tidak Lengkap");
                alert.setHeaderText("Isian Tidak Lengkap");
                alert.setContentText("Isi Username dan Password Anda.");

                alert.showAndWait();
            } else {
                if (!tfUsername.getText().equals("rdt")) {
                    statusLogin = false;
                }
                if (!pfPassword.getText().equals("tobing")) {
                    statusLogin = false;
                }
                if (statusLogin) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource(DASHBOARD_VIEW_FXML));
                    loader.setController(new DashboardViewController(stage));

                    Parent root;
                    try {
                        root = loader.load();

                        Scene scene = new Scene(root);

                        stage.setTitle("Dashboard");

                        stage.setScene(scene);
                        stage.show();

                    } catch (IOException ex) {
                        Logger.getLogger(LoginViewController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Otentikasi Gagal");
                    alert.setHeaderText("Data Login Salah");
                    alert.setContentText("Isi Username dan Password Anda Yang Benar.");

                    alert.showAndWait();
                }
            }
        });
    }
}
