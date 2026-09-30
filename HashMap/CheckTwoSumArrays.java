import java.util.HashSet;

public class CheckTwoSumArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        if (set1.equals(set2)) {
            System.out.println("Both arrays contain the same elements");
        } else {
            System.out.println("Arrays are different");
        }
    }
}