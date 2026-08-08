import java.util.Scanner;
// here  We are solving Sum of all natural number
public class Probs21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number here ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
            System.out.println(sum);
        }

    }
}
