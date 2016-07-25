/**
 * Created by ulloav on 7/25/2016.
 */
public class printUtilities {

    public static void printIntArray(int ints[])
    {
        for(int a : ints)
            System.out.print(a + " ");

        System.out.println();
    }

    public static void printStringArray(String strings[])
    {
        for(String a : strings)
            System.out.print(a + " ");

        System.out.println();
    }

    public static void printInt(int x)
    {
        System.out.println("num: " + x);
    }

    public static void printString(String x)
    {
        System.out.println("String: " + x);
    }

}
