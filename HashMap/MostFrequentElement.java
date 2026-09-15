import java.util.HashMap;

public class MostFrequentElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 30, 20, 40, 30};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxElement = arr[0];
        int maxCount = 0;

        for (int num : map.keySet()) {

            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                maxElement = num;
            }
        }

        System.out.println("Most Frequent Element: " + maxElement);
        System.out.println("Frequency: " + maxCount);
    }
}