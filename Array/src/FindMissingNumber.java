public class FindMissingNumber {

        public static int findMissing(int[] nums) {

            int n = nums.length;

            for(int i = 0; i <= n; i++) {

                boolean found = false;

                for(int j = 0; j < n; j++) {

                    if(nums[j] == i) {

                        found = true;
                        break;
                    }
                }

                if(!found) {

                    return i;
                }
            }

            return -1;
        }

        public static void main(String args[]) {

            int[] nums = {1,3,6,4,2,5};

            System.out.println(findMissing(nums));
        }
    }

