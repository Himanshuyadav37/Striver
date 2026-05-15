import java.util.Arrays;

public class SortNumber01 {
    public static void sortArray(int[] nums){
        Arrays.sort(nums);

        for(int i =0; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void  main(String args[]){
        int[] nums = {0,1,2,0,2,1};

        sortArray(nums);
    }
}
