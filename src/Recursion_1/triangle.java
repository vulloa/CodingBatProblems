package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class triangle {

    public static int triangle(int rows)
    {
        if(rows == 0)
            return 0;

        return rows + triangle(rows - 1);
    }

}
