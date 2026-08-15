import java.util.Scanner;

public class Probs68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String here !!");
        String str=sc.nextLine();
        int count = 0;
        try{
            while (true){
                str.charAt(count);
                        count++;
            }
        }catch (IndexOutOfBoundsException e){
          //  System.out.println("No use I just wanna count that's why");
        }
        System.out.println("Length of string is : "+count);
        sc.close();
        }
    }

