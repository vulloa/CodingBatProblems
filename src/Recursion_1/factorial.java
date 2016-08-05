package Recursion_1;

/**
 * Created by ulloav on 8/5/2016.
 */
public class factorial {

    public static int factorial(int n)
    {
        if( n == 1)
            return 1;

        return n* factorial(n - 1);
    }

}
