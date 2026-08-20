import java.util.Scanner;

public class Probs79 {
    public static String toggleTheCase(String str) {
        if (str == null || str.isEmpty()) {
//            return "Given String is Empty or NULL"; instead this use below for good practices
            return str;
        }
        char[] arr = str.toCharArray();
        int i = 0;
        for (char ch : arr) {
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                ch = (char) (ch ^ ' ');
            }
            arr[i] = ch;
            i++;
        }
        return new String(arr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur String here !!!");
        String str = sc.nextLine();
        System.out.println("Here is Ur toggle String : "+toggleTheCase(str));
        sc.close();
    }
}
