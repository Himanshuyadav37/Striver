public class SearchInRotatedArrayII {

    // Function to search target in rotated sorted array
    public static boolean search(int[] nums, int k) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Target found
            if (nums[mid] == k) {
                return true;
            }

            // Handle duplicates
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }

            // Left half is sorted
            else if (nums[low] <= nums[mid]) {

                // Target lies in left half
                if (k >= nums[low] && k < nums[mid]) {
                    high = mid - 1;
                }

                // Target lies in right half
                else {
                    low = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies in right half
                if (k > nums[mid] && k <= nums[high]) {
                    low = mid + 1;
                }

                // Target lies in left half
                else {
                    high = mid - 1;
                }
            }
        }

        // Target not found
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 7;

        boolean result = search(nums, k);

        System.out.println(result);
    }
}