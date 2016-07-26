package AP_1;

import java.util.*;

/**
 * Created by ulloav on 7/25/2016.
 */
public class CodingBatAP1
{

    public CodingBatAP1()
    {
        System.out.println("CodingBat A-1");
        System.out.println("Complete 16 out of 21 Exercises.\n");

        /// AP_1.scoresIncreasing ///
        System.out.println("\n/// AP_1.scoresIncreasing ///");

        //int scoresIncreasingInt[] = {1,3,4};
        //int scoresIncreasingInt[] = {1,3,2};
        //int scoresIncreasingInt[] = {1,1,4};
        int scoresIncreasingInt[] = {1,1,2,4,3,7};

        System.out.println("AP_1.scoresIncreasing : " + scoresIncreasing.scoresIncreasing(scoresIncreasingInt));


        /// AP_1.scores100 ///
        System.out.println("\n/// AP_1.scores100 ///");

        //int scores100Int[] = {1,100,100};
        //int scores100Int[] = {1,100,99,100};
        int scores100Int[] = {100,1,100,100};

        System.out.println("scores 100 : " + scores100.scores100(scores100Int));


        /// AP_1.scoresClump ///
        System.out.println("\n/// AP_1.scoresClump ///");

        //int scoresClumpInt[] = {3,4,5};
        //int scoresClumpInt[] = {3,4,6};
        int scoresClumpInt[] = {1,3,5,5};

        System.out.println("AP_1.scoresClump: " + scoresClump.scoresClump(scoresClumpInt));


        /// AP_1.scoresAverage ///
        System.out.println("\n/// AP_1.scoresAverage ///");

        //int scoresAverageInt[] = {2,2,4,4};
        int scoresAverageInt[] = {4,4,4,2,2,2};
        //int scoresAverageInt[] = {3,4,5,1,2,3};
        //int scoresAverageInt[] = {5,6};

        System.out.println("AP_1.scoresAverage: " + scoresAverage.scoresAverage(scoresAverageInt));


        /// AP_1.wordsCount ///
        System.out.println("\n/// AP_1.wordsCount ///");

        String wordsCountStrings[] = {"a","bb","b","ccc"};
        int wordsCountLength = 1;
        //int wordsCountLength = 3;
        //int wordsCountLength = 4;

        System.out.println("AP_1.wordsCount: " + wordsCount.wordsCount(wordsCountStrings,wordsCountLength));


        /// AP_1.wordsFront ///
        System.out.println("\n/// AP_1.wordsFront ///");

        String wordsFrontString [] = {"a","b","c","d"};
        //int wordsFrontn = 1;
        //int wordsFrontn = 2;
        int wordsFrontn = 3;

        String y[] = wordsFront.wordsFront(wordsFrontString,wordsFrontn);

        for(String s : y)
            System.out.println("AP_1.wordsFront: " + s);


        /// AP_1.wordsWithoutList ///
        System.out.println("\n/// AP_1.wordsWithoutList ///");

        String wordsWithoutListString[] = {"a","bb","b","ccc"};
        int wordsWithoutListn = 1;
        //int wordsWithoutListn = 3;
        //int wordsWithoutListn = 4;

        List<String> wordsWithoutListNew = new ArrayList<String>();
        wordsWithoutListNew.addAll(wordsWithoutList.wordsWithoutList(wordsWithoutListString,wordsWithoutListn));

        for(String z : wordsWithoutListNew)
            System.out.println("AP_1.wordsWithoutList: " + z);


        /// AP_1.hasOne ///
        System.out.println("\n/// AP_1.hasOne ///");

        int hasOneNum = 10;
        //int hasOneNum = 22;
        //int hasOneNum = 220;

        System.out.println("AP_1.hasOne: " + hasOne.hasOne(hasOneNum));

        /// AP_1.dividesSelf ///
        System.out.println("\n/// AP_1.dividesSelf ///");

        //int dividesSelfNum = 128;
        //int dividesSelfNum = 12;
        //int dividesSelfNum = 120;
        int dividesSelfNum = 32;

        System.out.println("AP_1.dividesSelf: " + dividesSelf.dividesSelf(dividesSelfNum));

        /// AP_1.copyEvens ///
        System.out.println("\n/// AP_1.copyEvens ///");

        //int copyEvenInt[] = {3,2,4,5,8};
        int copyEvenInt[] = {6,1,2,4,5,8};
        //int copyEvenNum = 2;
        int copyEvenNum = 3;

        int[] copiedEven = copyEvens.copyEvens(copyEvenInt,copyEvenNum);

        for(int ce : copiedEven)
            System.out.println("AP_1.copyEvens: " + ce);

        /// AP_1.copyEndy ///
        System.out.println("\n/// AP_1.copyEndy ///");

        int copyEndyInt[] = {9,11,90,22,6};
        //int copyEndyInt[] = {12,1,1,13,0,20};
        //int copyEndyNum = 2;
        int copyEndyNum = 3;

        int[] copiedEndy = copyEndy.copyEndy(copyEndyInt,copyEndyNum);

        for(int ce : copiedEndy)
            System.out.println("AP_1.copyEndy: " + ce);

        /// AP_1.matchUp ///
        System.out.println("\n/// AP_1.matchUp ///");

        String[] matchUpStringOne = {"aa","bb","cc"};
        //String[] matchUpStringTwo = {"aaa", "xx", "bb"};
        //String[] matchUpStringTwo = {"aaa", "b", "bb"};
        String[] matchUpStringTwo = {"", "", "ccc"};

        System.out.println("AP_1.matchUp: " + matchUp.matchUp(matchUpStringOne,matchUpStringTwo));

        /// AP_1.scoreUp ///
        System.out.println("\n/// AP_1.scoreUp ///");

        String[] scoreUpAnswers = {"a", "a", "b", "b"};
        //String[] scoreUpKeys = {"a", "c", "b", "c"};
        String[] scoreUpKeys = {"a", "a", "b", "c"};
        //String[] scoreUpKeys = {"a", "a", "b", "b"};

        System.out.println("AP_1.scoreUp: " + scoreUp.scoreUp(scoreUpAnswers,scoreUpKeys));

        /// AP_1.wordsWithout ///
        System.out.println("\n/// AP_1.wordsWithout ///");

        String[] wordsWithoutString = {"a", "b", "c", "a"};
        String wordsWithouts = "a";
        //String wordsWithouts = "b";
        //String wordsWithouts = "c";

        String[] newWordsWithout = wordsWithout.wordsWithout(wordsWithoutString,wordsWithouts);

        for(String ww : newWordsWithout)
            System.out.println("AP_1.wordsWithout: " + ww);

        /// AP_1.scoresSpecial ///
        System.out.println("\n/// AP_1.scoresSpecial ///");

        //int[] scoresSpecialA = {12,10,4};
        //int[] scoresSpecialB = {2,20,30};
        //int[] scoresSpecialA = {20,10,4};
        //int[] scoresSpecialB = {2,20,10};
        int[] scoresSpecialA = {12,11,4};
        int[] scoresSpecialB = {2,20,31};

        System.out.println("AP_1.scoresSpecial: " + scoresSpecial.scoresSpecial(scoresSpecialA,scoresSpecialB));

        /// AP_1.sumHeights ///
        System.out.println("\n/// AP_1.sumHeights ///");

        int[] sumHeightsInt = {5,3,6,7,2};
        int sumHeightsStart = 0;
        int sumHeightsEnd = 1;

        System.out.println("AP_1.sumHeights: " + sumHeights.sumHeights(sumHeightsInt,sumHeightsStart,sumHeightsEnd));

        /// sumHeights2 ///
        System.out.println("\n/// sumHeights2 ///");


        /// bigHeights ///
        System.out.println("\n/// bigHeights ///");


        /// userCompare ///
        System.out.println("\n/// userCompare ///");


        /// mergeTwo ///
        System.out.println("\n/// mergeTwo ///");


        /// commonTwo ///
        System.out.println("\n/// commonTwo ///");


    }

}
