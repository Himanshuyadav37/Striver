public class PeakElement {
     // Function to find peak element index
    public static int findPeakElement(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // We are in increasing slope
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }

            // We are in decreasing slope
            else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 5, 6, 4};

        int peakIndex = findPeakElement(arr);

        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element: " + arr[peakIndex]);
    }
}
