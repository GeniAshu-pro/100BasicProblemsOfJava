import java.util.Scanner;

public class Probs17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character here !!");
        String input = sc.nextLine();
        if (input.length() != 1) {
            System.out.println("Invalid Input");
        } else {
            char c = input.charAt(0);
            if (isAlphabet(c)) {
                System.out.println("Entered  character is Alphabet: " + c);
            } else if (isDigit(c)) {
                System.out.println("Entered character is Digit: " + c);
            } else {
                System.out.println("Entered character is Special Symbols: " + c);
            }
        }


    }

    static boolean isAlphabet(char c) {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
    }

    static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }
}