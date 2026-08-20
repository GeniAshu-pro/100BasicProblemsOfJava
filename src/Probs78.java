import java.util.Scanner;



public class Probs78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [ ] arr = str.toCharArray();
        char ch =0;
        int n = str.length();
        System.out.println("The First ");
        if((str != null && !str.isEmpty())){
            for(int i = 0 ; i<n ; i++){
                for(int j = 0 ; j<n ;j++){
                    if(arr[i]!=arr[j+1]){
                        ch = arr[i];
                        return;
                    }
                }
            }
        }
        System.out.println("Here is ur First Non-repeating Character: "+ch);
        sc.close();
    }
}
