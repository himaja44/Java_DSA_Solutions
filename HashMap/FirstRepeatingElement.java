import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 3, 2, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                System.out.println("First repeating element: " + num);
                break;
            }

            set.add(num);
        }
    }
}