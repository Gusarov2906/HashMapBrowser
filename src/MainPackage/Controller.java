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
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
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
    public void initialize()
    {

        //hashMap.values().add(new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>());
        hashMapStruct = HashMapCreator.createHashmap(8);
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
        if(ListStr0 != null && HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.keySet()),ListStr0))
        {
            List1Id.getItems().clear();
            List2Id.getItems().clear();
            List3Id.getItems().clear();
            List4Id.getItems().clear();
            List5Id.getItems().clear();
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            List8Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).keySet());
            List1Id.getItems().addAll(tmp);
        }
    }
    @FXML
    public void clicked1(MouseEvent event) {
        if (hashMapStruct.size > 6)
            ListStr1 = List1Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).keySet()), ListStr1))
        {
            List2Id.getItems().clear();
            List3Id.getItems().clear();
            List4Id.getItems().clear();
            List5Id.getItems().clear();
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            List8Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet());
            List2Id.getItems().addAll(tmp);
        }
    }

    @FXML
    public void clicked2(MouseEvent event) {
        if (hashMapStruct.size > 5)
            ListStr2 = List2Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet()), ListStr2))
        {
            List3Id.getItems().clear();
            List4Id.getItems().clear();
            List5Id.getItems().clear();
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            List8Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get((ListStr2)).keySet());
            List3Id.getItems().addAll(tmp);
        }
    }

    @FXML
    public void clicked3(MouseEvent event) {
        if (hashMapStruct.size > 4)
            ListStr3 = List3Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null &&
                HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).keySet()), ListStr3))
        {
            List4Id.getItems().clear();
            List5Id.getItems().clear();
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            List8Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet());
            List4Id.getItems().addAll(tmp);
        }
    }

    @FXML
    public void clicked4(MouseEvent event) {
        if (hashMapStruct.size > 3)
            ListStr4 = List4Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null &&
                HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet()), ListStr4))
        {
            List5Id.getItems().clear();
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            List8Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet());
            List5Id.getItems().addAll(tmp);
        }
    }

    @FXML
    public void clicked5(MouseEvent event) {
        if (hashMapStruct.size > 2)
            ListStr5 = List5Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null && ListStr5 != null &&
                HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet()), ListStr5))
        {
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            List8Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet());
            List6Id.getItems().addAll(tmp);
        }
    }
    @FXML
    public void clicked6(MouseEvent event) {
        if (hashMapStruct.size > 1)
            ListStr6 = List6Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null && ListStr5 != null && ListStr6 != null &&
                HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet()), ListStr6))
        {
            List7Id.getItems().clear();
            List8Id.getItems().clear();
            ObservableList<String> tmp =  FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).keySet());
            List7Id.getItems().addAll(tmp);
        }
    }

    @FXML
    public void clicked7(MouseEvent event) {
        ListStr7 = List7Id.getSelectionModel().selectedItemProperty().getValue();
        if(ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null && ListStr5 != null && ListStr6 != null && ListStr7 != null &&
                HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).keySet()), ListStr7))
        {
            List8Id.getItems().clear();
            HashMap<String,String> tmp = hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6);
            List8Id.getItems().add(tmp.get(ListStr7));


        }
    }

    @FXML
    void Filter0TextChanged(KeyEvent event) {
    String filter = Filter0Id.getText();
    ArrayList<String> res = HashMapCreator.arrayStartsWith(new ArrayList<String>(hashMapStruct.hashMap.keySet()), filter);
        if (!res.isEmpty()) {
            List0Id.getItems().clear();
            List0Id.getItems().addAll(res);
        }
        else if (!filter.equals(""))
        {
            List0Id.getItems().clear();
        }
    }
    @FXML
    void Filter0Clicked(MouseEvent event) {
        Filter0Id.setText("");
        List0Id.getItems().clear();
        List0Id.getItems().addAll(hashMapStruct.hashMap.keySet());
    }

    @FXML
    void Filter1TextChanged(KeyEvent event) {
        String filter = Filter1Id.getText();
        ArrayList<String> res = HashMapCreator.arrayStartsWith(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).keySet()), filter);
        if (!res.isEmpty()) {
            List1Id.getItems().clear();
            List1Id.getItems().addAll(res);
        }
        else if (!filter.equals(""))
        {
            List1Id.getItems().clear();
        }
    }

    @FXML
    void Filter1Clicked(MouseEvent event) {
        Filter1Id.setText("");
        List1Id.getItems().clear();
        if(!ListStr0.equals( "0" ))
        List1Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).keySet());
    }
    @FXML
    void Filter2TextChanged(KeyEvent event) {
        String filter = Filter2Id.getText();
        ArrayList<String> res = HashMapCreator.arrayStartsWith(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet()), filter);
        if (!res.isEmpty()) {
            List2Id.getItems().clear();
            List2Id.getItems().addAll(res);
        }
        else if (!filter.equals(""))
        {
            List2Id.getItems().clear();
        }
    }
    @FXML
    void Filter2Clicked(MouseEvent event) {
        Filter2Id.setText("");
        List2Id.getItems().clear();
        if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ))
        List2Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet());
    }
    @FXML
    void Filter3TextChanged(KeyEvent event) {
        String filter = Filter3Id.getText();
        ArrayList<String> res = HashMapCreator.arrayStartsWith(
                new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).keySet()), filter);
        if (!res.isEmpty()) {
            List3Id.getItems().clear();
            List3Id.getItems().addAll(res);
        }
        else if (!filter.equals(""))
        {
            List3Id.getItems().clear();
        }
    }
    @FXML
    void Filter3Clicked(MouseEvent event) {
        Filter3Id.setText("");
        List3Id.getItems().clear();
        if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ) && !ListStr2.equals( "0" ))
        List3Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).keySet());
    }
    @FXML
    void Filter4TextChanged(KeyEvent event) {
        String filter = Filter4Id.getText();
        ArrayList<String> res = HashMapCreator.arrayStartsWith(
                new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet()), filter);
        if (!res.isEmpty()) {
            List4Id.getItems().clear();
            List4Id.getItems().addAll(res);
        }
        else if (!filter.equals(""))
        {
            List4Id.getItems().clear();
        }
    }
    @FXML
    void Filter4Clicked(MouseEvent event) {
        Filter4Id.setText("");
        List4Id.getItems().clear();
        if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ) && !ListStr2.equals( "0" ) && !ListStr3.equals( "0" ))
        List4Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet());
    }
    @FXML
    void Filter5TextChanged(KeyEvent event) {
        String filter = Filter5Id.getText();
        ArrayList<String> res = HashMapCreator.arrayStartsWith(
                new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet()), filter);
        if (!res.isEmpty()) {
            List5Id.getItems().clear();
            List5Id.getItems().addAll(res);
        }
        else if (!filter.equals(""))
        {
            List5Id.getItems().clear();
        }
    }
    @FXML
    void Filter5Clicked(MouseEvent event) {
        Filter5Id.setText("");
        List5Id.getItems().clear();
        if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ) && !ListStr2.equals( "0" ) && !ListStr3.equals( "0" ) && !ListStr4.equals( "0" ))
        List5Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet());
    }
    @FXML
    void Filter6TextChanged(KeyEvent event) {
        String filter = Filter6Id.getText();
        ArrayList<String> res = HashMapCreator.arrayStartsWith(
                new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet()), filter);
        if (!res.isEmpty()) {
            List6Id.getItems().clear();
            List6Id.getItems().addAll(res);
        }
        else if (!filter.equals(""))
        {
            List6Id.getItems().clear();
        }
    }
    @FXML
    void Filter6Clicked(MouseEvent event) {
        Filter6Id.setText("");
        List6Id.getItems().clear();
        if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ) && !ListStr2.equals( "0" ) && !ListStr3.equals( "0" ) && !ListStr4.equals( "0" ) && !ListStr5.equals( "0" ))
        List6Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet());
    }
    @FXML
    void Filter7TextChanged(KeyEvent event) {
        String filter = Filter7Id.getText();
        ArrayList<String> res = HashMapCreator.arrayStartsWith(
                new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).keySet()), filter);
        if (!res.isEmpty()) {
            List7Id.getItems().clear();
            List7Id.getItems().addAll(res);
        }
        else if (!filter.equals(""))
        {
            List7Id.getItems().clear();
        }
    }
    @FXML
    void Filter7Clicked(MouseEvent event) {
        Filter7Id.setText("");
        List7Id.getItems().clear();
        if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ) && !ListStr2.equals( "0" ) && !ListStr3.equals( "0" ) && !ListStr4.equals( "0" ) && !ListStr5.equals( "0" ) && !ListStr6.equals( "0" ))
        List7Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).keySet());
    }
}
