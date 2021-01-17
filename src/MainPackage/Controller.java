package MainPackage;
import javafx.beans.binding.StringBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class Controller {

    public static HashMapStruct hashMapStruct;
    public static String ListStr0 = "0";
    public static String ListStr1 = "0";
    public static String ListStr2 = "0";
    public static String ListStr3 = "0";
    public static String ListStr4 = "0";
    public static String ListStr5 = "0";
    public static String ListStr6 = "0";
    public static String ListStr7 = "0";


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
    private ListView<String> List8Id;

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
    private TextField Filter8Id;

    @FXML
    public void initialize()
    {

        //hashMap.values().add(new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>());
        hashMapStruct = HashMapCreator.createHashmap(2);
        int size = hashMapStruct.size;
        ObservableList<String> tmp;
        switch (size)
        {
            case 1:
                List0Id.setVisible(false);
                Filter0Id.setVisible(false);
                List1Id.setVisible(false);
                Filter1Id.setVisible(false);
                List2Id.setVisible(false);
                Filter2Id.setVisible(false);
                List3Id.setVisible(false);
                Filter3Id.setVisible(false);
                List4Id.setVisible(false);
                Filter4Id.setVisible(false);
                List5Id.setVisible(false);
                Filter5Id.setVisible(false);
                List6Id.setVisible(false);
                Filter6Id.setVisible(false);
                tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").get("0").get("0").get("0").get("0").get("0").keySet());
                List7Id.getItems().addAll(tmp);
                break;
            case 2:

                List0Id.setVisible(false);
                Filter0Id.setVisible(false);
                List1Id.setVisible(false);
                Filter1Id.setVisible(false);
                List2Id.setVisible(false);
                Filter2Id.setVisible(false);
                List3Id.setVisible(false);
                Filter3Id.setVisible(false);
                List4Id.setVisible(false);
                Filter4Id.setVisible(false);
                List5Id.setVisible(false);
                Filter5Id.setVisible(false);
                tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").get("0").get("0").get("0").get("0").keySet());
                List6Id.getItems().addAll(tmp);
                break;
            case 3:

                List0Id.setVisible(false);
                Filter0Id.setVisible(false);
                List1Id.setVisible(false);
                Filter1Id.setVisible(false);
                List2Id.setVisible(false);
                Filter2Id.setVisible(false);
                List3Id.setVisible(false);
                Filter3Id.setVisible(false);
                List4Id.setVisible(false);
                Filter4Id.setVisible(false);
                tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").get("0").get("0").get("0").keySet());
                List5Id.getItems().addAll(tmp);
                break;
            case 4:
                List0Id.setVisible(false);
                Filter0Id.setVisible(false);
                List1Id.setVisible(false);
                Filter1Id.setVisible(false);
                List2Id.setVisible(false);
                Filter2Id.setVisible(false);
                List3Id.setVisible(false);
                Filter3Id.setVisible(false);
                tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").get("0").get("0").keySet());
                List4Id.getItems().addAll(tmp);
                break;
            case 5:
                List0Id.setVisible(false);
                Filter0Id.setVisible(false);
                List1Id.setVisible(false);
                Filter1Id.setVisible(false);
                List2Id.setVisible(false);
                Filter2Id.setVisible(false);
                tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").get("0").keySet());
                List3Id.getItems().addAll(tmp);
                break;
            case 6:
                List0Id.setVisible(false);
                Filter0Id.setVisible(false);
                List1Id.setVisible(false);
                Filter1Id.setVisible(false);
                tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").keySet());
                List2Id.getItems().addAll(tmp);
                break;
            case 7:
                List0Id.setVisible(false);
                Filter0Id.setVisible(false);
                tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").keySet());
                List1Id.getItems().addAll(tmp);
                break;
            case 8:
                tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.keySet());
                List0Id.getItems().addAll(tmp);
                break;
        }


    }

    @FXML
    public void clicked0(MouseEvent event) {
        ListStr0 = List0Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && !HashMapCreator.notIn(new ArrayList<String>(hashMapStruct.hashMap.keySet()),ListStr0))
        {
            List1Id.getItems().clear();
            List2Id.getItems().clear();
            List3Id.getItems().clear();
            List4Id.getItems().clear();
            List5Id.getItems().clear();
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).keySet());
            List1Id.getItems().addAll(tmp);
        }
    }
    @FXML
    public void clicked1(MouseEvent event) {
        if (hashMapStruct.size > 6)
            ListStr1 = List1Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && !HashMapCreator.notIn(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).keySet()), ListStr1))
        {
            List2Id.getItems().clear();
            List3Id.getItems().clear();
            List4Id.getItems().clear();
            List5Id.getItems().clear();
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet());
            List2Id.getItems().addAll(tmp);
        }
    }

    @FXML
    public void clicked2(MouseEvent event) {
        if (hashMapStruct.size > 5)
            ListStr2 = List2Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && !HashMapCreator.notIn(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet()), ListStr2))
        {
            List3Id.getItems().clear();
            List4Id.getItems().clear();
            List5Id.getItems().clear();
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get((ListStr2)).keySet());
            List3Id.getItems().addAll(tmp);
        }
    }

    @FXML
    public void clicked3(MouseEvent event) {
        if (hashMapStruct.size > 4)
            ListStr3 = List3Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null &&
                !HashMapCreator.notIn(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).keySet()), ListStr3))
        {
            List4Id.getItems().clear();
            List5Id.getItems().clear();
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet());
            List4Id.getItems().addAll(tmp);
        }
    }

    @FXML
    public void clicked4(MouseEvent event) {
        if (hashMapStruct.size > 3)
            ListStr4 = List4Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null &&
                !HashMapCreator.notIn(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet()), ListStr4))
        {
            List5Id.getItems().clear();
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet());
            List5Id.getItems().addAll(tmp);
        }
    }

    @FXML
    public void clicked5(MouseEvent event) {
        if (hashMapStruct.size > 2)
            ListStr5 = List5Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null && ListStr5 != null &&
                !HashMapCreator.notIn(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet()), ListStr5))
        {
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet());
            List6Id.getItems().addAll(tmp);
        }
    }
    @FXML
    public void clicked6(MouseEvent event) {
        if (hashMapStruct.size > 1)
            ListStr6 = List6Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null && ListStr5 != null && ListStr6 != null &&
                !HashMapCreator.notIn(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet()), ListStr6))
        {
            List7Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).keySet());
            List7Id.getItems().addAll(tmp);
        }
    }

    @FXML
    public void clicked7(MouseEvent event) {
        ListStr7 = List7Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null && ListStr5 != null && ListStr6 != null && ListStr7 != null &&
                !HashMapCreator.notIn(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).keySet()), ListStr7))
        {
            List8Id.getItems().clear();
            HashMap<String,String> tmp = hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6);
            List8Id.getItems().add(tmp.get(ListStr7));


        }
    }

}
