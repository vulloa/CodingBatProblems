import java.util.*;

/**
 * Created by ulloav on 7/25/2016.
 */
public class CodingBatAP1
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

    public static boolean scoresClump(int[] scores)
    {
        for(int i = 0; i < scores.length - 3; i++)
        {
            if(scores[i + 2] - scores[i] <= 2)
                return true;
        }

        return false;
    }

    public static int scoresAverage(int[] scores)
    {
        int average = 0;
        int end = scores.length/2;

        if(average(scores, 0,end) > average(scores, end, scores.length))
            average = average(scores, 0, end);
        else
            average = average(scores, end, scores.length);

        return average;
    }

    public static int average(int[] scores, int start, int end)
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

    public static int wordsCount(String[] words, int len)
    {
        int count = 0;

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == len) {
                count++;
            }
        }

        return count;
    }

    public static String[] wordsFront(String[] words, int n)
    {
        String newWordsFront[] = new String[n];

        for(int i = 0; i < n; i++) {
            newWordsFront[i] = words[i];
        }

        return newWordsFront;
    }

    public static String[] wordsFront2(String[] words, int n)
    {
        String newWordsFront[] = new String[n];

        for(int i = 0; i < n; i++) {
            newWordsFront[i] = words[i];
        }

        return newWordsFront;
    }

    public static List wordsWithoutList(String[] words, int len)
    {
        List<String> newList = new ArrayList<String>();

        for(int i = 0; i < words.length; i++)
        {
            if(words[i].length() != len)
                newList.add(words[i]);
        }

        return newList;
    }

    public static void main(String[] args)
    {
        /// scoresIncreasing ///
        /*
        //int x[] = {1,3,4};
        //int x[] = {1,3,2};
        //int x[] = {1,1,4};
        int x[] = {1,1,2,4,3,7};

        System.out.println("scoresIncreasing results: " + scoresIncreasing(x));
        */

        /// scores100 ///
        /*
        //int x[] = {1,100,100};
        //int x[] = {1,100,99,100};
        int x[] = {100,1,100,100};

        System.out.println("scores 100 results: " + scores100(x));
        */

        /// scoresClump ///

        //int x[] = {3,4,5};
        //int x[] = {3,4,6};
        int x[] = {1,3,5,5};

        System.out.println("scoresClump: " + scoresClump(x));

        /// scoresAverage ///
        /*
        //int x[] = {2,2,4,4};
        int x[] = {4,4,4,2,2,2};
        //int x[] = {3,4,5,1,2,3};
        //int x[] = {5,6};

        System.out.println("scoresAverage: " + scoresAverage(x));
        */

        /// wordsCount ///
        /*
        String x[] = {"a","bb","b","ccc"};
        //int n = 1;
        //int n = 3;
        int n = 4;

        System.out.println("wordsCount: " + wordsCount(x,n));
        */

        /// wordsFront ///
        /*
        String x[] = {"a","b","c","d"};
        //int n = 1;
        //int n = 2;
        int n = 3;

        String y[] = wordsFront2(x,n);

        for(String s : y)
            System.out.println("wordsFront: " + s);
        */

        /// wordsWithoutList ///
        /*
        String x[] = {"a","bb","b","ccc"};
        int n = 1;
        //int n = 3;
        //int n = 4;

        List<String> y = new ArrayList<String>();
        y.addAll(wordsWithoutList(x,n));

        for(String z : y)
            System.out.println("wordsWithoutList: " + z);
        */

        /// hasOne ///



    }

}
