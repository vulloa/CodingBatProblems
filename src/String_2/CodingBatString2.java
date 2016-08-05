package String_2;

/**
 * Created by ulloav on 7/25/2016.
 */
public class CodingBatString2 {

    public CodingBatString2(){
        System.out.println("CodingBat String-2");
        System.out.println("Complete 26 out of 21 Exercises.\n");

        /// doubleChar ///
        System.out.println("\n/// doubleChar ///");

        String doubleCharString = "The";
        //String doubleCharString = "AAbb";
        //String doubleCharString = "Hi-There";

        System.out.println("doubleChar: " + doubleChar.doubleChar(doubleCharString));

        ///  ///
        System.out.println("\n/// countHi ///");

        //String countHiString = "abc hi ho";
        //String countHiString = "ABChi hi";
        String countHiString = "hihi";

        System.out.println("countHi: " + countHi.countHi(countHiString));

        ///  ///
        System.out.println("\n/// catDog ///");

        String catDogString = "catdog";
        //String catDogString = "catcat";
        //String catDogString = "1cat1cadodog";

        System.out.println("catDog: " + catDog.catDog(catDogString));

        /// countCode ///
        System.out.println("\n/// countCode ///");

        //String countCodeString = "aaacodebbb";
        String countCodeString = "codexxcode";
        //String countCodeString = "cozexxcope";

        System.out.println("countCode: " + countCode.countCode(countCodeString));

        /// endOther ///
        System.out.println("\n/// endOther ///");

        String endOtherString[] = {"Hiabc","abc"};
        //String endOtherString[] = {"AbC","HiaBc"};
        //String endOtherString[] = {"abc","abXabc"};

        System.out.println("endOther: " + endOther.endOther(endOtherString[0],endOtherString[1]));

        /// xyzThere ///
        System.out.println("\n/// xyzThere ///");

        //String xyzThereString = "abcxyz";
        String xyzThereString = "abc.xyz";
        //String xyzThereString = "xyz.abc";
        //String xyzThereString = "xyz";

        System.out.println("xyzThere: " + xyzThere.xyzThere(xyzThereString));

        /// bobThere ///
        System.out.println("\n/// bobThere ///");

        String bobThereString = "abcbob";
        //String bobThereString = "b9b";
        //String bobThereString = "bac";

        System.out.println("bobThere: " + bobThere.bobThere(bobThereString));


        /// xyBalance ///
        System.out.println("\n/// xyBalance ///");

        //String xyBalanceString = "aaxbby";
        //String xyBalanceString = "aaxbb";
        //String xyBalanceString = "yaaxbb";
        String xyBalanceString = "aaxbby";

        System.out.println("xyBalance: " + xyBalance.xyBalance(xyBalanceString));

        /// mixString ///
        System.out.println("\n/// mixString ///");

        String mixStringA[] = {"abc","xyz"};
        //String mixStringA[] = {"Hi","There"};
        //String mixStringA[] = {"xxxx","There"};

        System.out.println("mixString: " + mixString.mixString(mixStringA[0],mixStringA[1]));


        /// repeatEnd ///
        System.out.println("\n/// repeatEnd ///");

        String repeatEndString = "Hello";
        int repeatEndInt = 3;
        //int repeatEndInt = 2;
        //int repeatEndInt = 1;

        System.out.println("repeatEnd: " + repeatEnd.repeatEnd(repeatEndString,repeatEndInt));

        /// repeatFront ///
        System.out.println("\n/// repeatFront ///");

        String repeatFrontString = "Chocolate";
        //String repeatFrontString = "Ice Cream";
        int repeatFrontInt = 4;
        //int repeatFrontInt = 3;
        //int repeatFrontInt = 2;

        System.out.println("repeatFront:" + repeatFront.repeatFront(repeatFrontString,repeatFrontInt));

        /// repeatSeperator ///
        System.out.println("\n/// repeatSeperator ///");

        String repeatSeperatorString[] = {"Word","X"};
        //String repeatSeperatorString[] = {"This","And"};
        int repeatSeperatorInt = 3;
        //int repeatSeperatorInt = 2;
        //int repeatSeperatorInt = 1;

        System.out.println("repeatSeperator: " + repeatSeperator.repeatSeperator(repeatSeperatorString[0],repeatSeperatorString[1],repeatSeperatorInt));

        /// prefixAgain ///
        System.out.println("\n/// prefixAgain ///");

        String prefixAgainString = "abXYabc";
        int prefixAgainInt = 1;
        //int prefixAgainInt = 2;
        //int prefixAgainInt = 3;

        System.out.println("prefixAgain: " + prefixAgain.prefixAgain(prefixAgainString,prefixAgainInt));

        /// xyzMiddle ///
        System.out.println("\n/// xyzMiddle ///");

        String xyzMiddleString = "AAxyzBB";
        //String xyzMiddleString = "AxyzBB";
        //String xyzMiddleString = "AxyzBBB";

        System.out.println("xyzMiddle: " + xyzMiddle.xyzMiddle(xyzMiddleString));

        /// getSandwich ///
        System.out.println("\n/// getSandwich ///");

        String getSandwichString = "breadjambread";
        //String getSandwichString = "xxbreadjambreadyy";
        //String getSandwichString = "xxbreadyy";

        System.out.println("getSandwich: " + getSandwich.getSandwich(getSandwichString));

        /// sameStarChar ///
        System.out.println("\n/// sameStarChar ///");

        String sameStarCharString = "xy*yzz";
        //String sameStarCharString = "xy*zzz";
        //String sameStarCharString = "*xa*az";

        System.out.println("sameStarChar: " + sameStarChar.sameStarChar(sameStarCharString));

    }

}
