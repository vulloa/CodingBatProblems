package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class changePi {

    public static String changePi(String str)
    {
        if(str.length() <= 1)
            return str;

        if(str.substring(0,2).equals("pi"))
            return "3.14" + changePi(str.substring(2));

        return str.charAt(0) + changePi(str.substring(1));
    }

}
