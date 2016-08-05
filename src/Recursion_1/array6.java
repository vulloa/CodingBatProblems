package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class array6 {

    public static boolean array6(int[] nums, int index)
    {
        if(index >= nums.length)
            return false;

        return (nums[index] == 6 || array6(nums,index + 1));
    }

}
