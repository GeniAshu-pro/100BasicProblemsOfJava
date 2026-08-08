import java.util.Scanner;

public class Probs20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur Age here!!");
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("Invalid Input ");
            return;
        }
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
        sc.close();

    }
}
