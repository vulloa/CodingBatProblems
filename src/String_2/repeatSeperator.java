package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class repeatSeperator {

    public static String repeatSeperator(String word, String sep, int count)
    {
        printUtility.printStringNoNewLine(word);
        printUtility.printStringNoNewLine(sep);
        printUtility.printInt(count);

        StringBuffer s = new StringBuffer();

        if(count == 0)
            return "";

        for(int i = 0; i < count - 1; i++)
        {
            s.append(word);
            s.append(sep);
        }

        s.append(word);

        return s.toString();
    }

}
