package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class xyBalance {

    public static boolean xyBalance(String str)
    {
        printUtility.printString(str);
        str = str.toLowerCase();

        boolean yFlag = false;

        for(int i = str.length() - 1; i >= 0; i--)
        {
            if(str.charAt(i) == 'y')
                yFlag = true;

            if(str.charAt(i) == 'x' && !yFlag)
                return false;
        }

        return true;
    }

}
