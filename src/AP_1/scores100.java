package AP_1;

/**
 * Created by ulloav on 7/25/2016.
 */
public class scores100 {

    public static boolean scores100(int[] scores)
    {
        boolean flag= false;

        printUtilities.printIntArray(scores);

        for(int i = 0; i < scores.length - 1; i++)
        {
            if(scores[i] == 100 && scores[i + 1] == 100)
            {
                flag = true;
                break;
            }
        }

        return flag;
    }

}
