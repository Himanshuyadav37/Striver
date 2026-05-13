 class SecondLargest {

    public static int secondLargest(int arr[]) {

        int largest = arr[0];
        int second_largest = -1;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {

                second_largest = largest;
                largest = arr[i];
            }

            else if(arr[i] > second_largest && arr[i] != largest) {

                second_largest = arr[i];
            }
        }

        return second_largest;
    }

    public static void main(String args[]) {

        int arr[] = {43, 87, 21, 86, 33, 90};

        int ans = secondLargest(arr);

        System.out.println("Second Largest = " + ans);
    }
}