import java.util.Scanner;

public class Probs71 {

    public static String reversedString(String str) {
        if (str == null || str.isEmpty()) {
//            return "Given String is Empty or NULL"; instead this use below for good practices
            return str;

        }

        char[] arr = str.toCharArray();


        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {

            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return new String(arr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String U Want to Reverse");
        String str = sc.nextLine();

        System.out.println(reversedString(str));
        sc.close();
    }
}
