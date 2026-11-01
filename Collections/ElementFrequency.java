import java.util.Collections;
import java.util.HashMap;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
