/**
 * Created by ulloav on 7/25/2016.
 */
public class dividesSelf {

    public static boolean dividesSelf(int n)
    {
        printUtilities.printInt(n);

        for(int x = n; x != 0; x /= 10)
        {
           int y = x % 10;
            System.out.println("values: [x = " + x + " ], "  + n + " % 10 = " + y );

            if(y == 0 || n % y != 0)
                return false;
        }

        return true;
    }

}
