public class ArraySorted {

    public boolean isSorted(int arr[]) {

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {

                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {

        ArraySorted a = new ArraySorted();

        int arr[] = {1, 2, 3, 4, 5};

        System.out.println(a.isSorted(arr));
    }
}