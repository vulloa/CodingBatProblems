package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class prefixAgain {

    public static boolean prefixAgain(String str, int n)
    {
        printUtility.printString(str);
        printUtility.printInt(n);

        String p = str.substring(0,n);

        for(int i = n; i <= str.length() - n; i++)
        {
            if(str.substring(i,i+n).equals(p))
                return true;
        }

        return false;
    }

}
