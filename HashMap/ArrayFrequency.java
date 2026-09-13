import java.util.HashMap;

public class ArrayFrequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {

            frequency.put(
                num,
                frequency.getOrDefault(num, 0) + 1
            );
        }

        System.out.println("Element Frequencies:");

        for (int num : frequency.keySet()) {
            System.out.println(num + " : " + frequency.get(num));
        }
    }
}