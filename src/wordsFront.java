/**
 * Created by ulloav on 7/25/2016.
 */
public class wordsFront {

    public static String[] wordsFront(String[] words, int n)
    {
        String newWordsFront[] = new String[n];

        printUtilities.printStringArray(words);
        System.out.println("length: " + n);

        for(int i = 0; i < n; i++) {
            newWordsFront[i] = words[i];
        }

        return newWordsFront;
    }

}
