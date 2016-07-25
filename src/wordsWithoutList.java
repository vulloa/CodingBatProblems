import java.util.*;

/**
 * Created by ulloav on 7/25/2016.
 */
public class wordsWithoutList {

    public static List wordsWithoutList(String[] words, int len)
    {
        List<String> newList = new ArrayList<String>();

        printUtilities.printStringArray(words);
        System.out.println("length: " + len);

        for(int i = 0; i < words.length; i++)
        {
            if(words[i].length() != len)
                newList.add(words[i]);
        }

        return newList;
    }
}
