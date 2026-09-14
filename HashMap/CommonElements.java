import java.util.HashSet;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {20, 40, 50, 60};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        System.out.println("Common Elements:");

        for (int num : arr2) {

            if (set.contains(num)) {
                System.out.println(num);
                set.remove(num);
            }
        }
    }
}