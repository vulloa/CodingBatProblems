package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class countHi {

    public static int countHi(String str)
    {
        if(str.length() < 2)
            return 0;

        if(str.substring(0,2).equals("hi"))
            return 1 + countHi(str.substring(2));

        return countHi(str.substring(1));
    }

}
