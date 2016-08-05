package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class bobThere {

    public static boolean bobThere(String str)
    {
        str = str.toLowerCase();

        printUtility.printString(str);

        for(int i = 0; i < str.length() - 2; i++)
        {
            if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                return true;
        }

        return false;
    }

}
