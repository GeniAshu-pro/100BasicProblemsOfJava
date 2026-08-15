import java.util.Scanner;

public class Probs69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String here !!");
        String str = sc.nextLine();
        String cleaned = str.replaceAll("[^A-Za-z]", "");
        int count = 0;
        int consonants = 0;
        int n = str.length();

        for (int i = 0 ; i<n ;i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            } else {
                consonants++;
            }
        }
        System.out.println("The Number of Vowels is : " + count);
        System.out.println("The Number of Consonants is : " + consonants);

    }
}




























//int vowels = 0;
//int consonants = 0;
//String cleaned = str.replaceAll("[^a-zA-Z]","");
//        for (char ch : cleaned.toLowerCase().toCharArray()) {
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//vowels++;
//        } else {
//consonants++;
//        }
//        }
//        System.out.println("Number of vowels: "+vowels);
//        System.out.println("Number of consonants: "+consonants);
//        sc.close();