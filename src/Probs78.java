
import java.util.Scanner;



public class Probs78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String here");
        String str = sc.nextLine();
        System.out.println("Enter here the Old Character");
        char oldChar = sc.next().charAt(0);
        System.out.println("Enter here the New Character");
        char newChar = sc.next().charAt(0);
        char [ ] arr = str.toCharArray();

        for (int i = 0; i <str.length(); i++) {
            if (arr[i] == oldChar) {
                arr[i] = newChar;
            }
        }
        String newString = new String(arr);
        System.out.println("here is ur new string with replace character: " + newString);
        sc.close();
    }
}
