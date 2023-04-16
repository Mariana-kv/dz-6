import java.util.*;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr1 = {8, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) continue;
            sum += arr1[i];
        }
        System.out.println(sum);

        String str = "Alexx990";
        char[] arr2 = str.toCharArray();
        Set<Character> set = new HashSet<Character>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
