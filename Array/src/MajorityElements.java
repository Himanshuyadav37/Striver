public class MajorityElements {
    public static int majorityElements(int[] nums){
        int count = 0;

        for(int  i =0; i<nums.length ; i++){
            for(int j = i+1 ; j< nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] nums = {1,2,3,1,1,1,1,4,5,6};

        System.out.print(majorityElements(nums));
    }
}
