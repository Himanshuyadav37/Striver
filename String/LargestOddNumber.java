import java.util.Scanner;

public class LargestOddNumber {

    public static String largestOddNumber(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {

            int digit = s.charAt(i) - '0';

            if (digit % 2 == 1) {

                String ans = s.substring(0, i + 1);

                int start = 0;

                while (start < ans.length() && ans.charAt(start) == '0') {
                    start++;
                }

                return start == ans.length() ? "" : ans.substring(start);
            }
        }

        return "";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a numeric string: ");
        String s = sc.nextLine();

        String result = largestOddNumber(s);

        System.out.println("Largest Odd Number: " + result);

        sc.close();
    }
}