
import java.util.Arrays;
import java.util.Scanner;



public class Probs76 {

    public static boolean isEqual( char [ ] arr1 ,char [ ]arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur first String here ");
        String str1 = sc.nextLine();
        System.out.println("Enter ur Second String here");
        String str2 = sc.nextLine();
        char [ ] arr1 =  str1.toCharArray();
        char [ ] arr2 =  str2.toCharArray();
        System.out.println(isEqual(arr1,arr2)?"Enter Strings isAnagram":"Enter String is Not a Anagram");

    }
}
