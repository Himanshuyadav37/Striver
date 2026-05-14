public class MoveZeroTOEnd {

    public static void moveZeroes(int[] nums){

        int j = 0;

        // Move non-zero elements forward
        for(int i = 0; i < nums.length; i++){

            if(nums[i] != 0){

                nums[j] = nums[i];
                j++;
            }
        }

        // Fill remaining positions with 0
        while(j < nums.length){

            nums[j] = 0;
            j++;
        }
    }

    public static void main(String args[]){

        int[] nums = {1,0,4,2,9,0,0,2,6};

        // Function call
        moveZeroes(nums);

        // Print array using for loop
        for(int i = 0; i < nums.length; i++){

            System.out.print(nums[i] + " ");
        }
    }
}