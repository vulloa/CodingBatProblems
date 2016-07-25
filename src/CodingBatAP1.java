import java.util.*;

/**
 * Created by ulloav on 7/25/2016.
 */
public class CodingBatAP1
{

    public static void main(String[] args)
    {
        /// scoresIncreasing ///
        System.out.println("\n/// scoresIncreasing ///");

        //int scoresIncreasingInt[] = {1,3,4};
        //int scoresIncreasingInt[] = {1,3,2};
        //int scoresIncreasingInt[] = {1,1,4};
        int scoresIncreasingInt[] = {1,1,2,4,3,7};

        System.out.println("scoresIncreasing : " + scoresIncreasing.scoresIncreasing(scoresIncreasingInt));


        /// scores100 ///
        System.out.println("\n/// scores100 ///");

        //int scores100Int[] = {1,100,100};
        //int scores100Int[] = {1,100,99,100};
        int scores100Int[] = {100,1,100,100};

        System.out.println("scores 100 : " + scores100.scores100(scores100Int));


        /// scoresClump ///
        System.out.println("\n/// scoresClump ///");

        //int scoresClumpInt[] = {3,4,5};
        //int scoresClumpInt[] = {3,4,6};
        int scoresClumpInt[] = {1,3,5,5};

        System.out.println("scoresClump: " + scoresClump.scoresClump(scoresClumpInt));


        /// scoresAverage ///
        System.out.println("\n/// scoresAverage ///");

        //int scoresAverageInt[] = {2,2,4,4};
        int scoresAverageInt[] = {4,4,4,2,2,2};
        //int scoresAverageInt[] = {3,4,5,1,2,3};
        //int scoresAverageInt[] = {5,6};

        System.out.println("scoresAverage: " + scoresAverage.scoresAverage(scoresAverageInt));


        /// wordsCount ///
        System.out.println("\n/// wordsCount ///");

        String wordsCountStrings[] = {"a","bb","b","ccc"};
        int wordsCountLength = 1;
        //int wordsCountLength = 3;
        //int wordsCountLength = 4;

        System.out.println("wordsCount: " + wordsCount.wordsCount(wordsCountStrings,wordsCountLength));


        /// wordsFront ///
        System.out.println("\n/// wordsFront ///");

        String wordsFrontString [] = {"a","b","c","d"};
        //int wordsFrontn = 1;
        //int wordsFrontn = 2;
        int wordsFrontn = 3;

        String y[] = wordsFront.wordsFront(wordsFrontString,wordsFrontn);

        for(String s : y)
            System.out.println("wordsFront: " + s);


        /// wordsWithoutList ///
        System.out.println("\n/// wordsWithoutList ///");

        String wordsWithoutListString[] = {"a","bb","b","ccc"};
        int wordsWithoutListn = 1;
        //int wordsWithoutListn = 3;
        //int wordsWithoutListn = 4;

        List<String> wordsWithoutListNew = new ArrayList<String>();
        wordsWithoutListNew.addAll(wordsWithoutList.wordsWithoutList(wordsWithoutListString,wordsWithoutListn));

        for(String z : wordsWithoutListNew)
            System.out.println("wordsWithoutList: " + z);


        /// hasOne ///
        System.out.println("\n/// hasOne ///");

        int hasOneNum = 10;
        //int hasOneNum = 22;
        //int hasOneNum = 220;

        System.out.println("hasOne: " + hasOne.hasOne(hasOneNum));

        /// divesSelf ///
        System.out.println("\n/// divesSelf ///");


    }

}
