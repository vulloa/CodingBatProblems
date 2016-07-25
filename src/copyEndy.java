/**
 * Created by ulloav on 7/25/2016.
 */
public class copyEndy {

    public static int[] copyEndy(int[] nums, int count)
    {
        printUtilities.printIntArray(nums);
        printUtilities.printInt(count);

        int[] newArray = new int[count];
        int x = 0;

        for(int i = 0; x < count; i++)
        {
            if(isEndy(nums[i]))
            {
                newArray[x] = nums[i];
                x++;
            }
        }

        return newArray;
    }

    private static boolean isEndy(int n) {

        if ((n >= 0 && n <= 10) || (n >= 90 && n <= 100)) {
            return true;
        }

        return false;
    }


    }

