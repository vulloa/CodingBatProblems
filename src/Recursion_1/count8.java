package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class count8 {

    public static int count8(int n)
    {
        if(n == 0)
            return 0;

        if(n % 10 == 8) {
            if((n/10) % 10 == 8)
            return 2 + count8(n / 10);

            return 1 + count8(n / 10);
        }

        return count8(n/10);
    }

}
