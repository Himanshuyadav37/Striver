import java.util.Scanner;

public class ReverseWordInGivenString {

    public static String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0)
                break;

            int j = i;

            // Find start of current word
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // Add word to answer
            ans.append(s.substring(j + 1, i + 1));
            ans.append(" ");

            i = j;
        }

        return ans.toString().trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = reverseWords(s);

        System.out.println("Reversed Words: " + result);

        sc.close();
    }
}