public class LinearSearch {

    public static void linearSearch(int[] arr, int target){

        boolean found = false;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == target){

                System.out.println("Target found at index : " + i);

                found = true;
                break;
            }
        }

        if(found == false){

            System.out.println("Target value is not found!");
        }
    }

    public static void main(String args[]){

        int[] arr = {2,4,8,10,42};
        int target = 42;

        linearSearch(arr, target);
    }
}