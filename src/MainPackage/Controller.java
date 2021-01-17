package MainPackage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller {

    public static HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>> hashMap;

    @FXML
    private AnchorPane MainWindowId;

    @FXML
    private ToolBar ToolbarId;

    @FXML
    private MenuButton MenuButtonId;

    @FXML
    private MenuItem OpenDataButtonId;

    @FXML
    private MenuItem LoadChainButtonId;

    @FXML
    private MenuItem SaveChainButtonId;

    @FXML
    private GridPane GridPaneId;

    @FXML
    private ListView<String> List0Id;

    @FXML
    private ListView<String> List1Id;

    @FXML
    private ListView<String> List2Id;

    @FXML
    private ListView<String> List3Id;

    @FXML
    private ListView<String> List4Id;

    @FXML
    private ListView<String> List5Id;

    @FXML
    private ListView<String> List6Id;

    @FXML
    private ListView<String> List7Id;

    @FXML
    private TextField Filter0Id;

    @FXML
    private TextField Filter1Id;

    @FXML
    private TextField Filter2Id;

    @FXML
    private TextField Filter3Id;

    @FXML
    private TextField Filter4Id;

    @FXML
    private TextField Filter5Id;

    @FXML
    private TextField Filter6Id;

    @FXML
    private TextField Filter7Id;

    @FXML
    public void initialize()
    {
        hashMap = HashMapCreator.createHashmap();
        ObservableList<String> tmp1 =  FXCollections.observableArrayList(hashMap.keySet());
        List0Id.getItems().addAll(tmp1);
    }
}
