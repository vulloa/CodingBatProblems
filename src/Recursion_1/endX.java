package Recursion_1;

/**
 * Created by vanessaulloa on 8/7/16.
 */
public class endX {

    public static String endX(String str)
    {
        if(str.length() <= 1)
            return str;

        if(str.charAt(0) == 'x')
            return endX(str.substring(1)) + 'x';

        return str.charAt(0) + endX(str.substring(1));
    }

}
