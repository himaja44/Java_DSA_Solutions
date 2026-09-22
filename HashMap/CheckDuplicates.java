import java.util.HashSet;

public class CheckDuplicates {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40};

        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for (int num : arr) {

            if (set.contains(num)) {
                duplicate = true;
                break;
            }

            set.add(num);
        }

        if (duplicate) {
            System.out.println("Duplicates Found");
        } else {
            System.out.println("No Duplicates");
        }
    }
}