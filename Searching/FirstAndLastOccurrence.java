class FirstAndLastOccurrence {

    // First Occurrence
    static int firstOccurrence(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        int ans = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {

                ans = mid;

                high = mid - 1;
            }

            else if (nums[mid] < target) {

                low = mid + 1;
            }

            else {

                high = mid - 1;
            }
        }

        return ans;
    }

    // Last Occurrence
    static int lastOccurrence(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        int ans = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {

                ans = mid;

                low = mid + 1;
            }

            else if (nums[mid] < target) {

                low = mid + 1;
            }

            else {

                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};

        int target = 5;

        int first = firstOccurrence(nums, target);

        int last = lastOccurrence(nums, target);

        System.out.println("[" + first + "," + last + "]");
    }
}