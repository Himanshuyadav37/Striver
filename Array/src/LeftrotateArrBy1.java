public class LeftrotateArrBy1 {

    public static void RotateByOne(int[] arr) {

        // Store first element
        int temp = arr[0];

        // Shift elements to left
        for(int i = 0; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];
        }

        // Put first element at last
        arr[arr.length - 1] = temp;
    }

    public static void main(String args[]) {

        int[] arr = {1, 32, 54, 0};

        RotateByOne(arr);

        for(int num : arr) {

            System.out.print(num + " ");
        }
    }
}