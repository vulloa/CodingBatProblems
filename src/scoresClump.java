/**
 * Created by ulloav on 7/25/2016.
 */
public class scoresClump {

    public static boolean scoresClump(int[] scores)
    {
        printUtilities.printIntArray(scores);

        for(int i = 0; i <= scores.length - 3; i++)
        {
            if((scores[i + 2] - scores[i]) <= 2)
                return true;
        }

        return false;
    }

}
