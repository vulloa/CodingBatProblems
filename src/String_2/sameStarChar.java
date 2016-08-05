package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class sameStarChar {

    public static boolean sameStarChar(String str)
    {
        printUtility.printString(str);

        for(int i = 1; i < str.length() - 1; i++)
        {
            if(str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;
        }

        return true;
    }

}
