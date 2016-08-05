package Recursion_1;

/**
 * Created by UlloaV on 8/5/2016.
 */
public class array220 {

    public static boolean array220(int[] nums, int index)
    {
        if(index >= nums.length - 1)
            return false;

        return nums[index + 1] == 10 * nums[index] || array220(nums,index + 1);
    }

}
