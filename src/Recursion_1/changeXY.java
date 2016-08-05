package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class changeXY {

    public static String changeXY(String str)
    {
        if(str.length() == 0)
            return str;

        if(str.charAt(0) == 'x')
            return 'y' + changeXY(str.substring(1));

        return str.charAt(0) + changeXY(str.substring(1));
    }

}
