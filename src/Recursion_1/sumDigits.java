package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class sumDigits {

    public static int sumDigits(int n)
    {
        if(n == 0)
            return 0;

        return (n % 10) + sumDigits(n/10);
    }

}
