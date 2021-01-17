package MainPackage;

import java.util.HashMap;
import java.util.Random;

public class HashMapCreator {
    public static  HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>> createHashmap()
    {
        int size0 = new Random().nextInt(6);
        HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>> hashMap =
                new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>>();


        for(int i0 = 0; i0 < size0; i0++)
        {
            int size1 = new Random().nextInt(10) + 1;
            HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>> tmp0 =
                    new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>>();
            for(int i1 = 0; i1 < size1; i1++)
            {
                int size2 = new Random().nextInt(10) + 1;
                HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>> tmp1 =
                        new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>>();
                for(int i2 = 0; i2 < size2; i2++)
                {
                    int size3 = new Random().nextInt(10) + 1;
                    HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>> tmp2 =
                            new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>>>();
                    for (int i3 = 0; i3 < size3; i3++)
                    {
                        int size4 = new Random().nextInt(10) + 1;
                        HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>> tmp3 =
                                new HashMap<String,  HashMap<String, HashMap<String, HashMap<String, String>>>>();
                        for (int i4 = 0; i4 < size4; i4++)
                        {
                            int size5 = new Random().nextInt(10) + 1;
                            HashMap<String, HashMap<String, HashMap<String, String>>> tmp4 =
                                    new HashMap<String,  HashMap<String, HashMap<String, String>>>();
                            for (int i5 = 0; i5 < size5; i5++)
                            {
                                int size6 = new Random().nextInt(10) + 1;
                                HashMap<String, HashMap<String, String>> tmp5 =
                                        new HashMap<String,  HashMap<String, String>>();
                                for (int i6 = 0; i6 < size6; i6++)
                                {
                                    int size7 = new Random().nextInt(25);
                                    HashMap<String, String> tmp6 =
                                            new HashMap<String, String>();
                                    for (int i7 = 0; i7 < size7; i7++)
                                    {
                                        tmp6.put(Integer.toString(i7), Integer.toString(new Random().nextInt(100)));
                                    }
                                    tmp5.put(Integer.toString(i6),tmp6);
                                }
                                tmp4.put(Integer.toString(i5),tmp5);
                            }
                            tmp3.put(Integer.toString(i4),tmp4);
                        }
                        tmp2.put(Integer.toString(i3),tmp3);
                    }
                    tmp1.put(Integer.toString(i2),tmp2);
                }
                tmp0.put(Integer.toString(i1),tmp1);
            }
            hashMap.put(Integer.toString(i0),tmp0);
        }
        //System.out.println(hashMap.toString());
        return hashMap;
    }
}
