package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class array11 {

    public static int array11(int[] nums, int index)
    {
        if(index >= nums.length)
            return 0;

        if(nums[index] == 11)
            return 1 + array11(nums, index + 1);

        return array11(nums, index + 1);
    }

}
