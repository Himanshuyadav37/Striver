import java.util.Scanner;

class LongestSubarrayWithSumK {

    public static int longestSubarray(int[] nums, int k) {

        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums = {10,5,2,1,7,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int k = sc.nextInt();

        System.out.println(longestSubarray(nums, k));
    }
}