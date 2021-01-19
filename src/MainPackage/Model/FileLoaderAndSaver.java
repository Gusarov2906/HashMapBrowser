package MainPackage.Model;

import java.io.*;

public class FileLoaderAndSaver {


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
