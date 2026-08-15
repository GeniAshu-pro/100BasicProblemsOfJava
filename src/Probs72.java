import java.util.Scanner;

public class Probs72 {
    static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        int left = 0;
        int right = str.length() - 1;


        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(left) != str.charAt(right)) {
            return false ;
            }
            left++;
            right--;
        }
        return true;
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String here!!!");
            String str = sc.nextLine();
            System.out.println(isPalindrome(str) ? "is Palindrome" : "is Not a Palindrome ");
            sc.close();
        }

}
