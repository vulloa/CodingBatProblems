package Recursion_1;

/**
 * Created by ulloav on 7/25/2016.
 */
public class CodingBatRecursion1 {

    public CodingBatRecursion1()
    {
        System.out.println("CodingBat Recursion-1");
        System.out.println("Complete 25 out of 30 Exercises.\n");

        /// factorial ///
        System.out.println("\n/// factorial ///");

        //int factorialInt = 1;
        //int factorialInt = 2;
        int factorialInt = 6;

        printUtility.printInt(factorialInt);
        System.out.println("factorial: " + factorial.factorial(factorialInt));

        /// bunnyEars ///
        System.out.println("\n/// bunnyEars ///");

        //int bunnyEarsInt = 0;
        //int bunnyEarsInt = 2;
        int bunnyEarsInt = 4;

        printUtility.printInt(bunnyEarsInt);
        System.out.println("bunnyEars: " + bunnyEars.bunnyEars(bunnyEarsInt));

        /// fibonacci ///
        System.out.println("\n/// fibonacci ///");

        //int fibonacciInt = 0;
        //int fibonacciInt = 1;
        //int fibonacciInt = 2;
        int fibonacciInt = 5;

        printUtility.printInt(fibonacciInt);
        System.out.println("fibonacci: " + fibonacci.fibonacci(fibonacciInt));

        /// bunnyEars2  ///
        System.out.println("\n/// bunnyEars2  ///");

        //int bunnyEarsTwoInt = 0;
        int bunnyEarsTwoInt = 1;
        //int bunnyEarsTwoInt = 2;

        printUtility.printInt(bunnyEarsTwoInt);
        System.out.println("bunnyEars2: " + bunnyEars.bunnyEars2(bunnyEarsTwoInt));

        /// triangle ///
        System.out.println("\n/// triangle ///");

        //int triangleInt = 0;
        //int triangleInt = 1;
        int triangleInt = 2;

        printUtility.printInt(triangleInt);
        System.out.println("triangle: " + triangle.triangle(triangleInt));

        /// sumDigits ///
        System.out.println("\n/// sumDigits ///");

        //int sumDigitsInt = 126;
        int sumDigitsInt = 49;
        //int sumDigitsInt = 12;

        printUtility.printInt(sumDigitsInt);
        System.out.println("sumDigits: " + sumDigits.sumDigits(sumDigitsInt) );

        /// count7 ///
        System.out.println("\n/// count7 ///");

        int count7Int = 717;
        //int count7Int = 7;
        //int count7Int = 123;

        printUtility.printInt(count7Int);
        System.out.println("count7: " + count7.count7(count7Int));

        ///  ///
        System.out.println("\n/// count8 ///");

        //int count8Int = 8;
        //int count8Int = 818;
        int count8Int = 8818;

        printUtility.printInt(count8Int);
        System.out.println("count8: " + count8.count8(count8Int));

        ///  ///
        System.out.println("\n/// powerN ///");

        int powerNIntOne = 3;
        //int powerNIntTwo = 1;
        //int powerNIntTwo = 2;
        int powerNIntTwo = 3;

        printUtility.printInt(powerNIntOne);
        System.out.println("powerN: " + powerN.powerN(powerNIntOne,powerNIntTwo));

        /// countX ///
        System.out.println("\n/// countX ///");

        //String countXString = "xxhixx";
        String countXString = "xhixhix";
        //String countXString = "hi";

        printUtility.printString(countXString);
        System.out.println("countX: " + countX.countX(countXString));

        ///  ///
        System.out.println("\n/// countHi ///");

        //String countHiString = "xxhixx";
        String countHiString = "xhixhix";
        //String countHiString = "hi";

        printUtility.printString(countHiString);
        System.out.println("countHi: " + countHi.countHi(countHiString));

        /// changeXY ///
        System.out.println("\n/// changeXY ///");

        //String changeXYString = "codex";
        String changeXYString = "xxhixx";
        //String changeXYString = "xhixhix";

        printUtility.printString(changeXYString);
        System.out.println("changeXY: " + changeXY.changeXY(changeXYString));

        /// changePi ///
        System.out.println("\n/// changePi ///");

        String changePiString = "xpix";
        //String changePiString = "pipi";
        //String changePiString = "pip";

        printUtility.printString(changePiString);
        System.out.println("changePi: " + changePi.changePi(changePiString));

        /// noX ///
        System.out.println("\n/// noX ///");

        String noXString = "xaxb";
        //String noXString = "abc";
        //String noXString = "";

        printUtility.printString(noXString);
        System.out.println("noX: " + noX.noX(noXString));

        ///  ///
        System.out.println("\n/// array6 ///");

        int array6Ints[] = {1,6,4};
        //int array6Ints[] = {1,4};
        //int array6Ints[] = {6};
        int array6index = 0;

        printUtility.printIntArray(array6Ints);
        System.out.println("array6: " + array6.array6(array6Ints,array6index));

        ///  ///
        System.out.println("\n/// array11 ///");

        int array11Ints[] = {1,2,11};
        //int array11Ints[] = {11,11};
        //int array11Ints[] = {1,2,3,4};
        int array11index = 0;

        printUtility.printIntArray(array11Ints);
        System.out.println("array11: " + array11.array11(array11Ints,array11index));

        ///  ///
        System.out.println("\n/// array220 ///");

        int array220Ints[] = {1,2,20};
        //int array220Ints[] = {3,30};
        //int array220Ints[] = {3};
        int array220Index = 0;

        printUtility.printIntArray(array220Ints);
        System.out.println("array220: " + array220.array220(array220Ints,array220Index));

        ///  ///
        System.out.println("\n///  ///");

        System.out.println("");

        ///  ///
        System.out.println("\n///  ///");

        System.out.println("");

        ///  ///
        System.out.println("\n///  ///");

        System.out.println("");

        ///  ///
        System.out.println("\n///  ///");

        System.out.println("");

        ///  ///
        System.out.println("\n///  ///");

        System.out.println("");

        ///  ///
        System.out.println("\n///  ///");

        System.out.println("");

        ///  ///
        System.out.println("\n///  ///");

        System.out.println("");

        ///  ///
        System.out.println("\n///  ///");

        System.out.println("");

    }

}
