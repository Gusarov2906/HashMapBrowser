package MainPackage.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Class have methods to create and work with HashMapStruct
 */
public class HashMapCreator {

    /**
     * Method create random HashMapStruct
     * @param sizeOfHM - size of HashMapStruct
     * @return new generated HashMapStruct
     */

    public static HashMapStruct createHashmap(int sizeOfHM)
    {

        int size0 = new Random().nextInt(6) + 1;
        if(sizeOfHM < 8)
            size0 = 1;
        HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>> hashMap =
                new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>>();


        for(int i0 = 0; i0 < size0; i0++)
        {
            int size1 = new Random().nextInt(10) + 2;
            if(sizeOfHM < 7)
                size1 = 1;
            HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>> tmp0 =
                    new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>();
            for(int i1 = 0; i1 < size1; i1++)
            {
                int size2 = new Random().nextInt(10) + 2;
                if(sizeOfHM < 6)
                    size2 = 1;
                HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>> tmp1 =
                        new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>();
                for(int i2 = 0; i2 < size2; i2++)
                {
                    int size3 = new Random().nextInt(10) + 2;
                    if(sizeOfHM < 5)
                        size3 = 1;
                    HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>> tmp2 =
                            new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>();
                    for (int i3 = 0; i3 < size3; i3++)
                    {
                        int size4 = new Random().nextInt(10) + 2;
                        if(sizeOfHM < 4)
                            size4 = 1;
                        HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>> tmp3 =
                                new HashMap<String,  HashMap<String, HashMap<String, HashMap<String, String>>>>();
                        for (int i4 = 0; i4 < size4; i4++)
                        {
                            int size5 = new Random().nextInt(10) + 2;
                            if(sizeOfHM < 3)
                                size5 = 1;
                            HashMap<String, HashMap<String, HashMap<String, String>>> tmp4 =
                                    new HashMap<String,  HashMap<String, HashMap<String, String>>>();
                            for (int i5 = 0; i5 < size5; i5++)
                            {
                                int size6 = new Random().nextInt(10) + 2;
                                if(sizeOfHM < 2)
                                    size6 = 1;
                                HashMap<String, HashMap<String, String>> tmp5 =
                                        new HashMap<String,  HashMap<String, String>>();
                                for (int i6 = 0; i6 < size6; i6++)
                                {
                                    int size7 = new Random().nextInt(25) + 2;
                                    HashMap<String, String> tmp6 =
                                            new HashMap<String, String>();
                                    for (int i7 = 0; i7 < size7; i7++)
                                    {
                                        tmp6.put(Integer.toString(i7), Integer.toString(new Random().nextInt(10000000)));
                                    }
                                    if(sizeOfHM < 2)
                                        tmp5.put(Integer.toString(0), tmp6);
                                    else
                                        tmp5.put(Integer.toString((i6+1)*1000000),tmp6);
                                }
                                if(sizeOfHM < 3)
                                    tmp4.put(Integer.toString(0), tmp5);
                                    else
                                    tmp4.put(Integer.toString((i5+1)*100000),tmp5);
                            }
                            if(sizeOfHM < 4)
                                tmp3.put(Integer.toString(0), tmp4);
                            else
                            tmp3.put(Integer.toString((i4+1)*10000),tmp4);
                        }
                        if(sizeOfHM < 5)
                            tmp2.put(Integer.toString(0), tmp3);
                        else
                        tmp2.put(Integer.toString((i3+1)*1000),tmp3);
                    }
                    if(sizeOfHM < 6)
                        tmp1.put(Integer.toString(0), tmp2);
                    else
                    tmp1.put(Integer.toString((i2+1)*100),tmp2);
                }
                if(sizeOfHM < 7)
                    tmp0.put(Integer.toString(0), tmp1);
                else
                tmp0.put(Integer.toString((i1+1)*10),tmp1);
            }
            if(sizeOfHM < 8)
                hashMap.put(Integer.toString(0), tmp0);
            else
            hashMap.put(Integer.toString(i0+1),tmp0);
        }
        //System.out.println(hashMap.toString());
        HashMapStruct ret = new HashMapStruct();
        ret.hashMap = hashMap;
        ret.size = sizeOfHM;
        return ret;
    }

    /**
     * Method to check presence in the ArrayList specific string
     * @param arr - arraylist with strings
     * @param str - specific string
     * @return bool result
     */

    public static boolean In(ArrayList<String> arr, String str)
    {
        for (String s : arr) {
            if (s.equals(str))
                return true;
        }
        return false;
    }

    /**
     * Method to check presence in the ArrayList string with starts with like specific string
     * @param arr- arraylist with strings
     * @param str- specific string
     * @return - arraylist with matches
     */
    public static ArrayList<String> arrayStartsWith(ArrayList<String> arr,String str)
    {
        ArrayList<String> res = new ArrayList<String>();
        for (String s : arr) {
            if (s.startsWith(str))
                res.add(s);
        }
        return  res;
    }
}
