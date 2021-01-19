package MainPackage.Model;

import java.io.*;

/**
 * Class with methods to work with file
 */
public class FileLoaderAndSaver {

    /**
     * Method to load HashMapStruct form file
     * @param fileName - name of file(path)
     * @return loaded HashMapStruct
     */

    public static HashMapStruct loadFromFile(String fileName)
    {
        HashMapStruct hashMapStruct = new HashMapStruct();
        try
        {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            hashMapStruct = (HashMapStruct) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        return hashMapStruct;
    }

    /**
     * Method to save HashMapStruct to file
     * @param fileName - name of file(path)
     * @param hashMapStruct - HashMapStruct you want to save
     */

    public static void saveToFile(String fileName, HashMapStruct hashMapStruct)
    {

        FileOutputStream fos;
        try {
            fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hashMapStruct);
            oos.close();
            fos.close();
        } catch (IOException e)
        {

            System.out.println("Exception: " + e.getMessage());
        }


    }

}
