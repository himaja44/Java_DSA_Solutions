import java.util.HashSet;

public class SymmetricDifference {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        HashSet<Integer> result = new HashSet<>(set1);

        result.addAll(set2);

        HashSet<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);

        result.removeAll(common);

        System.out.println("Symmetric difference: " + result);
    }
}