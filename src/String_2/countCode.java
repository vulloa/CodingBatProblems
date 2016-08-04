package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class countCode {

    public static int countCode(String str)
    {
        int count = 0;

        printUtility.printString(str);

        for(int i = 0; i < str.length() - 3; i++)
        {
            if(str.substring(i,i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }

        return count;
    }

}
