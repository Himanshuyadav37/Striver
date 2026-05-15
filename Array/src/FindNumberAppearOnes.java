public class FindNumberAppearOnes {
    public static int findNumberAppearOnes(int[] nums){
        int ans = 0;

        for(int  i =0; i<nums.length;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static void main(String args[]){
        int[] nums = {1,2,1,3,2,4,4};

        System.out.print(findNumberAppearOnes(nums));
    }
}
