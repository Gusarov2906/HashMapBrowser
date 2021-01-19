package MainPackage;

import MainPackage.ViewModel.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

/**
 * Main class
 */

public class Main extends Application {
    public static Scene scene;
    public KeyCombination ctrlS = KeyCodeCombination.keyCombination("Ctrl+S");
    public KeyCombination ctrlO = KeyCodeCombination.keyCombination("Ctrl+O");
    /**
     * Method to start application
     * @param primaryStage- main stage of program
     * @throws Exception - exception with start main window
     */
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("View/MainWindow.fxml"));
        primaryStage.setTitle("HashMapBrowser");
        scene = new Scene(root, 1200, 770);
        scene.setOnKeyPressed(event->{if (ctrlS.match(event)||ctrlO.match(event)) {

               if (ctrlS.match(event)) {
                   if(Controller.hashMapStruct != null)
                   {
                   Controller.saveData();
                   }

               }
            if (ctrlO.match(event)) {

                Controller.openData();
            }
        }
        });
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    /**
     * Main method of program, where it starts
     * @param args - arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
