import java.util.Scanner;

public class Probs73 {

    public static String toLowerCase(String str) {
        if (str == null || str.isEmpty()) {
//            return "Given String is Empty or NULL"; instead this use below for good practices
            return str;
        }
        char[] arr = new char[1000];
        int len = 0;

        try {
            while (true) {
                char c = str.charAt(len);
                if (c >= 'A' && c <= 'Z') {
                    c = (char) (c ^ ' ');
                }
                arr[len]=c;
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
          //  System.out.println();
        }
return new String(arr,0,len);
    }
    public static String toUpperCase(String str) {
        if (str == null || str.isEmpty()) {
//            return "Given String is Empty or NULL"; instead this use below for good practices
            return str;
        }
        char[] arr = new char[1000];
        int len = 0;

        try {
            while (true) {

                char c = str.charAt(len);
                if (c >= 'a' && c <= 'z') {
                    c = (char) (c ^ ' ');
                }
                arr[len]=c;
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
          //  System.out.println();
        }
        return new String(arr , 0,len);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur String here !!!");
        String str = sc.nextLine();
        System.out.println(toLowerCase(str));
        System.out.println(toUpperCase(str));
        sc.close();


//        try {
//            int i = 0;
//            for (char c : str.toCharArray()) {
//                if (c >= 'A' && c <= 'Z') {
//                    c = (char) (c ^ ' ');
//                }
//                System.out.print(c);
//
//            }
//        } catch (IndexOutOfBoundsException e) {
//
//        }


    }
}
