public class MinimumInSortedArray {
    public static int findMin(int nums[]){
        int low = 0;
        int high = nums.length-1;

        while(low < high){
            int mid = low + (high-low)/2;

            // if target is in right half
            if(nums[mid]  > nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, -7, 1, 2, 3};

        int result = findMin(nums);

        System.out.println("Minimum Element: " + result);
    }
}
