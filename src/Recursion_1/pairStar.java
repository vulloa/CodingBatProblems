package Recursion_1;

/**
 * Created by vanessaulloa on 8/7/16.
 */
public class pairStar {

    public static String pairStar(String str)
    {
        if(str.length() <= 1)
            return str;

        if(str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));

        return str.charAt(0) + pairStar(str.substring(1));
    }

}
