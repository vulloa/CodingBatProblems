package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class count7 {

    public static int count7(int n)
    {
        if(n == 0)
            return 0;

        if(n % 10 == 7)
            return 1 + count7(n/10);

        return count7(n/10);
    }

}
