import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Probs74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String here !!");
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, (map.get(ch) + 1));
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map.entrySet());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        sc.close();
    }
}
