package AP_1;

/**
 * Created by ulloav on 7/25/2016.
 */
public class wordsWithout {

    public static String[] wordsWithout(String[] words, String target)
    {
        int count = 0;

        printUtilities.printStringArray(words);
        printUtilities.printString(target);

        for(int i = 0; i < words.length; i++)
        {
            if(words[i].equals(target))
                count++;
        }

        int newLength = words.length - count;
        int x = 0;
        String[] newArray = new String[newLength];

        for(int i = 0; x < newLength; i++)
        {
            if(!words[i].equals(target))
            {
                newArray[x] = words[i];
                x++;
            }
        }

        return newArray;

    }

}
