import java.util.HashMap;

public class DuplicateElements {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate Elements:");

        for (int num : frequency.keySet()) {

            if (frequency.get(num) > 1) {
                System.out.println(num);
            }
        }
    }
}