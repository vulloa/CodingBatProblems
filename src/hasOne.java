/**
 * Created by ulloav on 7/25/2016.
 */
public class hasOne {

    public static boolean hasOne(int n)
    {
        printUtilities.printInt(n);

        while(n != 0)
        {
            if(n % 10 == 1)
                return true;

            n /= 10;
        }

        return false;
    }

}
