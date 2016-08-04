package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class endOther {

    public static boolean endOther(String a, String b)
    {
        a = a.toLowerCase();
        b = b.toLowerCase();

        printUtility.printString(a);
        printUtility.printString(b);

        if(a.length() > b.length()) {
            if (a.substring(a.length() - b.length()).equals(b))
                return true;
        }
        else
        {
            if(b.substring(b.length() - a.length()).equals(a))
                return true;
        }

        return false;
    }

}
