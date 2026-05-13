class RemoveDuplicate {

    // Static method
    public static int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[i] != nums[j]) {

                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String args[]) {

        int[] nums = {0, 0, 3, 3, 5, 6};

        // Direct method call
        int result = removeDuplicates(nums);

        System.out.println("Total Unique Elements: " + result);

        System.out.print("Updated Array: ");

        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}