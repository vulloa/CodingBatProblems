package AP_1;

/**
 * Created by ulloav on 7/25/2016.
 */
public class scoresSpecial {

    public static int scoresSpecial(int[] a, int[] b)
    {
        printUtilities.printIntArray(a);
        printUtilities.printIntArray(b);
        return highestSpecialScore(a) + highestSpecialScore(b);
    }

    private static int highestSpecialScore(int[] x)
    {
        int highestSpecialScore = 0;

        for(int i = 0; i < x.length; i++)
        {
            if((x[i] > highestSpecialScore) && (x[i] % 10 == 0))
            {
                highestSpecialScore = x[i];
            }
        }

        return highestSpecialScore;
    }

}
