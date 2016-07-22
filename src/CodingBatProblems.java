/**
 * Created by ulloav on 7/20/2016.
 */
public class CodingBatProblems
{

    public static boolean scoresIncreasing(int scores[])
    {
        boolean flag = false;

        for(int i = 1; i < scores.length; i++)
        {
            System.out.println(scores[i] + " >= " + scores[i - 1] + " _ " + (scores[i] >= scores[i - 1]));
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

    public static boolean scores100(int[] scores)
    {
        boolean flag= false;

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

    public static int scoresAverage(int[] scores)
    {
        int average = 0;
        int end = scores.length/2;

        if(average(scores, 0,end) > average(scores, end + 1, scores.length))
            average = average(scores,0,end);
        else
            average = average(scores,end + 1, scores.length);

        return average;
    }

    public static int average(int[] scores, int start, int end)
    {
        int avg = 0;
        int length = end - start;

        if(length < 1)
            length = 1;

        System.out.println("start: " + start + "\nend: " + end);

        for(int i = start; i <= end; i++)
        {
            avg += scores[i];
            System.out.println("\tavg: " + scores[i]);
        }

        avg = avg/length;

        return avg;
    }

    public static void main(String[] args)
    {
        /// scoresIncreasing ///

        //int x[] = {1,3,4};
        //int x[] = {1,3,2};
        //int x[] = {1,1,4};
        //int x[] = {1,1,2,4,3,7};

        //System.out.println("scoresIncreasing results: " + scoresIncreasing(x));

        /// scores100 ///
        //int x[] = {1,100,100};
        //int x[] = {1,100,99,100};
        //int x[] = {100,1,100,100};

        //System.out.println("scores 100 results: " + scores100(x));

        /// scoresAverage ///
        //int x[] = {2,2,4,4};
        //int x[] = {4,4,4,2,2,2};
        //int x[] = {3,4,5,1,2,3};
        int x[] = {5,6};

        System.out.println("scoresAverage: " + scoresAverage(x));

    }

}
