package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class catDog {

    public static boolean catDog(String str)
    {
        int catCount = 0;
        int dogCount = 0;

        printUtility.printString(str);

        for(int i = 0; i < str.length() - 2; i++)
        {
            if(str.substring(i,i + 3).equals("cat"))
                catCount++;

            if(str.substring(i,i + 3).equals("dog"))
                dogCount++;
        }

        return (catCount == dogCount);
    }

}
