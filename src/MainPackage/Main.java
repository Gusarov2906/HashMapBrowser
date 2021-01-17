package MainPackage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("HashMapBrowser");
        primaryStage.setScene(new Scene(root, 1200, 770));
        primaryStage.setResizable(false);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
