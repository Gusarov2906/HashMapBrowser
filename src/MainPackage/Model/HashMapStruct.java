package MainPackage.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class to storage all data about all HashMaps with chain of selected items and size of nesting
 */

public class HashMapStruct implements Serializable {
    public HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>> hashMap;
    public int size;
    public String ListStr0 = "0";
    public String ListStr1 = "0";
    public String ListStr2 = "0";
    public String ListStr3 = "0";
    public String ListStr4 = "0";
    public String ListStr5 = "0";
    public String ListStr6 = "0";
    public String ListStr7 = "0";

}
