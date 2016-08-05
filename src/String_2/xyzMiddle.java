package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class xyzMiddle {

    public static boolean xyzMiddle(String str)
    {
        printUtility.printString(str);

        if(str.length() < 3)
            return false;

        int s1 = str.length() / 2 - 2;
        int s2 = str.length() / 2 - 1;

        if(str.length() % 2 == 0)
        {
            return str.substring(s1,s1 + 3).equals("xyz") || str.substring(s2,s2+3).equals("xyz");
        }

        return str.substring(s2,s2+3).equals("xyz");

    }

}
