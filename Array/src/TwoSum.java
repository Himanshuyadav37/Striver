class TwoSumBrute {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] nums = {1, 6, 2, 10, 3};
        int target = 7;

        int[] ans = twoSum(nums, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}