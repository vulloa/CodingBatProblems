package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class repeatEnd {

    public static String repeatEnd(String str, int n)
    {
        printUtility.printString(str);
        printUtility.printInt(n);

        String s = "";

        for(int i = 0; i < n; i++)
        {
            s += str.substring(str.length() - n);
        }

        return s;
    }

}
