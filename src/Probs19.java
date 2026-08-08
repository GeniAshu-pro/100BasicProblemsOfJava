import java.util.Scanner;

public class Probs19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Yes it's Divisible");
        } else if (number % 3 != 0) {
            System.out.println("its Not divisible by 3");
        } else {
            System.out.println("Not divisible by 5");
        }
    }
}
