public class LeftRotateArrByK {

    public static void RotateArray(int[] nums, int k ){

        int n = nums.length;

        // Handle k greater than array size
        k = k % n;

        // Step 1: Store first k elements
        int[] temp = new int[k];

        for(int i = 0; i < k; i++){
            temp[i] = nums[i];
        }

        // Step 2: Shift remaining elements to left
        for(int i = k; i < n; i++){
            nums[i-k] = nums[i];
        }

        // Step 3: Put temp elements at end
        for(int i = 0; i < k; i++){
            nums[n-k+i] = temp[i];
        }
    }

    public static void main(String args[]){

        int[] nums = {1,2,3,4,5};
        int k = 2;

        // Direct function call
        RotateArray(nums, k);

        // Print array
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}