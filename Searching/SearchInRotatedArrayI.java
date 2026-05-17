public class SearchInRotatedArrayI {

    // Function to search target element
    public static int search(int[] nums, int k) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // If target found
            if (nums[mid] == k) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[low] <= nums[mid]) {

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
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int k = 5;

        int result = search(nums, k);

        System.out.println("Index of target element: " + result);
    }
}