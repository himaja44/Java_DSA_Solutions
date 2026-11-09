
public class SubarrayAverage {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        System.out.println((double) sum / k);

        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];

            double average = (double) sum / k;
            System.out.println(average);
        }
    }
}
