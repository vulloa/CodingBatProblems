package Recursion_1;

/**
 * Created by ulloav on 8/5/2016.
 */
public class fibonacci {

    public static int fibonacci(int n)
    {
        //  base cases
        if(n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
