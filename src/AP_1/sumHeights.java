package AP_1;

/**
 * Created by ulloav on 7/25/2016.
 */
public class sumHeights {

    public static int sumHeights(int[] heights, int start, int end) {

        int sum = 0;

        printUtilities.printIntArray(heights);
        printUtilities.printInt(start);
        printUtilities.printInt(end);

        for(int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
            System.out.println("\t" + sum);
        }

        return sum;

    }


}
