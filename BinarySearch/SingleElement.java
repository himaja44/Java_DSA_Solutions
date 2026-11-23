
public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            if (arr[mid] == arr[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        System.out.println("Single element: " + arr[left]);
    }
}
