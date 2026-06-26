public class MaxSubArraySumOptimizedApp {

    public static void maxSubArraySumOp(int[] arr) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int prefix[] = new int[arr.length];

        // Prefix Array
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Find Maximum Sum
        for (int i = 0; i < arr.length; i++) {

            int start = i;

            for (int j = i; j < arr.length; j++) {

                int end = j;

                if (start == 0) {
                    currSum = prefix[end];
                } else {
                    currSum = prefix[end] - prefix[start - 1];
                }

                System.out.println("currSum : " + currSum);

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 6, -1, 3};

        maxSubArraySumOp(arr);
    }
}