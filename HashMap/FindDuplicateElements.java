import java.util.HashSet;

public class FindDuplicateElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6, 2};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {

            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}