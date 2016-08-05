package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class powerN {

    public static int powerN(int base, int n)
    {
        if(n == 0)
            return 1;

        return base * powerN(base,n - 1);
    }

}
