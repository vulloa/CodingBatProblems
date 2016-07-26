package AP_1;

/**
 * Created by ulloav on 7/25/2016.
 */
public class copyEvens {

    public static int[] copyEvens(int[] nums, int count)
    {
        int[] evens = new int[count];
        int x = 0;

        printUtilities.printIntArray(nums);
        printUtilities.printInt(count);

        for(int i = 0; x < count; i++)
        {
            if(nums[i] % 2 == 0)
            {
                evens[x] = nums[i];
                x++;
            }

        }

        return evens;
    }

}
