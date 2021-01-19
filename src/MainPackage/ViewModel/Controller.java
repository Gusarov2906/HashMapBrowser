package MainPackage.ViewModel;
import MainPackage.Model.FileLoaderAndSaver;
import MainPackage.Model.HashMapCreator;
import MainPackage.Model.HashMapStruct;
import MainPackage.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class to interact with MainWindow.fxml
 */

public class Controller {
    final private int DefSize = 8;
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
    private MenuItem RandomDataButtonId;

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

    /**
     * Method starts when window created
     */

    @FXML
    public void initialize()
    {
        List0Id.getItems().clear();
        List1Id.getItems().clear();
        List2Id.getItems().clear();
        List3Id.getItems().clear();
        List4Id.getItems().clear();
        List5Id.getItems().clear();
        List6Id.getItems().clear();
        List7Id.getItems().clear();
        List8Id.getItems().clear();
    }

    /**
     * Method which triggered when load button pressed
     * @param event - load button pressed
     */

    @FXML
    void loadDataButtonClicked(ActionEvent event) {
        if (hashMapStruct != null) {
            hashMapStruct.ListStr0 = "0";
            hashMapStruct.ListStr1 = "0";
            hashMapStruct.ListStr2 = "0";
            hashMapStruct.ListStr3 = "0";
            hashMapStruct.ListStr4 = "0";
            hashMapStruct.ListStr5 = "0";
            hashMapStruct.ListStr6 = "0";
            hashMapStruct.ListStr7 = "0";
        }
        final FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open data");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("hmd", "*.hmd"));
        fileChooser.setInitialDirectory(new File("E:\\EclipseWorkspace\\HashMapBrowser\\data"));
        File dir = fileChooser.showOpenDialog(Main.scene.getWindow());
        if (dir != null) {
            hashMapStruct = FileLoaderAndSaver.loadFromFile(dir.getPath());
            ListStr0 = hashMapStruct.ListStr0;
            ListStr1 = hashMapStruct.ListStr1;
            ListStr2 = hashMapStruct.ListStr2;
            ListStr3 = hashMapStruct.ListStr3;
            ListStr4 = hashMapStruct.ListStr4;
            ListStr5 = hashMapStruct.ListStr5;
            ListStr6 = hashMapStruct.ListStr6;
            ListStr7 = hashMapStruct.ListStr7;

            fillTablesData();

            List0Id.getItems().addAll(FXCollections.observableArrayList(hashMapStruct.hashMap.keySet()));
            List0Id.getSelectionModel().select(ListStr0);
            List1Id.getItems().addAll(FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).keySet()));
            List1Id.getSelectionModel().select(ListStr1);
            List2Id.getItems().addAll(FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet()));
            List2Id.getSelectionModel().select(ListStr2);
            List3Id.getItems().addAll(FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).keySet()));
            List3Id.getSelectionModel().select(ListStr3);
            List4Id.getItems().addAll(FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet()));
            List4Id.getSelectionModel().select(ListStr4);
            List5Id.getItems().addAll(FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet()));
            List5Id.getSelectionModel().select(ListStr5);
            List6Id.getItems().addAll(FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet()));
            List6Id.getSelectionModel().select(ListStr6);
            List7Id.getItems().addAll(FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).keySet()));
            List7Id.getSelectionModel().select(ListStr7);
            List8Id.getItems().addAll(FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).get(ListStr7)));
            List8Id.getSelectionModel().select(ListStr7);

        }
    }

    /**
     * Method to open HashMapStruct
     */
    public static void openData()
    {
        if (hashMapStruct != null) {
            hashMapStruct.ListStr0 = "0";
            hashMapStruct.ListStr1 = "0";
            hashMapStruct.ListStr2 = "0";
            hashMapStruct.ListStr3 = "0";
            hashMapStruct.ListStr4 = "0";
            hashMapStruct.ListStr5 = "0";
            hashMapStruct.ListStr6 = "0";
            hashMapStruct.ListStr7 = "0";
        }
        final FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open data");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("hmd", "*.hmd"));
        fileChooser.setInitialDirectory(new File("E:\\EclipseWorkspace\\HashMapBrowser\\data"));
        File dir = fileChooser.showOpenDialog(Main.scene.getWindow());
        if(dir != null) {
            hashMapStruct = FileLoaderAndSaver.loadFromFile(dir.getPath());
            //fillTablesData();
        }
    }
    /**
     * Method which triggered when open data button pressed
     * @param event - open data button pressed
     */

    @FXML
    void openDataButtonClicked(ActionEvent event) {
        if (hashMapStruct != null) {
            hashMapStruct.ListStr0 = "0";
            hashMapStruct.ListStr1 = "0";
            hashMapStruct.ListStr2 = "0";
            hashMapStruct.ListStr3 = "0";
            hashMapStruct.ListStr4 = "0";
            hashMapStruct.ListStr5 = "0";
            hashMapStruct.ListStr6 = "0";
            hashMapStruct.ListStr7 = "0";
        }
        final FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open data");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("hmd", "*.hmd"));
        fileChooser.setInitialDirectory(new File("E:\\EclipseWorkspace\\HashMapBrowser\\data"));
        File dir = fileChooser.showOpenDialog(Main.scene.getWindow());
        if(dir != null) {
            hashMapStruct = FileLoaderAndSaver.loadFromFile(dir.getPath());
            fillTablesData();
        }
        ListStr0 = hashMapStruct.ListStr0;
        ListStr1 = hashMapStruct.ListStr1;
        ListStr2 = hashMapStruct.ListStr2;
        ListStr3 = hashMapStruct.ListStr3;
        ListStr4 = hashMapStruct.ListStr4;
        ListStr5 = hashMapStruct.ListStr5;
        ListStr6 = hashMapStruct.ListStr6;
        ListStr7 = hashMapStruct.ListStr7;
    }

    /**
     * Method to save current HashMapStruct
     */

    public static void saveData()
    {
        hashMapStruct.ListStr0 = ListStr0;
        hashMapStruct.ListStr1 = ListStr1;
        hashMapStruct.ListStr2 = ListStr2;
        hashMapStruct.ListStr3 = ListStr3;
        hashMapStruct.ListStr4 = ListStr4;
        hashMapStruct.ListStr5 = ListStr5;
        hashMapStruct.ListStr6 = ListStr6;
        hashMapStruct.ListStr7 = ListStr7;

        final FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open data");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("hmd", "*.hmd"));
        fileChooser.setInitialDirectory(new File("E:\\EclipseWorkspace\\HashMapBrowser\\data"));
        File dir = fileChooser.showSaveDialog(Main.scene.getWindow());
        if(dir!=null)
        FileLoaderAndSaver.saveToFile(dir.getPath(),hashMapStruct);
    }

    /**
     * Method which triggered when save data button pressed
     * @param event - save data button pressed
     */

    @FXML
    void saveDataButtonClicked(ActionEvent event) {

        saveData();
    }

    /**
     * Accessory method to prepare window for data
     */

    public void fillTablesData()
    {
        List0Id.getItems().clear();
        List1Id.getItems().clear();
        List2Id.getItems().clear();
        List3Id.getItems().clear();
        List4Id.getItems().clear();
        List5Id.getItems().clear();
        List6Id.getItems().clear();
        List7Id.getItems().clear();
        List8Id.getItems().clear();




        int size = hashMapStruct.size;
        ObservableList<String> tmp;
        switch (size) {
            case 1 -> {
                Main.scene.getWindow().setWidth(280);
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
                tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").get("0").get("0").get("0").get("0").get("0").keySet());
                List7Id.getItems().addAll(tmp);
            }
            case 2 -> {
                Main.scene.getWindow().setWidth(415);
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
                List6Id.setVisible(true);
                Filter6Id.setVisible(true);
                tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").get("0").get("0").get("0").get("0").keySet());
                List6Id.getItems().addAll(tmp);
            }
            case 3 -> {
                Main.scene.getWindow().setWidth(550);
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
                List5Id.setVisible(true);
                Filter5Id.setVisible(true);
                List6Id.setVisible(true);
                Filter6Id.setVisible(true);
                tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").get("0").get("0").get("0").keySet());
                List5Id.getItems().addAll(tmp);
            }
            case 4 -> {
                Main.scene.getWindow().setWidth(680);
                List0Id.setVisible(false);
                Filter0Id.setVisible(false);
                List1Id.setVisible(false);
                Filter1Id.setVisible(false);
                List2Id.setVisible(false);
                Filter2Id.setVisible(false);
                List3Id.setVisible(false);
                Filter3Id.setVisible(false);
                List4Id.setVisible(true);
                Filter4Id.setVisible(true);
                List5Id.setVisible(true);
                Filter5Id.setVisible(true);
                List6Id.setVisible(true);
                Filter6Id.setVisible(true);
                tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").get("0").get("0").keySet());
                List4Id.getItems().addAll(tmp);
            }
            case 5 -> {
                Main.scene.getWindow().setWidth(815);
                List0Id.setVisible(false);
                Filter0Id.setVisible(false);
                List1Id.setVisible(false);
                Filter1Id.setVisible(false);
                List2Id.setVisible(false);
                Filter2Id.setVisible(false);
                List3Id.setVisible(true);
                Filter3Id.setVisible(true);
                List4Id.setVisible(true);
                Filter4Id.setVisible(true);
                List5Id.setVisible(true);
                Filter5Id.setVisible(true);
                List6Id.setVisible(true);
                Filter6Id.setVisible(true);
                tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").get("0").keySet());
                List3Id.getItems().addAll(tmp);
            }
            case 6 -> {
                Main.scene.getWindow().setWidth(945);
                List0Id.setVisible(false);
                Filter0Id.setVisible(false);
                List1Id.setVisible(false);
                Filter1Id.setVisible(false);
                List2Id.setVisible(true);
                Filter2Id.setVisible(true);
                List3Id.setVisible(true);
                Filter3Id.setVisible(true);
                List4Id.setVisible(true);
                Filter4Id.setVisible(true);
                List5Id.setVisible(true);
                Filter5Id.setVisible(true);
                List6Id.setVisible(true);
                Filter6Id.setVisible(true);
                tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").get("0").keySet());
                List2Id.getItems().addAll(tmp);
            }
            case 7 -> {
                Main.scene.getWindow().setWidth(1080);
                List0Id.setVisible(false);
                Filter0Id.setVisible(false);
                List1Id.setVisible(true);
                Filter1Id.setVisible(true);
                List2Id.setVisible(true);
                Filter2Id.setVisible(true);
                List3Id.setVisible(true);
                Filter3Id.setVisible(true);
                List4Id.setVisible(true);
                Filter4Id.setVisible(true);
                List5Id.setVisible(true);
                Filter5Id.setVisible(true);
                List6Id.setVisible(true);
                Filter6Id.setVisible(true);
                tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get("0").keySet());
                List1Id.getItems().addAll(tmp);
            }
            case 8 -> {
                Main.scene.getWindow().setWidth(1200);
                List0Id.setVisible(true);
                Filter0Id.setVisible(true);
                List1Id.setVisible(true);
                Filter1Id.setVisible(true);
                List2Id.setVisible(true);
                Filter2Id.setVisible(true);
                List3Id.setVisible(true);
                Filter3Id.setVisible(true);
                List4Id.setVisible(true);
                Filter4Id.setVisible(true);
                List5Id.setVisible(true);
                Filter5Id.setVisible(true);
                List6Id.setVisible(true);
                Filter6Id.setVisible(true);
                tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.keySet());
                List0Id.getItems().addAll(tmp);
            }
        }
    }

    /**
     * Method which triggered when random data button pressed
     * @param event - random data button pressed
     */

    @FXML
    void randomDataButtonClicked(ActionEvent event) {

        //hashMap.values().add(new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>());
        hashMapStruct = HashMapCreator.createHashmap(DefSize);
        fillTablesData();
    }


    /**
     * Method which triggered when ListView0 clicked
     * @param event -  ListView0 clicked
     */

    @FXML
    public void clicked0(MouseEvent event) {
        if(hashMapStruct != null) {
            ListStr0 = List0Id.getSelectionModel().selectedItemProperty().getValue();
            if (ListStr0 != null && HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.keySet()), ListStr0)) {
                List1Id.getItems().clear();
                List2Id.getItems().clear();
                List3Id.getItems().clear();
                List4Id.getItems().clear();
                List5Id.getItems().clear();
                List6Id.getItems().clear();
                List7Id.getItems().clear();
                List8Id.getItems().clear();
                ObservableList<String> tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).keySet());
                List1Id.getItems().addAll(tmp);
            }
        }
    }

    /**
     * Method which triggered when ListView1 clicked
     * @param event -  ListView1 clicked
     */
    @FXML
    public void clicked1(MouseEvent event) {
    if (hashMapStruct != null) {

        if (hashMapStruct.size > 6)
            ListStr1 = List1Id.getSelectionModel().selectedItemProperty().getValue();
        if (ListStr0 != null && ListStr1 != null && HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).keySet()), ListStr1)) {
            List2Id.getItems().clear();
            List3Id.getItems().clear();
            List4Id.getItems().clear();
            List5Id.getItems().clear();
            List6Id.getItems().clear();
            List7Id.getItems().clear();
            List8Id.getItems().clear();
            ObservableList<String> tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet());
            List2Id.getItems().addAll(tmp);
        }
        }
    }


    /**
     * Method which triggered when ListView2 clicked
     * @param event -  ListView2 clicked
     */

    @FXML
    public void clicked2(MouseEvent event) {
        if(hashMapStruct != null)
        {
            if (hashMapStruct.size > 5)
                ListStr2 = List2Id.getSelectionModel().selectedItemProperty().getValue();
            if(ListStr0 != null && ListStr1 != null && ListStr2 != null && HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet()), ListStr2)) {
                List3Id.getItems().clear();
                List4Id.getItems().clear();
                List5Id.getItems().clear();
                List6Id.getItems().clear();
                List7Id.getItems().clear();
                List8Id.getItems().clear();
                ObservableList<String> tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get((ListStr2)).keySet());
                List3Id.getItems().addAll(tmp);
            }
        }
    }

    /**
     * Method which triggered when ListView3 clicked
     * @param event -  ListView3 clicked
     */

    @FXML
    public void clicked3(MouseEvent event) {
            if(hashMapStruct != null) {
                if (hashMapStruct.size > 4)
                    ListStr3 = List3Id.getSelectionModel().selectedItemProperty().getValue();
                if (ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null &&
                        HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).keySet()), ListStr3)) {
                    List4Id.getItems().clear();
                    List5Id.getItems().clear();
                    List6Id.getItems().clear();
                    List7Id.getItems().clear();
                    List8Id.getItems().clear();
                    ObservableList<String> tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet());
                    List4Id.getItems().addAll(tmp);
                }
            }
    }

    /**
     * Method which triggered when ListView4 clicked
     * @param event -  ListView4 clicked
     */

    @FXML
    public void clicked4(MouseEvent event) {
            if(hashMapStruct != null) {

                if (hashMapStruct.size > 3)
                    ListStr4 = List4Id.getSelectionModel().selectedItemProperty().getValue();
                if (ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null &&
                        HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet()), ListStr4)) {
                    List5Id.getItems().clear();
                    List6Id.getItems().clear();
                    List7Id.getItems().clear();
                    List8Id.getItems().clear();
                    ObservableList<String> tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet());
                    List5Id.getItems().addAll(tmp);
                }
            }
    }

    /**
     * Method which triggered when ListView5 clicked
     * @param event -  ListView5 clicked
     */

    @FXML
    public void clicked5(MouseEvent event) {
            if(hashMapStruct != null) {

                if (hashMapStruct.size > 2)
                    ListStr5 = List5Id.getSelectionModel().selectedItemProperty().getValue();
                if (ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null && ListStr5 != null &&
                        HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet()), ListStr5)) {
                    List6Id.getItems().clear();
                    List7Id.getItems().clear();
                    List8Id.getItems().clear();
                    ObservableList<String> tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet());
                    List6Id.getItems().addAll(tmp);
                }
            }
    }

    /**
     * Method which triggered when ListView6 clicked
     * @param event -  ListView6 clicked
     */

    @FXML
    public void clicked6(MouseEvent event) {
            if(hashMapStruct != null) {

                if (hashMapStruct.size > 1)
                    ListStr6 = List6Id.getSelectionModel().selectedItemProperty().getValue();
                if (ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null && ListStr5 != null && ListStr6 != null &&
                        HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet()), ListStr6)) {
                    List7Id.getItems().clear();
                    List8Id.getItems().clear();
                    ObservableList<String> tmp = FXCollections.observableArrayList(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).keySet());
                    List7Id.getItems().addAll(tmp);
                }
            }

    }

    /**
     * Method which triggered when ListView7 clicked
     * @param event -  ListView7 clicked
     */

    @FXML
    public void clicked7(MouseEvent event) {
        if(hashMapStruct != null) {
            ListStr7 = List7Id.getSelectionModel().selectedItemProperty().getValue();
            if (ListStr0 != null && ListStr1 != null && ListStr2 != null && ListStr3 != null && ListStr4 != null && ListStr5 != null && ListStr6 != null && ListStr7 != null &&
                    HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).keySet()), ListStr7)) {
                List8Id.getItems().clear();
                HashMap<String, String> tmp = hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6);
                List8Id.getItems().add(tmp.get(ListStr7));


            }
        }
    }

    /**
     * Method which triggered when any keyboard button pressed when selected filter0
     * @param event -  any keyboard button pressed when selected filter0
     */

    @FXML
    void Filter0TextChanged(KeyEvent event) {
        String filter = Filter0Id.getText();
        if (hashMapStruct != null) {
            if (List0Id.getItems().size() > 0) {
                ArrayList<String> res = HashMapCreator.arrayStartsWith(new ArrayList<String>(hashMapStruct.hashMap.keySet()), filter);
                if (!res.isEmpty()) {
                    List0Id.getItems().clear();
                    List0Id.getItems().addAll(res);
                } else if (!filter.equals("")) {
                    List0Id.getItems().clear();
                }
            }
        }
    }

    /**
     * Method which triggered when Filter0 clicked
     * @param event -  Filter0 clicked
     */

    @FXML
    void Filter0Clicked(MouseEvent event) {
        Filter0Id.setText("");
        List0Id.getItems().clear();
        if(hashMapStruct != null)
        List0Id.getItems().addAll(hashMapStruct.hashMap.keySet());
    }

    /**
     * Method which triggered when any keyboard button pressed when selected filter1
     * @param event -  any keyboard button pressed when selected filter1
     */

    @FXML
    void Filter1TextChanged(KeyEvent event) {
        String filter = Filter1Id.getText();
        if (hashMapStruct != null) {
            if (List1Id.getItems().size() > 0) {
                ArrayList<String> res = HashMapCreator.arrayStartsWith(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).keySet()), filter);
                if (!res.isEmpty()) {
                    List1Id.getItems().clear();
                    List1Id.getItems().addAll(res);
                } else if (filter != null) {
                    List1Id.getItems().clear();
                }
            }
        }
    }

    /**
     * Method which triggered when Filter1 clicked
     * @param event -  Filter1 clicked
     */

    @FXML
    void Filter1Clicked(MouseEvent event) {
        Filter1Id.setText("");
        List1Id.getItems().clear();
        List2Id.getItems().clear();
        List3Id.getItems().clear();
        List4Id.getItems().clear();
        List5Id.getItems().clear();
        List6Id.getItems().clear();
        List7Id.getItems().clear();
        List8Id.getItems().clear();
        ListStr1 = "0";
        ListStr2 = "0";
        ListStr3 = "0";
        ListStr4 = "0";
        ListStr5 = "0";
        ListStr6 = "0";
        ListStr7 = "0";
        //if(!ListStr0.equals( "0" ))
        if (HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.keySet()),ListStr0))
            List1Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).keySet());
    }

    /**
     * Method which triggered when any keyboard button pressed when selected filter2
     * @param event -  any keyboard button pressed when selected filter2
     */

    @FXML
    void Filter2TextChanged(KeyEvent event) {
        String filter = Filter2Id.getText();
        if (hashMapStruct != null) {
            if (List2Id.getItems().size() > 0) {
                ArrayList<String> res = HashMapCreator.arrayStartsWith(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet()), filter);
                if (!res.isEmpty()) {
                    List2Id.getItems().clear();
                    List2Id.getItems().addAll(res);
                } else if (filter != null) {
                    List2Id.getItems().clear();
                }
            }
        }
    }

    /**
     * Method which triggered when Filter2 clicked
     * @param event -  Filter2 clicked
     */

    @FXML
    void Filter2Clicked(MouseEvent event) {
        Filter2Id.setText("");
        List2Id.getItems().clear();
        List3Id.getItems().clear();
        List4Id.getItems().clear();
        List5Id.getItems().clear();
        List6Id.getItems().clear();
        List7Id.getItems().clear();
        List8Id.getItems().clear();
        ListStr2 = "0";
        ListStr3 = "0";
        ListStr4 = "0";
        ListStr5 = "0";
        ListStr6 = "0";
        ListStr7 = "0";
        //if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ))
        //if(!ListStr1.equals( "0" ))
        if (HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).keySet()),ListStr1))
            List2Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet());
    }

    /**
     * Method which triggered when any keyboard button pressed when selected filter3
     * @param event -  any keyboard button pressed when selected filter3
     */

    @FXML
    void Filter3TextChanged(KeyEvent event) {
        String filter = Filter3Id.getText();
        if (hashMapStruct != null) {
            if (List3Id.getItems().size() > 0) {
                ArrayList<String> res = HashMapCreator.arrayStartsWith(
                        new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).keySet()), filter);
                if (!res.isEmpty()) {
                    List3Id.getItems().clear();
                    List3Id.getItems().addAll(res);
                } else if (filter != null) {
                    List3Id.getItems().clear();
                }
            }
        }
    }

    /**
     * Method which triggered when Filter3 clicked
     * @param event -  Filter3 clicked
     */

    @FXML
    void Filter3Clicked(MouseEvent event) {
        Filter3Id.setText("");
        List3Id.getItems().clear();
        List4Id.getItems().clear();
        List5Id.getItems().clear();
        List6Id.getItems().clear();
        List7Id.getItems().clear();
        List8Id.getItems().clear();
        ListStr3 = "0";
        ListStr4 = "0";
        ListStr5 = "0";
        ListStr6 = "0";
        ListStr7 = "0";
        //if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ) && !ListStr2.equals( "0" ))
        //if(!ListStr2.equals( "0" ))
        if (HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).keySet()),ListStr2))
            List3Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).keySet());
    }

    /**
     * Method which triggered when any keyboard button pressed when selected filter4
     * @param event -  any keyboard button pressed when selected filter4
     */


    @FXML
    void Filter4TextChanged(KeyEvent event) {
        String filter = Filter4Id.getText();
        if (hashMapStruct != null) {
            if (List4Id.getItems().size() > 0) {
                ArrayList<String> res = HashMapCreator.arrayStartsWith(
                        new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet()), filter);
                if (!res.isEmpty()) {
                    List4Id.getItems().clear();
                    List4Id.getItems().addAll(res);
                } else if (filter != null) {
                    List4Id.getItems().clear();
                }
            }
        }
    }

    /**
     * Method which triggered when Filter4 clicked
     * @param event -  Filter4 clicked
     */

    @FXML
    void Filter4Clicked(MouseEvent event) {
        Filter4Id.setText("");
        List4Id.getItems().clear();
        List5Id.getItems().clear();
        List6Id.getItems().clear();
        List7Id.getItems().clear();
        List8Id.getItems().clear();
        ListStr4 = "0";
        ListStr5 = "0";
        ListStr6 = "0";
        ListStr7 = "0";
        //if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ) && !ListStr2.equals( "0" ) && !ListStr3.equals( "0" ))
        //if(!ListStr3.equals( "0" ))
        if (HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).keySet()),ListStr3))
            List4Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet());
    }

    /**
     * Method which triggered when any keyboard button pressed when selected filter5
     * @param event -  any keyboard button pressed when selected filter5
     */

    @FXML
    void Filter5TextChanged(KeyEvent event) {
        String filter = Filter5Id.getText();
        if (hashMapStruct != null) {
            if (List5Id.getItems().size() > 0) {
                ArrayList<String> res = HashMapCreator.arrayStartsWith(
                        new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet()), filter);
                if (!res.isEmpty()) {
                    List5Id.getItems().clear();
                    List5Id.getItems().addAll(res);
                } else if (filter != null) {
                    List5Id.getItems().clear();
                }
            }
        }
    }

    /**
     * Method which triggered when Filter5 clicked
     * @param event -  Filter5 clicked
     */

    @FXML
    void Filter5Clicked(MouseEvent event) {
        Filter5Id.setText("");
        List5Id.getItems().clear();
        List6Id.getItems().clear();
        List7Id.getItems().clear();
        List8Id.getItems().clear();
        ListStr5 = "0";
        ListStr6 = "0";
        ListStr7 = "0";
        //if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ) && !ListStr2.equals( "0" ) && !ListStr3.equals( "0" ) && !ListStr4.equals( "0" ))
        //if(!ListStr5.equals( "0" ))
        if (HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).keySet()),ListStr4))
            List5Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet());
    }

    /**
     * Method which triggered when any keyboard button pressed when selected filter6
     * @param event -  any keyboard button pressed when selected filter6
     */

    @FXML
    void Filter6TextChanged(KeyEvent event) {
        String filter = Filter6Id.getText();
        if (hashMapStruct != null) {
            if (List6Id.getItems().size() > 0) {
                ArrayList<String> res = HashMapCreator.arrayStartsWith(
                        new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet()), filter);
                if (!res.isEmpty()) {
                    List6Id.getItems().clear();
                    List6Id.getItems().addAll(res);
                } else if (filter != null) {
                    List6Id.getItems().clear();
                }
            }
        }
    }

    /**
     * Method which triggered when Filter6 clicked
     * @param event -  Filter6 clicked
     */

    @FXML
    void Filter6Clicked(MouseEvent event) {
        Filter6Id.setText("");
        List6Id.getItems().clear();
        List7Id.getItems().clear();
        List8Id.getItems().clear();
        ListStr6 = "0";
        ListStr7 = "0";
       //if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ) && !ListStr2.equals( "0" ) && !ListStr3.equals( "0" ) && !ListStr4.equals( "0" ) && !ListStr5.equals( "0" ))
        //if(!ListStr5.equals( "0" ))
        if (HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).keySet()),ListStr5))
            List6Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet());
    }

    /**
     * Method which triggered when any keyboard button pressed when selected filter7
     * @param event -  any keyboard button pressed when selected filter7
     */

    @FXML
    void Filter7TextChanged(KeyEvent event) {
        String filter = Filter7Id.getText();
        if (hashMapStruct != null) {
            if (List7Id.getItems().size() > 0) {
                ArrayList<String> res = HashMapCreator.arrayStartsWith(
                        new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).keySet()), filter);
                if (!res.isEmpty()) {
                    List7Id.getItems().clear();
                    List7Id.getItems().addAll(res);
                } else if (filter != null) {
                    List7Id.getItems().clear();
                }
            }
        }
    }

    /**
     * Method which triggered when Filter7 clicked
     * @param event -  Filter7 clicked
     */

    @FXML
    void Filter7Clicked(MouseEvent event) {
        Filter7Id.setText("");
        List7Id.getItems().clear();
        List8Id.getItems().clear();
        ListStr7 = "0";
        //if(!ListStr0.equals( "0" ) && !ListStr1.equals( "0" ) && !ListStr2.equals( "0" ) && !ListStr3.equals( "0" ) && !ListStr4.equals( "0" ) && !ListStr5.equals( "0" ) && !ListStr6.equals( "0" ))
        //if(!ListStr6.equals( "0" ))
        if (HashMapCreator.In(new ArrayList<String>(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).keySet()),ListStr6))
            List7Id.getItems().addAll(hashMapStruct.hashMap.get(ListStr0).get(ListStr1).get(ListStr2).get(ListStr3).get(ListStr4).get(ListStr5).get(ListStr6).keySet());
    }
}
