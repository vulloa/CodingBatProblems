package Recursion_1;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class printUtility {

    public static void printString(String s)
    {
        System.out.print("\n" + s + "\n\n");
    }

    public static void printStringNoNewLine(String s)
    {
        System.out.print(s + "\n");
    }

    public static void printInt(int i)
    {
        System.out.print("\n" + i + "\n");
    }

    public static void printIntArray(int ints[])
    {
        System.out.println();

        for(int i = 0; i < ints.length; i++)
            System.out.print(ints[i] + " ");

        System.out.println("\n");
    }
}
