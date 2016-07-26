package AP_1;

/**
 * Created by ulloav on 7/25/2016.
 */
public class scoresAverage {

    public static int scoresAverage(int[] scores)
    {
        int average = 0;
        int end = scores.length/2;

        printUtilities.printIntArray(scores);

        if(average(scores, 0,end) > average(scores, end, scores.length))
            average = average(scores, 0, end);
        else
            average = average(scores, end, scores.length);

        return average;
    }

    private static int average(int[] scores, int start, int end)
    {
        int avg = 0;
        int length = end - start;

        if(length < 1)
            length = 1;

        //System.out.println("start: " + start + "\nend: " + end);

        for(int i = start; i < end; i++)
        {
            avg += scores[i];
            //System.out.println("\tavg: " + scores[i]);
        }

        avg = avg/length;

        return avg;
    }

}
