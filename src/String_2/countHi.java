package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class countHi {

    public static int countHi(String str)
    {
        int count = 0;

        printUtility.printString(str);

        for(int i = 0; i < str.length() - 1; i++)
        {
            if(str.charAt(i) == 'h')
            {
                if(str.charAt(i + 1) == 'i')
                {
                    count++;
                }
            }
        }

        return count;
    }

}
