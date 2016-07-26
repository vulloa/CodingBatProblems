package AP_1;

/**
 * Created by ulloav on 7/25/2016.
 */
public class wordsCount {

    public static int wordsCount(String[] words, int len)
    {
        int count = 0;

        printUtilities.printStringArray(words);
        System.out.println("length: " + len);

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == len) {
                count++;
            }
        }

        return count;
    }

}
