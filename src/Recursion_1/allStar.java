package Recursion_1;

/**
 * Created by vanessaulloa on 8/7/16.
 */
public class allStar {

    public static String allStar(String str)
    {
        if(str.length() <= 1)
            return str;

        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

}
