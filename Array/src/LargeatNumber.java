class Solution {

    public static void main(String args[]) {

        int[] nums = {43, 87, 21, 86, 33, 90};

        int largest = largestElement(nums);

        System.out.println("Largest Element = " + largest);
    }

    public static int largestElement(int[] nums) {

        int max = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] > max) {

                max = nums[i];
            }
        }

        return max;
    }
}