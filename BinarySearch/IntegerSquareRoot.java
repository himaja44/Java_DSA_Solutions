
public class IntegerSquareRoot {
    public static void main(String[] args) {
        int number = 40;

        int left = 0;
        int right = number;
        int answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == 0 || mid <= number / mid) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Integer square root: " + answer);
    }
}
