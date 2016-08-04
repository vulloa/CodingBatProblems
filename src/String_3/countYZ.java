package String_3;

/**
 * Created by ulloav on 8/4/2016.
 */
public class countYZ {

    public static int countYZ(String str)
    {
        int count = 0;
        String lowercaseString = str.toLowerCase().trim();

        //  if string is 0 then 0
        if(str.length() == 0)
            return 0;

        for(int i = 0; i < lowercaseString.length() - 1; i++)
        {
            if(((lowercaseString.charAt(i)) == 'y' || lowercaseString.charAt(i) == 'z') && !Character.isLetter(lowercaseString.charAt(i + 1)))
                count++;

            //System.out.print("i: " + i + " ");
            //printUtility.printChar(lowercaseString.charAt(i));
        }

        if(lowercaseString.charAt(lowercaseString.length() - 1) == 'y' ||lowercaseString.charAt(lowercaseString.length() - 1) == 'z')
            count++;


        return count;
    }

}
