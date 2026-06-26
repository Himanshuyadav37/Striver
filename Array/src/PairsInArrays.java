public class PairsInArrays {
    public static void pairArray(int[] arr){
        int totalPair = 0;

        for(int i =0 ; i<arr.length ; i++){
            int curr = arr[i];

            for(int j = i+1; j<arr.length; j++){
                System.out.print("("+ curr + "," + arr[j] + ")" );
                totalPair++;
            }
            System.out.println();

        }
        System.out.println("Total Pairs : " + totalPair);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        pairArray(arr);
    }    
}



//TC -> O(n2)