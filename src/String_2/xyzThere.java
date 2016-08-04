package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class xyzThere {

    public static boolean xyzThere(String str)
    {
        str = str.toLowerCase().trim();

        printUtility.printString(str);

        if(str.length() >= 3 && str.substring(0,3).equals("xyz"))
            return true;

        for(int i = 1; i < str.length() - 2; i++)
        {
            if(str.substring(i,i+3).equals("xyz") && !(str.charAt(i - 1) == '.'))
                return true;
        }

        return false;
    }

}
