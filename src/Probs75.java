import java.util.Scanner;

public class Probs75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newString  =str.replaceAll(" ","");
        System.out.println(newString);
        sc.close();
    }
}
