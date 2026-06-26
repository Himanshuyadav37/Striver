public class maxSubArraySum {

    public static void pairSubArray(int[] arr) {

        int totalSubArray = 0;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {

            int start = i;

            for (int j = i; j < arr.length; j++) {

                int end = j;

                    currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
                System.out.println("currSum : "+ currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                   
                }
            } 
        }
         System.out.println("maxSum : " + maxSum);
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 6, -1, 3};

        pairSubArray(arr);
    }
}


// TC - ncube

