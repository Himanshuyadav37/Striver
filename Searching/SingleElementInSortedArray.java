public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums){
        int low = 0;
        int high = nums.length-1;

        while(low<high){
            int mid = low + (high - low) /2;

            // make mid even
            if(mid % 2 == 1){
                mid--;
            }

            //pair is correct
            if(nums[mid] == nums[mid+1]){
                low = mid + 2;
            }

            // single element  on left side

            else{
                high = mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7};

        int result = singleNonDuplicate(nums);

        System.out.println("Single Element: " + result);
    }
}
