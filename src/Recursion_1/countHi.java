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

    public static int countHi2(String str)
    {
        if(str.length() <= 1)
            return 0;

        if(str.length() > 2 && str.substring(0,3).equals("xhi"))
            return countHi2(str.substring(3));

        if(str.substring(0,2).equals("hi"))
            return 1 + countHi2(str.substring(2));

        return countHi2(str.substring(1));
    }

}
