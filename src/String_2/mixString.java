package String_2;

/**
 * Created by UlloaV on 8/4/2016.
 */
public class mixString {

    public static String mixString(String a, String b)
    {
        char[] temp;
        String end;
        int index = 0;

        printUtility.printStringNoNewLine("\n" + a);
        printUtility.printStringNoNewLine(b + "\n");

        if(a.length() < b.length())
        {
            temp = new char[ 2 * a.length()];
            end = b.substring(a.length());
        }
        else
        {
            temp = new char[2 * b.length()];
            end = a.substring(b.length());
        }

        for(int i = 0; i < temp.length / 2; i++)
        {
            temp[index] = a.charAt(i);
            index++;
            temp[index] = b.charAt(i);
            index++;
        }

        return new String(temp) + end;
    }

}
