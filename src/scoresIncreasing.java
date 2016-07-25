/**
 * Created by ulloav on 7/25/2016.
 */
public class scoresIncreasing {

    public static boolean scoresIncreasing(int scores[])
    {
        boolean flag = false;

        printUtilities.printIntArray(scores);

        for(int i = 1; i < scores.length; i++)
        {
            //System.out.println(scores[i] + " >= " + scores[i - 1] + " _ " + (scores[i] >= scores[i - 1]));

            if(scores[i] >= scores[i - 1])
            {
                flag = true;
            }
            else
            {
                flag = false;
                break;
            }
        }

        return flag;
    }

}
