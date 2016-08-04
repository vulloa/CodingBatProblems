package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class doubleChar {

    public static String doubleChar(String str)
    {
        String str2 = "";

        printUtility.printString(str);

        for(int i = 0; i < str.length(); i++)
        {
            for(int j = 0; j < 2; j++) {
                str2 += str.substring(i, i + 1);
            }
        }

        return str2;
    }

}
