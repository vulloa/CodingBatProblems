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
        int x[] = {100,1,100,100};

        System.out.println("scores 100 results: " + scores100(x));


    }

}
