package Recursion_1;

/**
 * Created by ulloav on 8/5/2016.
 */
public class bunnyEars {

    public static int bunnyEars(int bunnies)
    {
        if(bunnies == 0)
            return 0;

        return 2 + bunnyEars(bunnies - 1);
    }

    public static int bunnyEars2(int bunnies)
    {
        if(bunnies == 0)
            return 0;

        if(bunnies % 2 == 1)
            return 2 + bunnyEars2(bunnies - 1);

        return 3 + bunnyEars2(bunnies - 1);
    }

}
