/**
 * Created by ulloav on 7/25/2016.
 */
public class matchUp {

    public static int matchUp(String[] a, String[] b)
    {
        int count = 0;

        printUtilities.printStringArray(a);
        printUtilities.printStringArray(b);

        if(a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if(a[i].length() > 0 && b[i].length() > 0 && a[i].charAt(0) == b[i].charAt(0))
                {
                    System.out.println("a[i]: " + a[i] + " , b[i]: " + b[i]);
                    count++;
                }
            }
        }

        return count;
    }

}
