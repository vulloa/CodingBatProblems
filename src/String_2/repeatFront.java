package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class repeatFront {

    public static String repeatFront(String str, int n)
    {
        printUtility.printString(str);
        printUtility.printInt(n);

        StringBuffer s = new StringBuffer();

        for(int i = 0; i < n; i++)
        {
            s.append(str.substring(0,n - i));
        }

        return s.toString();
    }

}
