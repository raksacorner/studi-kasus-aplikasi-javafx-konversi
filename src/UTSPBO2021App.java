
import controller.LoginViewController;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rdh.tobing
 */
public class UTSPBO2021App extends Application{
    private static final String LOGIN_VIEW_FXML = "/view/LoginView.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(LOGIN_VIEW_FXML));
        loader.setController(new LoginViewController(primaryStage));

        Parent root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setTitle("UTS PBO 2021 App");
        primaryStage.setResizable(false);
        //primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
