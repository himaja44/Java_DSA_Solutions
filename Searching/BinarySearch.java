public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        int key = 40;
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at position: " + (mid + 1));
                found = true;
                break;
            }

            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (!found)
            System.out.println("Element not found");
    }
}