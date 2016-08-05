package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class countX {

    public static int countX(String str)
    {
        if(str.length() < 1)
            return 0;

        if(str.charAt(0) == 'x')
            return 1 + countX(str.substring(1));

        return countX(str.substring(1));
    }

}
